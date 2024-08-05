package com.sinfloo.controlador;

import com.sinfloo.vista.RegistroUsuario;
import com.sinfloo.vista.view_user2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ControladorViewUser implements ActionListener {

    view_user2 vistausuario;
    RegistroUsuario registroUsuario = new RegistroUsuario();
    
    public ControladorViewUser(view_user2 vistausuario) {
        this.vistausuario = vistausuario;
        this.vistausuario.Btn_Registrar_Usuario.addActionListener(this);
        this.vistausuario.Btn_Editar_Usuario.addActionListener(this);
        this.vistausuario.Btn_Eliminar_Usuario.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == vistausuario.Btn_Registrar_Usuario) {
//            RegistroUsuario vRegistro = new RegistroUsuario();
//            ControladorRegistro conRegistro = new ControladorRegistro(vRegistro);
//            vRegistro.setVisible(true);
//            vistausuario.dispose();
             ControladorRegistro conRegistro = new ControladorRegistro(registroUsuario, null);
            registroUsuario.setVisible(true);
            vistausuario.dispose();
            
        } 
    
    }   
}