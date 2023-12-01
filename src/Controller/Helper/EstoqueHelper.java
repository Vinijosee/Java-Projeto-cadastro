/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import View.Estoque;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Vinicius José
 */

public class EstoqueHelper {
    
    private final Estoque view;

    public EstoqueHelper(Estoque view) {
        this.view = view;
    }


    public void preencherTabela(ArrayList<Model.Estoque> estoques) {
        
        
       DefaultTableModel tableModel =  (DefaultTableModel) view.getTableEstoque().getModel();
        
        
        for (Model.Estoque estoque : estoques) {
            
            tableModel.addRow(new Object []{
                
                estoque.getId(),
                estoque.getProduto(),
                estoque.getDescricao(),
                estoque.getQuantidade(),
                
              
            });
            
        }
        
         
    }

  

   
   
    }