/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;





import View.Fornecedor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

 /* @author Vinicius José
 */

public class ForneHelper {
    
    private final Fornecedor view;

    public ForneHelper(Fornecedor view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Model.Fornecedor> fornecedores) {
        
        
        DefaultTableModel tableModel =  (DefaultTableModel) view.getTableFornecedor().getModel();
        tableModel.setNumRows(0);
        
        for (Model.Fornecedor fornecedor : fornecedores) {
            
            tableModel.addRow(new Object []{
                
                fornecedor.getId(),
                fornecedor.getNome(),
                fornecedor.getTelefone(),
                fornecedor.getEmail(),
                fornecedor.getEndereço(),
                fornecedor.getCnpj(),
                
            });
            
        }
        
         
    }

    public void preencherForne(ArrayList<Model.Fornecedor> fornecedores) {
        
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboboxForne().getModel();
       
        for (Model.Fornecedor fornecedor : fornecedores) {
            comboBoxModel.addElement(fornecedor);
        }
        
    }
    
    public Fornecedor obterFornecedor(){
        return(Fornecedor) view.getJComboboxForne().getSelectedItem();
    }
    
    



 
}
        
      
    

            
        




