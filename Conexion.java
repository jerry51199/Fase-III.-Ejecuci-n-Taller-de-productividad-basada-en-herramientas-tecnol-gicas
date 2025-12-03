package com.papeleria.dao;

import java.sql.*;
import java.util.Properties;
import java.io.InputStream;

public class Conexion {

    public static Connection getConnection() throws Exception {
        Properties prop = new Properties();
        InputStream is = Conexion.class.getClassLoader().getResourceAsStream("db.properties");
        prop.load(is);
        String url = prop.getProperty("db.url");
        String user = prop.getProperty("db.user");
        String pass = prop.getProperty("db.password");
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
}
