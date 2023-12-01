/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import View.Fornecedor;
import View.Funcionario;
import View.Estoque;
import View.MenuPrincipal;

/**
 *
 * @author Vinicius José
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    
    public void navegarParaCadastro(){
        
        Funcionario cadastro = new Funcionario();
        cadastro.setVisible(true);
}

    public void navegarParaFornecedor() {
        
        Fornecedor cadastro = new Fornecedor();
        cadastro.setVisible(true);
      
    }

    
    public void navegarParaEstoque() {
        
        Estoque estoque = new Estoque();
        estoque.setVisible(true);
      
    }

    public void navegarParaCadastroFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


      
    }
    
    


