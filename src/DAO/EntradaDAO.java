package DAO;

import Classes.Entrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntradaDAO {

    // SALVAR
    public int salvarEntrada(Entrada entrada) {
        int status;
        String sql = "INSERT INTO Financeiro_entrada (data,valor,aluno,Forma_pagamento,usuario) VALUES(?,?,?,?,?)";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, entrada.getData());
            stmt.setDouble(2, entrada.getValor());
            stmt.setInt(3, entrada.getAluno());
            stmt.setInt(4, entrada.getFormaPagamento());
            stmt.setInt(5, entrada.getUsuario());
            status = stmt.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    //EXCLUIR

    public boolean excluirEntrada(int id) {
        String sql = "DELETE FROM financeiro_entrada WHERE idFinanceiro_entrada = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //LISTAR

    public List<Entrada> getEntrada(String consultaNome) {

        String sql = "SELECT * FROM financeiro_entrada WHERE data LIKE ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + consultaNome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Entrada> listaEntrada = new ArrayList<>();

            while (rs.next()) {
                Entrada entrada = new Entrada();

                entrada.setId(rs.getInt("idFinanceiro_entrada"));
                entrada.setData(rs.getString("data"));
                entrada.setValor(rs.getDouble("valor"));
                entrada.setAluno(rs.getInt("aluno"));
                entrada.setFormaPagamento(rs.getInt("forma_pagamento"));
                entrada.setUsuario(rs.getInt("usuario"));

                listaEntrada.add(entrada);

            }
            return listaEntrada;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
