/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.ForneController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;



/**
 *
 * @author Vinicius Jose
 */
public class Fornecedor extends javax.swing.JFrame {

    private final ForneController controller;

    /**
     * Creates new form Agenda
     */
    public Fornecedor() {
        initComponents();
        controller = new ForneController(this);
        iniciar();
    }

    public Fornecedor(int id, Fornecedor nome, String telefone, String email, String endereco, String cnpj, String observacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAgenda = new javax.swing.JLabel();
        LabelId = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        ID1 = new javax.swing.JTextField();
        ID2 = new javax.swing.JTextField();
        ID3 = new javax.swing.JTextField();
        ID6 = new javax.swing.JTextField();
        LabelCliente = new javax.swing.JLabel();
        LabelObservacao = new javax.swing.JLabel();
        LabelId1 = new javax.swing.JLabel();
        LabelId2 = new javax.swing.JLabel();
        LabelId4 = new javax.swing.JLabel();
        LabelId5 = new javax.swing.JLabel();
        JComboboxForne = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        ButtonAgendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFornecedor = new javax.swing.JTable();
        LabelAgendaPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelId3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelAgenda.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        LabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAgenda.setText("Cadastro Fornecedor");
        getContentPane().add(LabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 420, 60));

        LabelId.setForeground(new java.awt.Color(255, 255, 255));
        LabelId.setText("Endereço");
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 270, 40));
        getContentPane().add(ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 270, 40));
        getContentPane().add(ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 270, 40));

        ID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID3ActionPerformed(evt);
            }
        });
        getContentPane().add(ID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 270, 40));

        ID6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID6ActionPerformed(evt);
            }
        });
        getContentPane().add(ID6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 270, 40));

        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Fornecedor");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        LabelId1.setForeground(new java.awt.Color(255, 255, 255));
        LabelId1.setText("Email");
        getContentPane().add(LabelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        LabelId2.setForeground(new java.awt.Color(255, 255, 255));
        LabelId2.setText("CNPJ");
        getContentPane().add(LabelId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        LabelId4.setForeground(new java.awt.Color(255, 255, 255));
        LabelId4.setText("Id");
        getContentPane().add(LabelId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        LabelId5.setForeground(new java.awt.Color(255, 255, 255));
        LabelId5.setText("Telefone");
        getContentPane().add(LabelId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 366, 60, 20));

        JComboboxForne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboboxForneActionPerformed(evt);
            }
        });
        getContentPane().add(JComboboxForne, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 270, 40));

        TextObservacao.setColumns(20);
        TextObservacao.setRows(5);
        jScrollPane2.setViewportView(TextObservacao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 610, 280));

        ButtonAgendar.setBackground(new java.awt.Color(60, 233, 106));
        ButtonAgendar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar.setText("Cadastrar");
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 610, 50));

        TableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fornecedor", "Telefone", "Email", "Endereço", "CNPJ", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(TableFornecedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 1120, 220));

        LabelAgendaPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(LabelAgendaPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 1290, 800));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Fundo cadastro.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -35, 2130, 1430));

        LabelId3.setForeground(new java.awt.Color(255, 255, 255));
        LabelId3.setText("Id");
        getContentPane().add(LabelId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
      
         
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    private void ID6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID6ActionPerformed

    private void ID3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID3ActionPerformed

    private void JComboboxForneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboboxForneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboboxForneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField ID1;
    private javax.swing.JTextField ID2;
    private javax.swing.JTextField ID3;
    private javax.swing.JTextField ID6;
    private javax.swing.JComboBox<String> JComboboxForne;
    private javax.swing.JLabel LabelAgenda;
    private javax.swing.JLabel LabelAgendaPainelFundo;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelId1;
    private javax.swing.JLabel LabelId2;
    private javax.swing.JLabel LabelId3;
    private javax.swing.JLabel LabelId4;
    private javax.swing.JLabel LabelId5;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JTable TableFornecedor;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaFornecedores();
    }

    public JTable getTableFornecedor() {
        return TableFornecedor;
    }

    public void setTableFornecedor(JTable TableFornecedor) {
        this.TableFornecedor = TableFornecedor;
    }

    public JComboBox<String> getJComboboxForne() {
        return JComboboxForne;
    }

    public void setJComboboxForne(JComboBox<String> JComboboxForne) {
        this.JComboboxForne = JComboboxForne;
    }

 

    public JTextArea getTextObservacao() {
        return TextObservacao;
    }

    public void setTextObservacao(JTextArea TextObservacao) {
        this.TextObservacao = TextObservacao;
    }

    
    
    



}