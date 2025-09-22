package DAO;

import Classes.Adm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AdmDAO {

    // SALVAR
    public int salvarAdm(Adm adm) {
        int status;
        String sql = "INSERT INTO administradores (Nome,funcao_adm) VALUES(?,?)";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, adm.getNome());
            stmt.setInt(2, adm.getFuncao());
            status = stmt.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    //ATUALIZAR
    public void atualizarAdm(int id, String novoNome, int novaFuncao) {
        String sql = "UPDATE administradores SET nome = ?, funcao_adm = ? WHERE idAdministradores = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoNome);
            stmt.setInt(2, novaFuncao);
            stmt.setInt(3, id);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar o usuário.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados.");
        }
    }

    // EXCLUIR
    public boolean excluirAdm(int id) {
        String sql = "DELETE FROM administradores WHERE idAdministradores = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // CONSULTAR   
    public Adm consultarAdm(String nome) {
        String sql = "SELECT * from Administradores WHERE nome = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            Adm adm = new Adm();

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                adm.setId(rs.getInt("idAdministradores"));
                adm.setNome(rs.getString("nome"));
                adm.setFuncao(rs.getInt("funcao_adm"));

                return adm;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    //LISTAR
    public List<Adm> getAdm(String consultaNome) {
        String sql = "SELECT * FROM administradores WHERE nome LIKE ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + consultaNome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Adm> listaAdm = new ArrayList<>();

            while (rs.next()) {
                Adm adm = new Adm();

                adm.setId(rs.getInt("idAdministradores"));
                adm.setNome(rs.getString("nome"));
                adm.setFuncao(rs.getInt("funcao_adm"));

                listaAdm.add(adm);
            }
            return listaAdm;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
