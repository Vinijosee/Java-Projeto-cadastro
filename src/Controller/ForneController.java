/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.ForneHelper;
import Model.DAO.FornecedorDAO;
import View.Fornecedor;
import java.util.ArrayList;
/**
 *
 * @author Vinicius José
 */
public class ForneController {
 
    private final Fornecedor view;
    private final ForneHelper helper;

    public ForneController(Fornecedor view) {
        this.view = view;
        this.helper = new ForneHelper(view);
    }
    
    public void atualizaTabela(){
        
        //Buscar lista com entregas do banco de dados
        FornecedorDAO FornecedorDAO = new FornecedorDAO();
        ArrayList<Model.Fornecedor> fornecedores = FornecedorDAO.selectAll();
        //Exibir esta lista na view
        helper.preencherTabela(fornecedores);
               
    }
    
    public void atualizaFornecedores(){
        
        //Buscar Fornecedores do Banco de Dados
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        ArrayList<Model.Fornecedor> fornecedores = fornecedorDAO.selectAll();                
        //Exibir fornecedores no combobox fornecedor
        helper.preencherForne(fornecedores);
        
    }   
    }
    



