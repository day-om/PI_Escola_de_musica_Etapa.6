package Telas;

import Classes.Aula;
import Classes.Usuario;
import DAO.AulaDAO;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class aula_atualizar extends javax.swing.JFrame {

    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public aula_atualizar() {
        initComponents();
    }

    public aula_atualizar(Usuario usuarioLogado) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        bt_menu = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_atualizar = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        recebe_id_aula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        recebe_horario = new javax.swing.JComboBox<>();
        bt_pesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        recebe_data = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Preencha as informações abaixo  para cadastrar");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        bt_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu.setToolTipText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 30, 30));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, 30));

        jPanel5.setBackground(new java.awt.Color(51, 81, 177));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("ATUALIZAR AULA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        bt_atualizar.setBackground(new java.awt.Color(51, 81, 177));
        bt_atualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_atualizar.setForeground(new java.awt.Color(255, 255, 255));
        bt_atualizar.setText("Atualizar");
        bt_atualizar.setToolTipText("Cique para enviar as informações");
        bt_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_atualizarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 100, 30));

        bt_limpar.setBackground(new java.awt.Color(51, 140, 233));
        bt_limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_limpar.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar.setText("Limpar");
        bt_limpar.setToolTipText("Cique para limpar as informações");
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });
        jPanel1.add(bt_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 100, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aulas.80x57.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 81, 177));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("Escolha o(s) horário(s)");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recebe_id_aula.setToolTipText("Digite o ID da aula que deseja atualizar!");
        jPanel3.add(recebe_id_aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 410, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setLabelFor(recebe_horario);
        jLabel4.setText("NOVO HORÁRIO:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        recebe_horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANHÃ - 1°", "MANHÃ - 2°", "MANHÃ - 3°", "MANHÃ - 4°", "MANHÃ - 5°", "TARDE - 1°", "TARDE - 2°", "TARDE - 3°", "TARDE - 4°", "TARDE - 5°" }));
        recebe_horario.setToolTipText("Escolha o horário");
        jPanel3.add(recebe_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 140, -1));

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.setToolTipText("Clique para pesquisar a aula");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(bt_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID - AULA");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel3.add(recebe_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setLabelFor(recebe_data);
        jLabel3.setText("NOVA DATA:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 470, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        lista_aula aula = new lista_aula(usuarioLogado);
        aula.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    @SuppressWarnings("empty-statement")
    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
         int idAula = Integer.parseInt(recebe_id_aula.getText());;
         String data = recebe_data.getText();
         String h = (String) recebe_horario.getSelectedItem();
         int horario = 0;

         switch (h) {
             case "MANHÃ - 1°":
                 horario = 1;
                 break;
             case "MANHÃ - 2°":
                 horario = 2;
                 break;
             case "MANHÃ - 3°":
                 horario = 3;
                 break;
             case "MANHÃ - 4°":
                 horario = 4;
                 break;
             case "MANHÃ - 5°":
                 horario = 5;
                 break;
             case "TARDE - 1°":
                 horario = 6;
                 break;
             case "TARDE - 2°":
                 horario = 7;
                 break;
             case "TARDE - 3°":
                 horario = 8;
                 break;
             case "TARDE - 4°":
                 horario = 9;
                 break;
             case "TARDE - 5°":
                 horario = 10;
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Horário inválido");
                 return;
         }
         AulaDAO aula = new AulaDAO();
         aula.atualizarAula(data, horario, idAula);
         JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");

         recebe_id_aula.setText("");
         recebe_data.setText("");
         recebe_id_aula.requestFocus();

    }//GEN-LAST:event_bt_atualizarActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        int id;
        id = parseInt(recebe_id_aula.getText());

        AulaDAO dao = new AulaDAO();
        Aula aula = dao.consultarAula(id);

        if (aula == null) {
            JOptionPane.showMessageDialog(null, "Aula não localizada!");
        } else {
            JOptionPane.showMessageDialog(null, "Aula encontrada com sucesso! Pode atualizar dados!");
        }
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        recebe_id_aula.setText("");
        recebe_data.setText("");
        recebe_id_aula.requestFocus();
    }//GEN-LAST:event_bt_limparActionPerformed

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
            java.util.logging.Logger.getLogger(aula_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aula_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aula_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aula_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aula_atualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField recebe_data;
    private javax.swing.JComboBox<String> recebe_horario;
    private javax.swing.JTextField recebe_id_aula;
    // End of variables declaration//GEN-END:variables
}
