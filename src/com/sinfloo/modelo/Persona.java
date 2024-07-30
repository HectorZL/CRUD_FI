
package com.sinfloo.modelo;

public class Persona {

    
    int id;
    String cedula;
    String nombre;
    String correo;
    String telefono;
    String rol;
    String direccion;
    
    public Persona() {
    }

    public Persona(int id,String cedula,String rol,String nombre, String correo, String telefono) {

        this.id = id;
        this.rol=rol;
        this.cedula=cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
