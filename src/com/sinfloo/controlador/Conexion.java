package com.sinfloo.controlador;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    private String url;
    private String user;
    private String pass;
    private Connection con;

    public Conexion() {
        cargarConfiguracion();
    }

    private void cargarConfiguracion() {
        Properties props = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            props.load(input);

            url = props.getProperty("db.url");
            user = props.getProperty("db.user");
            pass = props.getProperty("db.password");
        } catch (IOException ex) {
            System.out.println("Error al cargar el archivo de configuración");
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            // Para MySQL Connector/J 8.0 o superior, usa com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Clase Driver no encontrada");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
}
