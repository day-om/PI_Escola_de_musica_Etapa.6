package Telas;

import Classes.Usuario;
import DAO.UsuarioDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        AtalhoAcessibilidade();
    }

    public void AtalhoAcessibilidade() {
        bt_enviar.setMnemonic(KeyEvent.VK_E);
        bt_limpar.setMnemonic(KeyEvent.VK_L);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        recebe_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        recebe_senha = new javax.swing.JTextField();
        bt_limpar = new javax.swing.JButton();
        bt_enviar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Preencha os dados que pedem na tela");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 81, 177));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setLabelFor(recebe_usuario);
        jLabel1.setText("Login");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        recebe_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recebe_usuario.setToolTipText("Preencha com seu usuário");
        recebe_usuario.setNextFocusableComponent(recebe_senha);
        jPanel2.add(recebe_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setLabelFor(recebe_senha);
        jLabel2.setText("Senha");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        recebe_senha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recebe_senha.setToolTipText("Preencha com sua senha");
        recebe_senha.setNextFocusableComponent(bt_enviar);
        jPanel2.add(recebe_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 240, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 300, 170));

        bt_limpar.setBackground(new java.awt.Color(51, 140, 233));
        bt_limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_limpar.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar.setText("Limpar");
        bt_limpar.setToolTipText("Clique para limpar os dados");
        bt_limpar.setNextFocusableComponent(recebe_usuario);
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });
        jPanel1.add(bt_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 100, 30));

        bt_enviar.setBackground(new java.awt.Color(51, 81, 177));
        bt_enviar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_enviar.setForeground(new java.awt.Color(255, 255, 255));
        bt_enviar.setText("Enviar");
        bt_enviar.setToolTipText("Clique para enviar os dados");
        bt_enviar.setNextFocusableComponent(bt_limpar);
        bt_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.250x250.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -40, -1, -1));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        UsuarioDAO conexao = new UsuarioDAO();
        String login = recebe_usuario.getText();
        String senha = recebe_senha.getText();

        Usuario usuario = conexao.validarLogin(login, senha);

        if (usuario != null) {

            int tipo = usuario.getTipoUsuario();
            Usuario usuariolog = new Usuario(login, senha, tipo);

            Usuario.setUsuarioLogado(usuariolog);

            switch (tipo) {
                case 1: {
                    Menu_inicial menu = new Menu_inicial(usuario);
                    menu.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido! Seja bem vindo(a) " + usuario.getLogin());
                    break;
                }
                case 2: {
                    Menu_inicial menu = new Menu_inicial(usuario);
                    menu.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido! Seja bem vindo(a) " + usuario.getLogin());
                    break;
                }
                case 3:
                    Menu_inicial menu = new Menu_inicial(usuario);
                    menu.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido! Seja bem vindo(a) " + usuario.getLogin());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de usuário não encontrado!");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
        }


    }//GEN-LAST:event_bt_enviarActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        recebe_usuario.setText("");
        recebe_senha.setText("");
        recebe_usuario.requestFocus();
    }//GEN-LAST:event_bt_limparActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enviar;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField recebe_senha;
    private javax.swing.JTextField recebe_usuario;
    // End of variables declaration//GEN-END:variables

}
