package Telas;

import Classes.Saida;
import Classes.Usuario;
import DAO.AlunoDAO;
import DAO.SaidaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class lista_saida extends javax.swing.JFrame {

    public DefaultTableModel tabela;
    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public lista_saida() {
        initComponents();
        preencherTabela();
    }

    lista_saida(Usuario usuarioLogado) {
        initComponents();
        preencherTabela();
    }

    private void preencherTabela() {
        SaidaDAO dao = new SaidaDAO();

        String nome = recebe_nome.getText();
        List<Saida> listaSaidas = dao.getSaida(nome);

        DefaultTableModel tabelaSaidas = (DefaultTableModel) mostra_saidas.getModel();
        tabelaSaidas.setNumRows(0);

        mostra_saidas.setRowSorter(new TableRowSorter(tabelaSaidas));
        if (listaSaidas != null) {
            for (Saida c : listaSaidas) {
                Object[] obj = new Object[]{
                    c.getId(),
                    c.getDescricao(),
                    c.getData(),
                    c.getValor(),
                    c.getUsuario()
                };
                tabelaSaidas.addRow(obj);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista de saídas vazia!");
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
        int linhaSelecionada = mostra_saidas.getSelectedRow();
        if (linhaSelecionada != -1) {

            int idSelecionado = (int) mostra_saidas.getValueAt(linhaSelecionada, 0);

            int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esse item?",
                    "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {

                boolean excluidoComSucesso = excluirDoBanco(idSelecionado);

                if (excluidoComSucesso) {
                    DefaultTableModel modeloTabela = (DefaultTableModel) mostra_saidas.getModel();
                    modeloTabela.removeRow(linhaSelecionada);
                    JOptionPane.showMessageDialog(null, "Saída excluído com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível excluir essa saída, pois existem registros associados a ela.");
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
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostra_saidas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        recebe_nome = new javax.swing.JTextField();
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
        jPanel1.add(bt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 30, 30));

        bt_sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(255, 255, 255));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartao-de-endereco.png"))); // NOI18N
        bt_sair.setToolTipText("Voltar");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 30, 30));

        jPanel4.setBackground(new java.awt.Color(51, 81, 177));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("SAÍDAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostra_saidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "DATA", "VALOR", "USUÁRIO"
            }
        ));
        jScrollPane1.setViewportView(mostra_saidas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 280));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 560, 280));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 81, 177));
        jLabel2.setLabelFor(recebe_nome);
        jLabel2.setText("PESQUISAR POR DATA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        recebe_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebe_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(recebe_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 260, -1));

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
        jPanel1.add(bt_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        nova_saida menu = new nova_saida(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void recebe_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebe_nomeActionPerformed
        preencherTabela();
    }//GEN-LAST:event_recebe_nomeActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        excluirLinhaSelecionada();
    }//GEN-LAST:event_bt_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(lista_saida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista_saida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista_saida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista_saida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista_saida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTable mostra_saidas;
    private javax.swing.JTextField recebe_nome;
    // End of variables declaration//GEN-END:variables
}
