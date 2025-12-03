package com.papeleria.dao;

import com.papeleria.model.Usuario;
import java.sql.*;

public class UsuarioDAO {

    public Usuario validarUsuario(String usuario, String password) {
        Usuario u = null;
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "SELECT * FROM usuarios WHERE usuario=? AND password=?")) {
            ps.setString(1, usuario);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rs.getString("rol")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
}
