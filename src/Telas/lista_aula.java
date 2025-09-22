package Telas;

import Classes.Aula;
import Classes.Usuario;
import DAO.AlunoDAO;
import DAO.AulaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class lista_aula extends javax.swing.JFrame {

    public DefaultTableModel tabela;
    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public lista_aula() {
        initComponents();
        preencherTabela();
    }

    lista_aula(Usuario usuarioLogado) {
        initComponents();
        preencherTabela();
    }

    private void preencherTabela() {
        AulaDAO dao = new AulaDAO();

        String nome = recebe_nome.getText();
        List<Aula> listaAula = dao.getAula(nome);

        DefaultTableModel tabelaAula = (DefaultTableModel) mostra_consulta.getModel();
        tabelaAula.setNumRows(0);

        mostra_consulta.setRowSorter(new TableRowSorter(tabelaAula));
        if (listaAula != null) {
            for (Aula c : listaAula) {
                Object[] obj = new Object[]{
                    c.getId(),
                    c.getAluno(),
                    c.getHorario(),
                    c.getData()};
                tabelaAula.addRow(obj);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista de aulas vazia!");
        }
    }

    private boolean excluirDoBanco(int id) {
        AlunoDAO dao = new AlunoDAO();

        boolean excluido = dao.excluirAluno(id);

        if (excluido) {
            return true;
        } else {
            return false;
        }
    }

    private void excluirLinhaSelecionada() {
        int linhaSelecionada = mostra_consulta.getSelectedRow();
        if (linhaSelecionada != -1) {

            int idSelecionado = (int) mostra_consulta.getValueAt(linhaSelecionada, 0);

            int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esse item?",
                    "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {

                boolean excluidoComSucesso = excluirDoBanco(idSelecionado);

                if (excluidoComSucesso) {
                    DefaultTableModel modeloTabela = (DefaultTableModel) mostra_consulta.getModel();
                    modeloTabela.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(null, "Aula excluída com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível excluir esse aula, pois existem registros associados a ela.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_menu = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostra_consulta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        recebe_nome = new javax.swing.JTextField();
        bt_atualizar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(255, 255, 255));
        bt_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/casa.png"))); // NOI18N
        bt_menu.setToolTipText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 30, 30));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 30, 30));

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("AULAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostra_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ALUNO", "HORÁRIO", "DATA"
            }
        ));
        mostra_consulta.setToolTipText("Consultas");
        jScrollPane1.setViewportView(mostra_consulta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 240));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 550, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 81, 177));
        jLabel2.setLabelFor(recebe_nome);
        jLabel2.setText("PESQUISAR POR ALUNO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        recebe_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebe_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(recebe_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 260, -1));

        bt_atualizar.setBackground(new java.awt.Color(51, 140, 233));
        bt_atualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_atualizar.setForeground(new java.awt.Color(255, 255, 255));
        bt_atualizar.setText("ATUALIZAR");
        bt_atualizar.setToolTipText("Clique para acessar a tela de atualização");
        bt_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_atualizarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        bt_excluir.setBackground(new java.awt.Color(255, 51, 51));
        bt_excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_excluir.setForeground(new java.awt.Color(255, 255, 255));
        bt_excluir.setText("EXCLUIR");
        bt_excluir.setToolTipText("Clique para excluir");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });
        jPanel1.add(bt_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        menu_aula aula = new menu_aula(usuarioLogado);
        aula.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

    private void recebe_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebe_nomeActionPerformed
        preencherTabela();
    }//GEN-LAST:event_recebe_nomeActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        excluirLinhaSelecionada();
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        aula_atualizar aula = new aula_atualizar(usuarioLogado);
        aula.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_atualizarActionPerformed

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
            java.util.logging.Logger.getLogger(lista_aula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista_aula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista_aula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista_aula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista_aula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mostra_consulta;
    private javax.swing.JTextField recebe_nome;
    // End of variables declaration//GEN-END:variables
}
