package DAO;

import Classes.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    //SALVAR
    public int salvarAluno(Aluno aluno) {
        int status;
        String sql = "INSERT INTO alunos (Nome,idade,CPF,pacote_aluno,nivel_aluno,instrumento_aluno) VALUES(?,?,?,?,?,?)";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getIdade());
            stmt.setString(3, aluno.getCpf());
            stmt.setInt(4, aluno.getPacote());
            stmt.setInt(5, aluno.getNivel());
            stmt.setInt(6, aluno.getInstrumento());
            status = stmt.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    //ATUALIZAR 
    public int atualizarAluno(int id, String nome, String idade, String cpf, int pacote, int nivel, int instrumento) {
        String sql = "UPDATE alunos SET nome = ?, idade = ?, cpf = ?, pacote_aluno = ?,nivel_aluno = ?, instrumento_aluno = ? WHERE idAlunos = ?";
        int status;
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, idade);
            stmt.setString(3, cpf);
            stmt.setInt(4, pacote);
            stmt.setInt(5, nivel);
            stmt.setInt(6, instrumento);
            stmt.setInt(7, id);

            status = stmt.executeUpdate();
            return status;

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }

    }
    //EXCLUIR

    public boolean excluirAluno(int id) {
        String sql = "DELETE FROM alunos WHERE idAlunos = ?";
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
    public Aluno consultarAluno(String nome) {
        String sql = "SELECT * from alunos WHERE nome = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            Aluno aluno = new Aluno();

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                aluno.setId(rs.getInt("idAlunos"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getString("idade"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setPacote(rs.getInt("pacote_aluno"));
                aluno.setNivel(rs.getInt("nivel_aluno"));
                aluno.setInstrumento(rs.getInt("instrumento_aluno"));
                return aluno;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    // LISTAR
    public List<Aluno> getAluno(String consultaNome) {
        String sql = "SELECT * FROM alunos WHERE nome LIKE ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + consultaNome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Aluno> listaAluno = new ArrayList<>();

            while (rs.next()) {
                Aluno aluno = new Aluno();

                aluno.setId(rs.getInt("idAlunos"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getString("idade"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setPacote(rs.getInt("pacote_aluno"));
                aluno.setNivel(rs.getInt("nivel_aluno"));
                aluno.setInstrumento(rs.getInt("instrumento_aluno"));

                listaAluno.add(aluno);

            }
            return listaAluno;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
