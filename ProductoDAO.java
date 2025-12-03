package com.papeleria.dao;

import com.papeleria.model.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.InputStream;

public class ProductoDAO {

    private Connection getConnection() throws Exception {
        Properties prop = new Properties();
        InputStream is = getClass().getClassLoader().getResourceAsStream("db.properties");
        prop.load(is);
        String url = prop.getProperty("db.url");
        String user = prop.getProperty("db.user");
        String pass = prop.getProperty("db.password");
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }

    public List<Producto> listarProductos() {
        List<Producto> lista = new ArrayList<>();
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM productos");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Producto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("cantidad"),
                        rs.getDouble("precio")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
