package Telas;

import Classes.Aluno;
import Classes.Entrada;
import Classes.Usuario;
import DAO.AlunoDAO;
import DAO.EntradaDAO;
import DAO.UsuarioDAO;
import javax.swing.JOptionPane;

public class nova_entrada extends javax.swing.JFrame {

    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public nova_entrada() {
        initComponents();

    }

    nova_entrada(Usuario usuarioLogado) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_menu = new javax.swing.JButton();
        bt_perfil = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bt_menu1 = new javax.swing.JButton();
        bt_sair1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        recebe_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        recebe_data = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        recebe_valor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        forma_pagamento = new javax.swing.JComboBox<>();
        pesquisar_aluno = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        id_aluno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        recebe_aluno = new javax.swing.JTextField();
        id_usuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pesquisar_usuario = new javax.swing.JButton();
        bt_enviar = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_lista_entradas = new javax.swing.JButton();

        bt_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu.setToolTipText("Menu");

        bt_perfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_perfil.setForeground(new java.awt.Color(255, 255, 255));
        bt_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/do-utilizador.png"))); // NOI18N
        bt_perfil.setToolTipText("Perfil");

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Sair");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Preencha as informações abaixo para cadastrar entrada financeira");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_menu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu1.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu1.setToolTipText("Menu");
        bt_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menu1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, 30));

        bt_sair1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair1.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair1.setToolTipText("Voltar");
        bt_sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sair1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        jPanel5.setBackground(new java.awt.Color(51, 81, 177));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 20));

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setLabelFor(id_aluno);
        jLabel4.setText("ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 20, 20));

        recebe_usuario.setToolTipText("Digite o nome do usuário ");
        recebe_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebe_usuarioActionPerformed(evt);
            }
        });
        jPanel4.add(recebe_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setLabelFor(recebe_data);
        jLabel2.setText("DATA:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        recebe_data.setToolTipText("Digite a data da entrada");
        jPanel4.add(recebe_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setLabelFor(recebe_valor);
        jLabel1.setText("VALOR:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        recebe_valor.setToolTipText("Digite o valor da entrada");
        jPanel4.add(recebe_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setLabelFor(forma_pagamento);
        jLabel3.setText("FORMA DE PAGAMENTO:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        forma_pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESPÉCIE", "CARTÃO DE DÉBITO", "CARTÃO DE CRÉDITO", "PIX" }));
        forma_pagamento.setToolTipText("Escolha a forma de pagamento");
        jPanel4.add(forma_pagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        pesquisar_aluno.setText("Pesquisar");
        pesquisar_aluno.setToolTipText("Clique para pesquisar");
        pesquisar_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar_alunoActionPerformed(evt);
            }
        });
        jPanel4.add(pesquisar_aluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setLabelFor(recebe_usuario);
        jLabel7.setText("LOGIN - USUÁRIO");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel4.add(id_aluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 120, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setLabelFor(recebe_usuario);
        jLabel9.setText("ALUNO(A)");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        recebe_aluno.setToolTipText("Digite o nome do aluno que efetuou o pagamento");
        jPanel4.add(recebe_aluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 440, -1));
        jPanel4.add(id_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 100, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setLabelFor(id_usuario);
        jLabel10.setText("ID");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 20, 20));

        pesquisar_usuario.setText("Pesquisar");
        pesquisar_usuario.setToolTipText("Clique para pesquisar usuário");
        pesquisar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar_usuarioActionPerformed(evt);
            }
        });
        jPanel4.add(pesquisar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 480, 290));

        bt_enviar.setBackground(new java.awt.Color(51, 81, 177));
        bt_enviar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_enviar.setForeground(new java.awt.Color(255, 255, 255));
        bt_enviar.setText("Enviar");
        bt_enviar.setToolTipText("Cique para enviar as informações");
        bt_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 100, 30));

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
        jPanel1.add(bt_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 100, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/financeiro.80x57.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 81, 177));
        jLabel6.setText("ENTRADA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        bt_lista_entradas.setBackground(new java.awt.Color(51, 140, 233));
        bt_lista_entradas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_lista_entradas.setForeground(new java.awt.Color(255, 255, 255));
        bt_lista_entradas.setText("LISTA DE ENTRADAS");
        bt_lista_entradas.setToolTipText("Clique para acessar as entradas já cadastradas");
        bt_lista_entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lista_entradasActionPerformed(evt);
            }
        });
        jPanel1.add(bt_lista_entradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 62, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menu1ActionPerformed
        Menu_inicial menu = new Menu_inicial(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menu1ActionPerformed

    private void bt_sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sair1ActionPerformed
        menu_financeiro menu = new menu_financeiro(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sair1ActionPerformed

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        int aluno = Integer.parseInt(id_aluno.getText());
        String data = recebe_data.getText();
        Double valor = Double.parseDouble(recebe_valor.getText());
        String pag = (String) forma_pagamento.getSelectedItem();
        int usuario = Integer.parseInt(id_usuario.getText());
        int pagamento = 0;

        switch (pag) {
            case "ESPÉCIE":
                pagamento = 1;
                break;
            case "CARTÃO DE DÉBITO":
                pagamento = 2;
                break;
            case "CARTÃO DE CRÉDITO":
                pagamento = 3;
                break;
            case "PIX":
                pagamento = 4;
            default:
                JOptionPane.showMessageDialog(null, "Pagamento inválido");
                return;
        }

        Entrada entrada = new Entrada(data, valor, aluno, pagamento, usuario);

        EntradaDAO dao = new EntradaDAO();
        int resposta = dao.salvarEntrada(entrada);

        if (resposta == 1) {
            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso");

        } else if (resposta == 1062) {
            JOptionPane.showMessageDialog(null, "Erro no cadastrado");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados");

        }

        recebe_usuario.setText("");
        recebe_data.setText("");
        recebe_valor.setText("");
        recebe_aluno.setText("");
        id_usuario.setText("");
        id_aluno.setText("");
        recebe_usuario.requestFocus();

    }//GEN-LAST:event_bt_enviarActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        recebe_usuario.setText("");
        recebe_data.setText("");
        recebe_valor.setText("");
    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_lista_entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lista_entradasActionPerformed
        lista_entrada lista = new lista_entrada(usuarioLogado);
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_lista_entradasActionPerformed

    private void pesquisar_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_alunoActionPerformed
        String nome = recebe_aluno.getText().trim();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome do aluno para pesquisar.");
            return;
        }

        AlunoDAO dao = new AlunoDAO();
        Aluno aluno = dao.consultarAluno(nome);

        if (aluno == null) {
            JOptionPane.showMessageDialog(null, "Aluno não localizado!");
        } else {
            recebe_aluno.setText(aluno.getNome());
            id_aluno.setText(Integer.toString(aluno.getId()));
        }
    }//GEN-LAST:event_pesquisar_alunoActionPerformed

    private void recebe_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebe_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recebe_usuarioActionPerformed

    private void pesquisar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_usuarioActionPerformed
        String nome = recebe_usuario.getText().trim();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o login do usuário para pesquisar.");
            return;
        }

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = dao.consultarUsuario(nome);

        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "Usuário não localizado!");
        } else {
            recebe_usuario.setText(usuario.getLogin());
            id_usuario.setText(Integer.toString(usuario.getIdUsuario()));
        }
    }//GEN-LAST:event_pesquisar_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(nova_entrada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nova_entrada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nova_entrada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nova_entrada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new nova_entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enviar;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_lista_entradas;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_menu1;
    private javax.swing.JButton bt_perfil;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_sair1;
    private javax.swing.JComboBox<String> forma_pagamento;
    private javax.swing.JTextField id_aluno;
    private javax.swing.JTextField id_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton pesquisar_aluno;
    private javax.swing.JButton pesquisar_usuario;
    private javax.swing.JTextField recebe_aluno;
    private javax.swing.JTextField recebe_data;
    private javax.swing.JTextField recebe_usuario;
    private javax.swing.JTextField recebe_valor;
    // End of variables declaration//GEN-END:variables
}
