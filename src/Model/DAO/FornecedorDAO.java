/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class FornecedorDAO {
    
    
    /**
     * Insere um cliente dentro do banco de dados
     * @param fornecedor exige que seja passado um objeto do tipo Fornecedor
     */
    public void insert(Fornecedor fornecedor){
        Banco.fornecedor.add(fornecedor);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param fornecedor
     * @return 
     */
    public boolean update(Fornecedor fornecedor){
        
        for (int i = 0; i < Banco.fornecedor.size(); i++) {
            if(idSaoIguais(Banco.fornecedor.get(i),fornecedor)){
                Banco.fornecedor.set(i, fornecedor);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param fornecedor
     * @return 
     */
    public boolean delete(Fornecedor fornecedor){
        for (Fornecedor fornecedorLista : Banco.fornecedor) {
            if(idSaoIguais(fornecedorLista,fornecedor)){
                Banco.fornecedor.remove(fornecedorLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Fornecedor> selectAll(){
        return Banco.fornecedor;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param fornecedor
     * @param fornecedorAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Fornecedor fornecedor, Fornecedor fornecedorAComparar) {
        return fornecedor.getId() ==  fornecedorAComparar.getId();
    }


}
