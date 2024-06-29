package com.sinfloo.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String url = "jdbc:mysql://localhost:3306/nombre_base_datos";
    String user = "root";
    String pass = "";
    Connection con;

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
