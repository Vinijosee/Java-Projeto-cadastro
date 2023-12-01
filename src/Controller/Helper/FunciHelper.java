/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import View.Funcionario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Vinicius José
 */
public class FunciHelper {

    private final Funcionario view;

    public FunciHelper(Funcionario view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Model.Funcionario> funcionarios) {

        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableFuncionarios().getModel();
        tableModel.setNumRows(0);
        
        //pecorrer a lista preenchendo o table model
        
        for (Model.Funcionario funcionario : funcionarios) {
            
            tableModel.addRow(new Object []{
                
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getNivelAcesso(),
                funcionario.getEmail(),
                funcionario.getDataFormatada(),
                funcionario.getRg(),
                funcionario.getTelefone()
            });
            
        }

    }
}

    
 

    

   
    
    

