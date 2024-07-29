package com.sinfloo.modelo;

import com.sinfloo.controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Persona p = new Persona();

    public List<Persona> listar() {
        
        List<Persona> datos = new ArrayList<>();
        
        String sql = "SELECT * FROM Persona";
        
        try {
            
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Persona p = new Persona();
                p.setId(rs.getInt(1));
                p.setCedula(rs.getInt(2));
                p.setNombre(rs.getString(3));
                p.setCorreo(rs.getString(4));
                p.setTelefono(rs.getString(5));
                //p.setRol(rs.getString(6));
                datos.add(p);
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        } finally {
            
            try {
                
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
                
            } catch (SQLException e) {
                
                e.printStackTrace();
                
            }
        }
        
        return datos;
    }

    public int agregar(Persona per) {
        
        int r = 0;
        
        String sql = "INSERT INTO Persona(Cedula,Nombre,Correo,Telefono,Rol) VALUES (?, ?, ?)";
        
        try {
            
            con = conectar.getConnection();
            
            ps = con.prepareStatement(sql);
            
                p.setId(rs.getInt(1));
                p.setCedula(rs.getInt(2));
                p.setNombre(rs.getString(3));
                p.setCorreo(rs.getString(4));
                p.setTelefono(rs.getString(5));
                p.setRol(rs.getString(6));
                
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        } finally {
            
            try {
                
                if (ps != null) ps.close();
                if (con != null) con.close();
                
            } catch (SQLException e) {
                
                e.printStackTrace();
                
            }
            
        }
        
        return r;
        
    }

    public int actualizar(Persona per) {
        
        int r = 0;
        
        String sql = "UPDATE Persona SET Cedula = ?, Nombre = ?, Correo = ?, Telefono = ? WHERE id = ?";
        
        try {
            
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            
            p.setId(rs.getInt(1));
            p.setCedula(rs.getInt(2));
            p.setNombre(rs.getString(3));
            p.setCorreo(rs.getString(4));
            p.setTelefono(rs.getString(5));
            //p.setRol(rs.getString(6));
            
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        } finally {
            
            try {
                
                if (ps != null) ps.close();
                if (con != null) con.close();
                
            } catch (SQLException e) {
                
                e.printStackTrace();
                
            }
            
        }
        
        return r;
    }

    public int eliminar(int id) {
        
        int r = 0;
        
        String sql = "DELETE FROM Persona WHERE id = ?";
        
        try {
            
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            
            e.printStackTrace();
            
        } finally {
            
            try {
                
                if (ps != null) ps.close();
                if (con != null) con.close();
                
            } catch (SQLException e) {
                
                e.printStackTrace();
                
            }
        }
        
        return r;
    }
}
