package Telas;

import Classes.Usuario;

/**
 *
 * @author dayan
 */
public class Cadastro_professores extends javax.swing.JFrame {

    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public Cadastro_professores() {
        initComponents();

    }

    Cadastro_professores(Usuario usuarioLogado) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt_novoCadastro = new javax.swing.JButton();
        bt_conultarCadastro = new javax.swing.JButton();
        bt_menu = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("Escolha um dos botões abaixo para continuar");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 81, 177));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("PROFESSOR(A)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 81, 177));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_novoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_novoCadastro.setForeground(new java.awt.Color(51, 81, 177));
        bt_novoCadastro.setText("Novo cadastro");
        bt_novoCadastro.setToolTipText("Clique para realizar novo cadastro");
        bt_novoCadastro.setNextFocusableComponent(bt_conultarCadastro);
        bt_novoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(bt_novoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 72, 330, 30));

        bt_conultarCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_conultarCadastro.setForeground(new java.awt.Color(51, 81, 177));
        bt_conultarCadastro.setText("Consultar cadastro");
        bt_conultarCadastro.setToolTipText("Cilque para consultar cadastros já existentes");
        bt_conultarCadastro.setNextFocusableComponent(bt_novoCadastro);
        bt_conultarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_conultarCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(bt_conultarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 330, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 390, 240));

        bt_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu.setToolTipText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        jPanel2.add(bt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel2.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 30, 30));

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 700, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.80x57.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        menu_cadastrar menu = new menu_cadastrar(usuarioLogado);
        menu.setVisible(true);
        dispose();

    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_novoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoCadastroActionPerformed
        novo_professor novo = new novo_professor(usuarioLogado);
        novo.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_novoCadastroActionPerformed

    private void bt_conultarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_conultarCadastroActionPerformed
        lista_professor consulta = new lista_professor(usuarioLogado);
        consulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_conultarCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_professores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_professores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_professores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_professores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_professores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_conultarCadastro;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_novoCadastro;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
