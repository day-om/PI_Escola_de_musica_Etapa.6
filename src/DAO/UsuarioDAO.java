package DAO;

import Classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    // SALVAR
    public int salvarUsuario(Usuario usuario) {
        int status;
        String sql = "INSERT INTO usuarios (login,senha,tipo_usuario) VALUES(?,?,?)";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getTipoUsuario());
            status = stmt.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    // CONSULTAR   
    public Usuario consultarUsuario(String nome) {
        String sql = "SELECT * from Usuarios WHERE login = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {
            Usuario usuario = new Usuario();

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt("idUsuarios"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipoUsuario(rs.getInt("tipo_usuario"));

                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    //LISTAR
    public List<Usuario> getUsuario(String consultaNome) {
        String sql = "SELECT * FROM Usuarios WHERE login LIKE ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + consultaNome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Usuario> listaUsuario = new ArrayList<>();

            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.setIdUsuario(rs.getInt("idUsuarios"));
                usuario.setLogin(rs.getString("Login"));
                usuario.setSenha(rs.getString("Senha"));
                usuario.setTipoUsuario(rs.getInt("Tipo_usuario"));

                listaUsuario.add(usuario);
            }
            return listaUsuario;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // VALIDAR LOGIN 
    public Usuario validarLogin(String login, String senha) {
        String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
        try ( Connection conn = Conexao.getConnection();  PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, login);
            stmt.setString(2, senha);

            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {

                int tipo = resultSet.getInt("tipo_usuario");
                return new Usuario(login, senha, tipo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
