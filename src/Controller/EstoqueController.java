/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.EstoqueHelper;
import Model.DAO.EstoqueDAO;
import View.Estoque;
import java.util.ArrayList;

/**
 *
 * @author Vinicius José
 */
public class EstoqueController {
 

    private final Estoque view;
    private final EstoqueHelper helper;

    public EstoqueController(Estoque view) {
        this.view = view;
        this.helper = new EstoqueHelper(view);
    }

   
   public void atualizaTabela(){
        
        //Buscar lista com entregas do banco de dados
        EstoqueDAO EstoqueDAO = new EstoqueDAO();
        ArrayList<Model.Estoque> estoques = EstoqueDAO.selectAll();
        //Exibir esta lista na view
        helper.preencherTabela(estoques);
        
        
    }
}

