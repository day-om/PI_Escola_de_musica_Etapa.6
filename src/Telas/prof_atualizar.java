package Telas;

import Classes.Professor;
import Classes.Usuario;
import DAO.ProfessorDAO;
import javax.swing.JOptionPane;

public class prof_atualizar extends javax.swing.JFrame {

    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public prof_atualizar() {
        initComponents();
    }

    public prof_atualizar(Usuario usuarioLogado) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        novo_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        recebe_instrumento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        recebe_nome = new javax.swing.JTextField();
        bt_pesquisar = new javax.swing.JButton();
        recebe_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bt_atualizar = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        bt_menu = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Preencha as informações abaixo  para cadastrar");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("ATUALIZAR PROFESSOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 81, 177));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("Escolha o(s) horário(s)");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setLabelFor(recebe_nome);
        jLabel2.setText("NOME:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        novo_nome.setToolTipText("Digite o nome do professor(a)");
        jPanel3.add(novo_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 450, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setLabelFor(recebe_instrumento);
        jLabel3.setText("INSTRUMENTO:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        recebe_instrumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teclado", "Violão", "Flauta" }));
        recebe_instrumento.setToolTipText("Escolha o instrumento");
        jPanel3.add(recebe_instrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setLabelFor(novo_nome);
        jLabel4.setText("NOVO NOME:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel3.add(recebe_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, -1));

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.setToolTipText("Clique para pesquisar professor");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(bt_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel3.add(recebe_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setLabelFor(recebe_id);
        jLabel5.setText("ID:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 510, 250));

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
        jPanel1.add(bt_atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 110, 30));

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
        jPanel1.add(bt_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 100, 30));

        bt_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu.setToolTipText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 30));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, 30));

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.80x57.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        String nome = novo_nome.getText();
        String instru = (String) recebe_instrumento.getSelectedItem();
        int instrumento = 0;
        int idProf = Integer.parseInt(recebe_id.getText());;

        if (nome.isEmpty() || instru.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
            return;
        }
        if (!nome.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "No campo (NOME) insira apenas letras!");
            return;
        }

        switch (instru) {
            case "Teclado":
                instrumento = 1;
                break;
            case "Violão":
                instrumento = 2;
                break;
            case "Flauta":
                instrumento = 3;
                break;

            default:
                JOptionPane.showMessageDialog(null, "Instrumento inválido");
                return;
        }

        ProfessorDAO dao = new ProfessorDAO();
        dao.atualizarProf(nome, instrumento, idProf);

        novo_nome.setText("");
        recebe_nome.setText("");
        recebe_id.setText("");
        recebe_nome.requestFocus();


    }//GEN-LAST:event_bt_atualizarActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        novo_nome.setText("");
        recebe_nome.setText("");
        recebe_id.setText("");
        recebe_nome.requestFocus();

    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        lista_professor professor = new lista_professor(usuarioLogado);
        professor.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        String nome = recebe_nome.getText().trim();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome do professor para pesquisar.");
            return;
        }

        ProfessorDAO dao = new ProfessorDAO();
        Professor prof = dao.consultarProf(nome);

        if (prof == null) {
            JOptionPane.showMessageDialog(null, "Professor não localizado!");
        } else {
            recebe_id.setText(Integer.toString(prof.getIdProfessor()));
            JOptionPane.showMessageDialog(null, "Professor encontrado com sucesso! Pode atualizar dados!");
        }
    }//GEN-LAST:event_bt_pesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(prof_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prof_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prof_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prof_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prof_atualizar().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField novo_nome;
    private javax.swing.JTextField recebe_id;
    private javax.swing.JComboBox<String> recebe_instrumento;
    private javax.swing.JTextField recebe_nome;
    // End of variables declaration//GEN-END:variables
}
