/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author VINICIUS JOSE
 */
public class FuncionarioDAO {
    
    /**
     * Insere um usuario dentro do banco de dados
     * @param Funcionario exige que seja passado um objeto do tipo Funcionario
     */
    public void insert(Funcionario Funcionario){
        Banco.funcionario.add(Funcionario);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param funcionario
     * @return 
     */
    public boolean update(Funcionario funcionario){
        
        for (int i = 0; i < Banco.funcionario.size(); i++) {
            if(idSaoIguais(Banco.funcionario.get(i),funcionario)){
                Banco.funcionario.set(i, funcionario);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param funcionario
     * @return 
     */
    public boolean delete(Funcionario funcionario){
        for (Funcionario usuarioLista : Banco.funcionario) {
            if(idSaoIguais(usuarioLista,funcionario)){
                Banco.funcionario.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Funcionario> selectAll(){
        return Banco.funcionario;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param funcionario
     * @return Funcionario encontrado no banco de dados
     */
    public Funcionario selectPorNomeESenha(Funcionario funcionario){
        for (Funcionario FuncionarioLista : Banco.funcionario) {
            if(nomeESenhaSaoIguais(FuncionarioLista,funcionario)){
                return FuncionarioLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param funcionario
     * @param funcionarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(Funcionario funcionario, Funcionario funcionarioAPesquisar) {
        return funcionario.getNome().equals(funcionarioAPesquisar.getNome()) && funcionario.getSenha().equals(funcionarioAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param funcionario
     * @param funcionarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Funcionario funcionario, Funcionario FuncionarioAComparar) {
        return funcionario.getId() ==  FuncionarioAComparar.getId();
    }
    
    
    
}
