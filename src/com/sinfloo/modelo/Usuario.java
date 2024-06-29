
package com.sinfloo.modelo;

public class Usuario {
    int id_user;
    String nombre;
    String apellido;
    String rol;
    String contrasena;
    String user;
            
    public Usuario(){
        
    }

    public Usuario(int id_user, String nombre, String apellido, String rol, String contrasena, String user) {
        this.id_user = id_user;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.contrasena = contrasena;
        this.user = user;
    }

    

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
