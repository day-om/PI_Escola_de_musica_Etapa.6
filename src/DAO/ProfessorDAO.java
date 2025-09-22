package DAO;

import Classes.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProfessorDAO {

    //SALVAR
    public int salvarProf(Professor professor) {
        int status;
        String sql = "INSERT INTO professores (Nome,instrumento_professor) VALUES(?,?)";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getInstrumento());
            status = stmt.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    //ATUALIZAR
    public int atualizarProf(String nome, int instrumento, int idProf) {
        String sql = "UPDATE professores SET nome = ?, instrumento_professor = ? WHERE idProfessores = ?";
        int status;
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setInt(2, instrumento);
            stmt.setInt(3, idProf);

            status = stmt.executeUpdate();
            return status;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi atualizado!");
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }

    }
    //EXCLUIR

    public boolean excluirProf(int id) {
        String sql = "DELETE FROM professores WHERE idProfessores = ?";
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
    public Professor consultarProf(String nome) {
        String sql = "SELECT * from Professores WHERE nome = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            Professor prof = new Professor();

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                prof.setIdProfessor(rs.getInt("idProfessores"));
                prof.setNome(rs.getString("nome"));
                prof.setInstrumento(rs.getInt("instrumento_professor"));

                return prof;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    //LISTAR
    public List<Professor> getProfessor(String consultaNome) {
        String sql = "SELECT * FROM professores WHERE nome LIKE ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + consultaNome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Professor> listaProf = new ArrayList<>();

            while (rs.next()) {
                Professor prof = new Professor();

                prof.setIdProfessor(rs.getInt("idProfessores"));
                prof.setNome(rs.getString("nome"));
                prof.setInstrumento(rs.getInt("instrumento_professor"));

                listaProf.add(prof);

            }
            return listaProf;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
