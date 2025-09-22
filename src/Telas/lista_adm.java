package Telas;

import Classes.Adm;
import Classes.Usuario;
import DAO.AdmDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class lista_adm extends javax.swing.JFrame {

    Usuario usuarioLogado = Usuario.getUsuarioLogado();

    public lista_adm() {
        initComponents();
        preencherTabela();
    }

    lista_adm(Usuario usuarioLogado) {
        initComponents();
        preencherTabela();

    }

    private void preencherTabela() {
        AdmDAO dao = new AdmDAO();

        String nome = recebe_nome.getText();
        List<Adm> listaAdm = dao.getAdm(nome);

        DefaultTableModel tabelaAdm = (DefaultTableModel) mostra_consulta.getModel();
        tabelaAdm.setNumRows(0);

        mostra_consulta.setRowSorter(new TableRowSorter(tabelaAdm));
        if (listaAdm != null) {
            for (Adm c : listaAdm) {
                Object[] obj = new Object[]{
                    c.getId(),
                    c.getNome(),
                    c.getFuncao(),};
                tabelaAdm.addRow(obj);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista de administradores vazia!");
        }
    }

    private void excluirDoBanco(int id) {
        AdmDAO dao = new AdmDAO();

        boolean excluido = dao.excluirAdm(id);

        if (excluido) {
            JOptionPane.showMessageDialog(null, "Administrador excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o administrador.");
        }
    }

    private void excluirLinhaSelecionada() {

        int linhaSelecionada = mostra_consulta.getSelectedRow();

        if (linhaSelecionada != -1) {

            int idSelecionado = (int) mostra_consulta.getValueAt(linhaSelecionada, 0);

            int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esse item?",
                    "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {

                excluirDoBanco(idSelecionado);

                DefaultTableModel modeloTabela = (DefaultTableModel) mostra_consulta.getModel();
                modeloTabela.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostra_consulta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        bt_menu = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        recebe_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_excluir = new javax.swing.JButton();
        bt_atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("Tela de consulta de administradores cadastrados");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 81, 177));
        jLabel1.setText("ADMINISTRADORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostra_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "FUNÇÃO"
            }
        ));
        mostra_consulta.setToolTipText("Consultas");
        jScrollPane1.setViewportView(mostra_consulta);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 240));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 580, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100x100.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

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

        recebe_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebe_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(recebe_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 260, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 81, 177));
        jLabel2.setLabelFor(recebe_nome);
        jLabel2.setText("PESQUISAR POR NOME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        bt_excluir.setBackground(new java.awt.Color(255, 51, 51));
        bt_excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_excluir.setForeground(new java.awt.Color(255, 255, 255));
        bt_excluir.setText("EXCLUIR");
        bt_excluir.setToolTipText("Clique para excluir ");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });
        jPanel1.add(bt_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

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
        jPanel1.add(bt_atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        Menu_inicial menu = new Menu_inicial(usuarioLogado);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_menuActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        Cadastro_adm adm = new Cadastro_adm(usuarioLogado);
        adm.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void recebe_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebe_nomeActionPerformed
        preencherTabela();
    }//GEN-LAST:event_recebe_nomeActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        excluirLinhaSelecionada();

    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        adm_atualizar adm = new adm_atualizar(usuarioLogado);
        adm.setVisible(true);
        dispose();

    }//GEN-LAST:event_bt_atualizarActionPerformed

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
            java.util.logging.Logger.getLogger(lista_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Crbt_enviar display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista_adm().setVisible(true);
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mostra_consulta;
    private javax.swing.JTextField recebe_nome;
    // End of variables declaration//GEN-END:variables
}
