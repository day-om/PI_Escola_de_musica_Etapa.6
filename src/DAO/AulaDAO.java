package DAO;

import Classes.Aula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AulaDAO {

    //SALVAR
    public int salvarAula(Aula aula) {
        int status;
        String sql = "INSERT INTO aulas (aluno,horario,data) VALUES(?,?,?)";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, aula.getAluno());
            stmt.setInt(2, aula.getHorario());
            stmt.setString(3, aula.getData());
            status = stmt.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    //ATUALIZAR
    public int atualizarAula(String data, int horario, int idAula) {
        String sql = "UPDATE aulas SET data = ?, horario = ? WHERE idAulas = ?";
        int status;
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, data);
            stmt.setInt(2, horario);
            stmt.setInt(3, idAula);

            status = stmt.executeUpdate();
            return status;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi atualizado!");
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }

    }
    //EXCLUIR

    public boolean excluirAula(int id) {
        String sql = "DELETE FROM aulas WHERE idAulas = ?";
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
    public Aula consultarAula(int id) {
        String sql = "SELECT * from aulas WHERE idAulas = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            Aula aula = new Aula();

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                aula.setId(rs.getInt("idAulas"));
                aula.setAluno(rs.getInt("aluno"));
                aula.setData(rs.getString("data"));
                aula.setHorario(rs.getInt("horario"));

                return aula;

            } else {
                return null;
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    // LISTAR
    public List<Aula> getAula(String consultaNome) {
        String sql = "SELECT * FROM aulas WHERE aluno LIKE ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + consultaNome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Aula> listaAula = new ArrayList<>();

            while (rs.next()) {
                Aula aula = new Aula();

                aula.setId(rs.getInt("idAulas"));
                aula.setAluno(rs.getInt("aluno"));
                aula.setHorario(rs.getInt("horario"));
                aula.setData(rs.getString("data"));

                listaAula.add(aula);

            }
            return listaAula;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
