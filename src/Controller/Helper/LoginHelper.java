/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Funcionario;
import View.Login;

/**
 *
 * @author Vinicius Jose
 */
public class LoginHelper  {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Funcionario obterModelo(){
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();       
        Funcionario modelo = new Funcionario(0, nome, senha);
        return modelo;
    }
    
    public void setarModelo(Funcionario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
    
}
