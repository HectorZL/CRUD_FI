
package com.sinfloo.controlador;


import com.sinfloo.modelo.Persona;
import com.sinfloo.modelo.PersonaDAO;
import com.sinfloo.vista.RegistroUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorRegistro implements ActionListener {
    
    PersonaDAO dao = new PersonaDAO();
    Persona u = new Persona();
    RegistroUsuario vistaRegistro ;
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorRegistro(RegistroUsuario vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
        this.vistaRegistro.Btn_Registrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaRegistro.Btn_Registrar) {
            System.out.println("Botón de registro presionado");
            validarRegistro();
        }
    }

    private void validarRegistro() {
        String nombre = vistaRegistro.label_Nombre.getText();
        String cedula = vistaRegistro.label_Cedula.getText();
        String correo = vistaRegistro.label_Correo.getText();
        String telefono = vistaRegistro.label_Telefono.getText();
        String direccion = vistaRegistro.label_Direccion.getText();
        String rol = vistaRegistro.label_rol.getItemAt(0);
                
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Rol:"+rol);
        // Validar los campos
        if (nombre.isEmpty() || cedula.isEmpty() || correo.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(vistaRegistro, "Todos los campos son obligatorios");
            return;
        }

        // Registrar el usuario
        u.setNombre(nombre);
        u.setCedula(cedula);
        u.setCorreo(correo);
        u.setTelefono(telefono);
        u.setDireccion(direccion);
        u.setRol(rol);
        
        int resultado = dao.agregar(u);
        
        if (resultado == 1) {
            JOptionPane.showMessageDialog(vistaRegistro, "Usuario registrado con éxito");
        } else {
            JOptionPane.showMessageDialog(vistaRegistro, "Error al registrar el usuario");
        }
    }
}

            
        
    
    
    // private void validarRegistro() {
    //     System.out.println("llego a la accion de validar su funcion");
    //  String nombre = vistaRegistro.label_Nombre.getText();
    //  String cedula = vistaRegistro.label_Cedula.getText();
    //  String correo = vistaRegistro.label_Correo.getText();
    //  String telefono = vistaRegistro.label_Telefono.getText();
    //  String direccion = vistaRegistro.label_Direccion.getText();
 
    //  System.out.println("Nombre: " + nombre);
    //  System.out.println("Cedula: " + cedula);
    //  System.out.println("Correo: " + correo);
    //  System.out.println("Teléfono: " + telefono);
    //  System.out.println("Dirección: " + direccion);
 
    //  // Validar los campos
    //  if (nombre.isEmpty() || cedula.isEmpty() || correo.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
    //      JOptionPane.showMessageDialog(vistaRegistro, "Todos los campos son obligatorios");
    //  } else {
    //      // Registrar el usuario
    //      p.setNombre(nombre);
    //      p.setCedula(cedula);
    //      p.setCorreo(correo);
    //      p.setTelefono(telefono);
    //      p.setDireccion(direccion);
 
    //      int resultado = dao.agregar(p);
         
    //      if (resultado == 1) {
             
    //          JOptionPane.showMessageDialog(vistaRegistro, "Usuario registrado con éxito");
             
    //      } else {
             
    //          JOptionPane.showMessageDialog(vistaRegistro, "Error al registrar el usuario");
    //      }
    //  }


//}

