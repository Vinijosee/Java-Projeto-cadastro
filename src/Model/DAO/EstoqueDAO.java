/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Estoque;
import java.util.ArrayList;

/**
 *
 * @author Vinicius Jose
 */
public class EstoqueDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param estoque exige que seja passado um objeto do tipo estoque
     */
    public void insert(Estoque estoque){
        Banco.estoque.add(estoque);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param estoque
     * @return 
     */
    public boolean update(Estoque estoque){
        
        for (int i = 0; i < Banco.estoque.size(); i++) {
            if(idSaoIguais(Banco.estoque.get(i),estoque)){
                Banco.estoque.set(i, estoque);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do estoque passado
     * @param estoque
     * @return 
     */
    public boolean delete(Estoque estoque){
        for (Estoque estoqueLista : Banco.estoque) {
            if(idSaoIguais(estoqueLista,estoque)){
                Banco.estoque.remove(estoqueLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Estoque> selectAll(){
        return Banco.estoque;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param estoque
     * @param estoqueAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Estoque estoque, Estoque estoqueAComparar) {
        return estoque.getId() ==  estoqueAComparar.getId();
    }
    
}
