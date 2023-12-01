/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.FunciHelper;
import Model.DAO.FuncionarioDAO;
import View.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Vinicius José
 */
public class FunciController {
 

    private final Funcionario view;
    private final FunciHelper helper;

    public FunciController(Funcionario view) {
        this.view = view;
        this.helper = new FunciHelper(view);
    }
    
    public void atualizaTabela(){
        
        //Buscar lista com entregas do banco de dados
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        ArrayList<Model.Funcionario> funcionarios = funcionarioDAO.selectAll();
        //Exibir esta lista na view
        helper.preencherTabela(funcionarios);
        
        
    }      
}
