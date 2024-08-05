
package com.sinfloo.controlador;


import com.sinfloo.modelo.Persona;
import com.sinfloo.modelo.PersonaDAO;
import com.sinfloo.vista.RegistroUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

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
        this.vistaRegistro.Btn_Regresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaRegistro.Btn_Registrar) {
            validarRegistro();
        } else{
            vistaRegistro.dispose();
        }
    }

    private void validarRegistro() {
        
        String nombre = vistaRegistro.label_Nombre.getText();
        String cedula = vistaRegistro.label_Cedula.getText();
        String correo = vistaRegistro.label_Correo.getText();
        String telefono = vistaRegistro.label_Telefono.getText();
        String direccion = vistaRegistro.label_Direccion.getText();
        String rol = vistaRegistro.label_rol.getItemAt(0);
                
        
        // Validar los campos
        if (nombre.isEmpty() || cedula.isEmpty() || correo.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(vistaRegistro, "Todos los campos son obligatorios");
            return;
        }
        // Validar correo electrónico
            if (!validarCorreo(correo)) {
                JOptionPane.showMessageDialog(vistaRegistro, "El correo electrónico no tiene un formato válido");
                return;
            }

            // Validar número de celular
            if (!validarTelefono(telefono)) {
                JOptionPane.showMessageDialog(vistaRegistro, "El número de celular debe tener 10 dígitos");
                return;
            }

            // Validar número de cédula
            if (!validarCedula(cedula)) {
                JOptionPane.showMessageDialog(vistaRegistro, "Número de cédula no válido");
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
    private boolean validarCorreo(String correo) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(correo).matches();
    }

    private boolean validarTelefono(String telefono) {
        return telefono.matches("\\d{10}");
    }

    private boolean validarCedula(String cedula) {
    // Verifica que la cédula tenga exactamente 10 dígitos y que todos sean números
    if (cedula.length() != 10 || !cedula.matches("\\d+")) {
        return false;
    }

    // Verifica el código de la provincia
    int provinciaCode = Integer.parseInt(cedula.substring(0, 2));
    if (provinciaCode < 1 || provinciaCode > 24) { // Se asume que el código de provincia válido es entre 1 y 24
        return false;
    }

    // Convertir la cédula a un arreglo de enteros
    int[] cedulaArray = new int[10];
    for (int i = 0; i < 10; i++) {
        cedulaArray[i] = Integer.parseInt(cedula.substring(i, i + 1));
    }

    // Calcular la suma para el dígito verificador
    int suma = 0;
    for (int i = 0; i < 9; i += 2) {
        int multiplicacion = cedulaArray[i] * 2;
        if (multiplicacion > 9) {
            multiplicacion -= 9;
        }
        suma += multiplicacion;
    }
    for (int i = 1; i < 8; i += 2) {
        suma += cedulaArray[i];
    }

    // Calcular el dígito verificador
    int digitoVerificador = (10 - (suma % 10)) % 10;
    return digitoVerificador == cedulaArray[9];
}
}



            
        
