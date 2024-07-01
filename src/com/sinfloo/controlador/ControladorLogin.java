package com.sinfloo.controlador;

import com.sinfloo.modelo.Usuario;
import com.sinfloo.modelo.UsuarioDAO;
import com.sinfloo.vista.Dashboard;
import com.sinfloo.vista.Login;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ControladorLogin implements ActionListener {

    UsuarioDAO dao = new UsuarioDAO();
    Usuario u = new Usuario();
    Login vistaLogin = new Login();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorLogin(Login v) {
        this.vistaLogin = v;
        this.vistaLogin.Btn_login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaLogin.Btn_login) {
            validar();
        }
    }

    private void validar() {
        String user = vistaLogin.label_usuario.getText();
        // Suponiendo que 'vistaLogin' es tu instancia de la vista que contiene el JPasswordField
        char[] passwordChars = vistaLogin.label_contrasena.getPassword();
        String password = new String(passwordChars);

       
        
        if (user.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(vistaLogin, "Todos los campos son obligatorios");
            return;
        }

        Usuario usuario = dao.validarUsuario(user, password);
        
        if (usuario != null) {
            Dashboard dashboard = new Dashboard();
            ControladorDashboard controlDashboard = new ControladorDashboard(dashboard);
            dashboard.setVisible(true);
            dashboard.setLocationRelativeTo(null);
            vistaLogin.dispose();
        } else {
            JOptionPane.showMessageDialog(vistaLogin, "Usuario o contraseña incorrectos");
        }
    }
}