/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.FuncionarioDAO;
import Model.Funcionario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Vinicius Jose
 */
public class LoginController {

    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    
    
    
    public void entrarNoSistema(){
    
        //Pegar um  funcionario da View
        Funcionario funcionario = helper.obterModelo();
        
       
       //Pesquisa funcionario no Banco
       FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
       Funcionario funcionarioAutenticado = funcionarioDAO.selectPorNomeESenha(funcionario);
       
       if(funcionarioAutenticado != null){
           MenuPrincipal menu = new MenuPrincipal();
           menu.setVisible(true);
           this.view.dispose();
       }else{
           view.exibeMensagem("Usuario ou senha invalidos");
       }
       ////Se o funcionario da view tiver mesmo usuario e senha que o usuario vindo do banco direcionar para menu principal
       //Senão mostrar uma mensagem ao usuario "Usuario ou senha invalidos"
    }
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
      
    }
    
}
