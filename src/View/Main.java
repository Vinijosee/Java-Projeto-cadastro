/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Model.Fornecedor;
import Model.Estoque;
import Model.Funcionario;

/**
 *
 * @author Vinicius Jose
 */
public class Main {
    
    
     public static void main(String[] args){
     
         String nome = "vinicius";
         System.out.println(nome);
         
         Estoque estoque = new Estoque(0, nome, nome, 0);
         
         System.out.println(estoque.getDescricao());
         System.out.println(estoque.getQuantidade());
         
         
         Fornecedor fornecedor = new Fornecedor(1, "vinicius", "rua teste", "92531214545");
         System.out.println(fornecedor.getNome());
         
         Funcionario funcionario = new Funcionario(1, "gerente", "senha");
         System.out.println(funcionario.getNome());
         
         
         
     }
    
    
    
}
