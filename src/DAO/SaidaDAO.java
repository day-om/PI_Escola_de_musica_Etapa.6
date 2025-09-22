package DAO;

import Classes.Saida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SaidaDAO {

    //SALVAR
    public int salvarSaida(Saida saida) {
        int status;
        String sql = "INSERT INTO Financeiro_saida (descricao,data,valor,usuario) VALUES(?,?,?,?)";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, saida.getDescricao());
            stmt.setString(2, saida.getData());
            stmt.setDouble(3, saida.getValor());
            stmt.setInt(4, saida.getUsuario());
            status = stmt.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    //EXCLUIR
    public boolean excluirSaida(int id) {
        String sql = "DELETE FROM financeiro_saida WHERE idFinanceiro_saida = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {;

            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //LISTAR
    public List<Saida> getSaida(String consultaNome) {
        String sql = "SELECT * FROM financeiro_saida WHERE data LIKE ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + consultaNome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Saida> listaSaida = new ArrayList<>();

            while (rs.next()) {
                Saida saida = new Saida();

                saida.setId(rs.getInt("idFinanceiro_saida"));
                saida.setDescricao(rs.getString("descricao"));
                saida.setData(rs.getString("data"));
                saida.setValor(rs.getDouble("valor"));
                saida.setUsuario(rs.getInt("usuario"));

                listaSaida.add(saida);

            }
            return listaSaida;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
