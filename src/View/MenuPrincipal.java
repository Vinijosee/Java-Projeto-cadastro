/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.MenuPrincipalController;

/**
 *
 * @author Vinicius Jose
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOperacao = new javax.swing.JMenu();
        MenuItemAgenda = new javax.swing.JMenuItem();
        MenuItemServico1 = new javax.swing.JMenuItem();
        MenuCadastro = new javax.swing.JMenu();
        MenuItemUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/o-que-e-um-epi-equipamento-de-protecao-individual.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1200, 630));

        MenuOperacao.setText("Cadastro");
        MenuOperacao.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N

        MenuItemAgenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/agenda32-icon.png"))); // NOI18N
        MenuItemAgenda.setText("  Funcionario");
        MenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgendaActionPerformed(evt);
            }
        });
        MenuOperacao.add(MenuItemAgenda);

        MenuItemServico1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemServico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/cliente32-icon.png"))); // NOI18N
        MenuItemServico1.setText("  Fornecedor");
        MenuItemServico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemServico1ActionPerformed(evt);
            }
        });
        MenuOperacao.add(MenuItemServico1);

        jMenuBar1.add(MenuOperacao);

        MenuCadastro.setText("Estoque");
        MenuCadastro.setActionCommand("Cadastro  ");
        MenuCadastro.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N

        MenuItemUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/package_117564.png"))); // NOI18N
        MenuItemUsuario.setText("Estoque");
        MenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUsuarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemUsuario);

        jMenuBar1.add(MenuCadastro);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgendaActionPerformed
        this.controller.navegarParaCadastro();
    }//GEN-LAST:event_MenuItemAgendaActionPerformed

    private void MenuItemServico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemServico1ActionPerformed
        this.controller.navegarParaFornecedor();
    }//GEN-LAST:event_MenuItemServico1ActionPerformed

    private void MenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUsuarioActionPerformed
        this.controller.navegarParaEstoque();
    }//GEN-LAST:event_MenuItemUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuItemAgenda;
    private javax.swing.JMenuItem MenuItemServico1;
    private javax.swing.JMenuItem MenuItemUsuario;
    private javax.swing.JMenu MenuOperacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
