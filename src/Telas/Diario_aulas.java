package Telas;

import Classes.Aluno;
import Classes.Diario;
import Classes.Usuario;
import DAO.AlunoDAO;
import DAO.DiarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class Diario_aulas extends javax.swing.JFrame {

    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public Diario_aulas(Usuario usuario) {
        initComponents();
    }

    public Diario_aulas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        recebe_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bt_pesquisar = new javax.swing.JButton();
        recebe_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        recebe_data = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        recebe_presenca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        recebe_descricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        recebe_desempenho = new javax.swing.JComboBox<>();
        bt_enviar = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        bt_registros = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Escolha um dos botões abaixo para continuar");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("REGISTRO DE AULA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 81, 177));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("Escolha o(s) horário(s)");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setLabelFor(recebe_id);
        jLabel3.setText("ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 20, 20));

        recebe_nome.setToolTipText("Digite o nome do aluno(a)");
        jPanel3.add(recebe_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 410, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setLabelFor(recebe_presenca);
        jLabel4.setText("PRESENÇA:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.setToolTipText("Clique para pesquisar o aluno no banco de dados");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(bt_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        recebe_id.setToolTipText("Id do aluno");
        recebe_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebe_idActionPerformed(evt);
            }
        });
        jPanel3.add(recebe_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 70, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setLabelFor(recebe_nome);
        jLabel5.setText("ALUNO(A):");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        recebe_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebe_dataActionPerformed(evt);
            }
        });
        jPanel3.add(recebe_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setLabelFor(recebe_desempenho);
        jLabel6.setText("DESEMPENHO:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        recebe_presenca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presença", "Falta" }));
        jPanel3.add(recebe_presenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setLabelFor(recebe_data);
        jLabel7.setText("DATA:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel3.add(recebe_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 410, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setLabelFor(recebe_descricao);
        jLabel8.setText("DESCRIÇÃO DA AULA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        recebe_desempenho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Com dificuldade.", "Regular", "Foi muito bem!" }));
        jPanel3.add(recebe_desempenho, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 470, 280));

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
        jPanel1.add(bt_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 100, 30));

        bt_limpar.setBackground(new java.awt.Color(51, 140, 233));
        bt_limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_limpar.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar.setText("Limpar");
        bt_limpar.setToolTipText("Cique para limpar as informações");
        jPanel1.add(bt_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 100, 30));

        bt_registros.setBackground(new java.awt.Color(51, 140, 233));
        bt_registros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_registros.setForeground(new java.awt.Color(255, 255, 255));
        bt_registros.setText("REGISTROS");
        bt_registros.setToolTipText("Clique para visualizar os registros de aula já realizados");
        bt_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrosActionPerformed(evt);
            }
        });
        jPanel1.add(bt_registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 30, 30));

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        String nome = recebe_nome.getText();

        AlunoDAO alunoDAO = new AlunoDAO();
        // Consulta pelo nome
        Aluno aluno = alunoDAO.consultarAluno(nome);
        if (aluno == null) {
            JOptionPane.showMessageDialog(null, "Aluno não localizado!");
        } else {
            recebe_nome.setText(aluno.getNome());
            recebe_id.setText(String.valueOf(aluno.getId()));
        }

    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void recebe_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebe_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recebe_idActionPerformed

    private void recebe_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebe_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recebe_dataActionPerformed

    private void bt_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviarActionPerformed
        try {
            // --- CAPTURA DOS DADOS ---
            String alunoStr = recebe_id.getText().trim();
            String data = recebe_data.getText().trim();
            String presenca = (String) recebe_presenca.getSelectedItem();
            String descricao = recebe_descricao.getText().trim();
            String desempenho = (String) recebe_desempenho.getSelectedItem();

            // --- VALIDAÇÕES ---
            if (alunoStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo ID do aluno não pode estar vazio!");
                recebe_id.requestFocus();
                return;
            }

            int aluno;
            try {
                aluno = Integer.parseInt(alunoStr);
                if (aluno <= 0) {
                    JOptionPane.showMessageDialog(null, "O ID do aluno deve ser um número positivo!");
                    recebe_id.requestFocus();
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID do aluno inválido. Insira apenas números!");
                recebe_id.requestFocus();
                return;
            }

            if (data.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo DATA não pode estar vazio!");
                recebe_data.requestFocus();
                return;
            }

            // Validação simples de data (formato dd/MM/yyyy)
            if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
                JOptionPane.showMessageDialog(null, "A DATA deve estar no formato dd/MM/yyyy!");
                recebe_data.requestFocus();
                return;
            }

            if (presenca == null || presenca.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Selecione uma opção para PRESENÇA!");
                recebe_presenca.requestFocus();
                return;
            }

            if (descricao.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo DESCRIÇÃO não pode estar vazio!");
                recebe_descricao.requestFocus();
                return;
            }

            if (desempenho == null || desempenho.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Selecione uma opção para DESEMPENHO!");
                recebe_desempenho.requestFocus();
                return;
            }

            // --- CRIAÇÃO DO OBJETO ---
            Diario diario = new Diario(aluno, data, presenca, descricao, desempenho);

            // --- SALVANDO NO BANCO ---
            DiarioDAO dao = new DiarioDAO();
            int resposta = dao.salvarRegistro(diario);

            if (resposta == 1) {
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
                recebe_id.setText("");
                recebe_data.setText("");
                recebe_descricao.setText("");
                recebe_presenca.setSelectedIndex(0);
                recebe_desempenho.setSelectedIndex(0);
                recebe_id.requestFocus();

            } else if (resposta == 1062) {
                JOptionPane.showMessageDialog(null, "Já existe um registro com esse ID!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_bt_enviarActionPerformed

    private void bt_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrosActionPerformed
        lista_registros lista = new lista_registros();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_registrosActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        Menu_inicial login = new Menu_inicial(usuarioLogado);
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

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
            java.util.logging.Logger.getLogger(Diario_aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diario_aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diario_aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diario_aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diario_aulas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enviar;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_registros;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField recebe_data;
    private javax.swing.JTextField recebe_descricao;
    private javax.swing.JComboBox<String> recebe_desempenho;
    private javax.swing.JTextField recebe_id;
    private javax.swing.JTextField recebe_nome;
    private javax.swing.JComboBox<String> recebe_presenca;
    // End of variables declaration//GEN-END:variables
}
