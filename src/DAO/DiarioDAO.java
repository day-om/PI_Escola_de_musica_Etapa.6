package DAO;

import Classes.Diario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DiarioDAO {

    //SALVAR
    public int salvarRegistro(Diario aula) {
        int status;
        String sql = "INSERT INTO diario (aluno,data,presenca,descricao,desempenho) VALUES(?,?,?,?,?)";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, aula.getAluno());
            stmt.setString(2, aula.getData());
            stmt.setString(3, aula.getPresenca());
            stmt.setString(4, aula.getDescricao_aula());
            stmt.setString(5, aula.getDesempenho());
            status = stmt.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    //ATUALIZAR
    public int atualizarDiario(String data, String presenca, String descricao, String desempenho, int aluno, int idDiario) {
        String sql = "UPDATE diario SET data = ?, presenca = ?, descricao = ?,desempenho = ?, aluno = ? WHERE idDiario = ?";
        int status;
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, data);
            stmt.setString(2, presenca);
            stmt.setString(3, descricao);
            stmt.setString(4, desempenho);
            stmt.setInt(5, aluno);
            stmt.setInt(6, idDiario);

            status = stmt.executeUpdate();
            return status;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi atualizado!");
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }

    }
    //EXCLUIR

    public boolean excluirRegistros(int id) {
        String sql = "DELETE FROM diario WHERE idDiario = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //CONSULTAR
    public Diario consultarRegistro(int id) {
        String sql = "SELECT * from diario WHERE idDiario = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            Diario diario = new Diario();

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                diario.setId(rs.getInt("idDiario"));
                diario.setAluno(rs.getInt("aluno"));
                diario.setData(rs.getString("data"));
                diario.setPresenca(rs.getString("presenca"));
                diario.setDescricao_aula(rs.getString("descricao"));
                diario.setDesempenho(rs.getString("desempenho"));

                return diario;

            } else {
                return null;
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    //LISTAR
    public List<Diario> getRegistro(String consultaNome) {
        String sql = "SELECT * FROM diario WHERE data LIKE ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + consultaNome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Diario> listaRegistro = new ArrayList<>();

            while (rs.next()) {
                Diario diario = new Diario();

                diario.setId(rs.getInt("idDiario"));
                diario.setAluno(rs.getInt("aluno"));
                diario.setData(rs.getString("data"));
                diario.setPresenca(rs.getString("presenca"));
                diario.setDescricao_aula(rs.getString("descricao"));
                diario.setDesempenho(rs.getString("desempenho"));

                listaRegistro.add(diario);

            }
            return listaRegistro;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
