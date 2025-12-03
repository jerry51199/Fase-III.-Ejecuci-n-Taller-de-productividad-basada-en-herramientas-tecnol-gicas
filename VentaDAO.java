package com.papeleria.dao;

import com.papeleria.model.Venta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VentaDAO {

    public void registrarVenta(Venta v) {
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "INSERT INTO ventas(producto_id, cantidad, total, fecha) VALUES(?,?,?,?)")) {
            ps.setInt(1, v.getProductoId());
            ps.setInt(2, v.getCantidad());
            ps.setDouble(3, v.getTotal());
            ps.setDate(4, new java.sql.Date(v.getFecha().getTime()));
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Venta> listarVentas() {
        List<Venta> lista = new ArrayList<>();
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM ventas");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new Venta(
                        rs.getInt("id"),
                        rs.getInt("producto_id"),
                        rs.getInt("cantidad"),
                        rs.getDouble("total"),
                        rs.getDate("fecha")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
