package Telas;

import Classes.Aluno;
import Classes.Usuario;
import DAO.AlunoDAO;
import javax.swing.JOptionPane;

public class aluno_atualizar extends javax.swing.JFrame {

    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public aluno_atualizar() {
        initComponents();
    }

    public aluno_atualizar(Usuario usuarioLogado) {
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
        recebe_idade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        recebe_cpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        recebe_pacote = new javax.swing.JComboBox<>();
        recebe_instrumento = new javax.swing.JComboBox<>();
        recebe_nivel = new javax.swing.JComboBox<>();
        recebe_nome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bt_pesquisar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        recebe_id = new javax.swing.JTextField();
        bt_atualizar = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bt_menu = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Preencha as informações abaixo para cadastrar");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("ATUALIZAR ALUNO(A)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 81, 177));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setLabelFor(novo_nome);
        jLabel2.setText("NOVO NOME:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        novo_nome.setToolTipText("Digite o nome do aluno(a)");
        jPanel3.add(novo_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 430, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setLabelFor(recebe_idade);
        jLabel3.setText("IDADE:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        recebe_idade.setToolTipText("Digite a idade do aluno(a)");
        jPanel3.add(recebe_idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setLabelFor(recebe_cpf);
        jLabel4.setText("CPF:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        recebe_cpf.setToolTipText("Digite o cpf do aluno(a)");
        jPanel3.add(recebe_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 250, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setLabelFor(recebe_pacote);
        jLabel5.setText("PACOTE DE AULAS");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setLabelFor(recebe_instrumento);
        jLabel6.setText("INSTRUMENTO:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setLabelFor(recebe_nivel);
        jLabel7.setText("NÍVEL:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        recebe_pacote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 aulas semanais", "5 aulas semanais" }));
        recebe_pacote.setToolTipText("Escolha o pacote de aulas");
        recebe_pacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebe_pacoteActionPerformed(evt);
            }
        });
        jPanel3.add(recebe_pacote, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        recebe_instrumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teclado", "Violão", "Flauta" }));
        recebe_instrumento.setToolTipText("Escolha o instrumento");
        jPanel3.add(recebe_instrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        recebe_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iniciante", "Intermediário", "Avançado" }));
        recebe_nivel.setToolTipText("Escolha o nível");
        jPanel3.add(recebe_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        recebe_nome.setToolTipText("Digite o nome do administrador");
        jPanel3.add(recebe_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 270, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setLabelFor(recebe_nome);
        jLabel10.setText("NOME:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.setToolTipText("Clique para pesquisar o aluno");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(bt_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setLabelFor(recebe_id);
        jLabel11.setText("ID:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));
        jPanel3.add(recebe_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 480, 310));

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
        jPanel1.add(bt_atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 100, 30));

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
        jPanel1.add(bt_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 100, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.80x57.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        bt_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu.setToolTipText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 30, 30));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 30));

        jPanel5.setBackground(new java.awt.Color(51, 81, 177));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void recebe_pacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebe_pacoteActionPerformed

    }//GEN-LAST:event_recebe_pacoteActionPerformed

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        String nome = novo_nome.getText();
        String idade = recebe_idade.getText();
        String cpf = recebe_cpf.getText();
        String pct = (String) recebe_pacote.getSelectedItem();
        String instru = (String) recebe_instrumento.getSelectedItem();
        String niv = (String) recebe_nivel.getSelectedItem();
        int pacote = 0;
        int instrumento = 0;
        int nivel = 0;
        int idAluno = Integer.parseInt(recebe_id.getText());

        if (nome.isEmpty() || idade.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
            return;
        }
        if (!nome.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "No campo (NOME) insira apenas letras!");
            return;
        }
        if (!idade.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "No campo (IDADE) insira apenas números!");
            return;
        }
        if (!cpf.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}")) {
            JOptionPane.showMessageDialog(null, "Formato de CPF inválido. Use os pontos e traço corretamente.");
            return;
        }

        switch (pct) {
            case "3 aulas semanais":
                pacote = 1;
                break;
            case "5 aulas semanais":
                pacote = 2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pacote inválido");
                return;
        }

        switch (niv) {
            case "Iniciante":
                nivel = 1;
                break;
            case "Intermediário":
                nivel = 2;
                break;
            case "Avançado":
                nivel = 3;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nível inválido");
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

        AlunoDAO adm = new AlunoDAO();
        adm.atualizarAluno(idAluno, nome, idade, cpf, pacote, nivel, instrumento);
        JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso!");

        recebe_nome.setText("");
        recebe_id.setText("");
        recebe_idade.setText("");
        recebe_cpf.setText("");
        novo_nome.requestFocus();

    }//GEN-LAST:event_bt_atualizarActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        novo_nome.setText("");
        recebe_idade.setText("");
        recebe_cpf.setText("");
        novo_nome.requestFocus();
    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        lista_aluno aluno = new lista_aluno(usuarioLogado);
        aluno.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        String nome;
        nome = recebe_nome.getText();

        AlunoDAO dao = new AlunoDAO();
        Aluno aluno = dao.consultarAluno(nome);

        if (aluno == null) {
            JOptionPane.showMessageDialog(null, "Aluno não localizado!");
        } else {
            recebe_nome.setText(aluno.getNome());
            recebe_id.setText(Integer.toString(aluno.getId()));
            JOptionPane.showMessageDialog(null, "Aluno encontrado com sucesso! Digite os novos dados!");
        }
    }//GEN-LAST:event_bt_pesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(aluno_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aluno_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aluno_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aluno_atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aluno_atualizar().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField novo_nome;
    private javax.swing.JTextField recebe_cpf;
    private javax.swing.JTextField recebe_id;
    private javax.swing.JTextField recebe_idade;
    private javax.swing.JComboBox<String> recebe_instrumento;
    private javax.swing.JComboBox<String> recebe_nivel;
    private javax.swing.JTextField recebe_nome;
    private javax.swing.JComboBox<String> recebe_pacote;
    // End of variables declaration//GEN-END:variables
}
