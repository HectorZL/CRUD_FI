package com.sinfloo.controlador;

import com.sinfloo.modelo.Persona;
import com.sinfloo.modelo.PersonaDAO;
import com.sinfloo.vista.Dashboard;
import com.sinfloo.vista.RegistroUsuario;
import com.sinfloo.vista.view_user2;
// import com.sinfloo.vista.RegistroUsuario;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorDashboard implements ActionListener {

    PersonaDAO dao = new PersonaDAO();
    Persona p = new Persona();
    Dashboard vdashborad = new Dashboard();
    //RegistroUsuario registroUsuario = new RegistroUsuario();
    view_user2 vusuario = new view_user2();
    
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorDashboard(Dashboard v) {
        this.vdashborad = v;
        this.vdashborad.Btn_Factura.addActionListener(this);
        this.vdashborad.Btn_Producto.addActionListener(this);
        this.vdashborad.Btn_Usuario.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vdashborad.Btn_Factura) {
           // limpiarTabla();
        //    listar(vista.tabla);
           // nuevo();
        }
        if (e.getSource() == vdashborad.Btn_Usuario) {
//            Dashboard dashboard = new Dashboard();
//            ControladorDashboard controlDashboard = new ControladorDashboard(dashboard);
//            vusuario.setVisible(true);
//            vusuario.setLocationRelativeTo(null);
            
          ControladorViewUser conVU = new ControladorViewUser(vusuario);
          vusuario.setVisible(true);
          vdashborad.dispose();

            
        //    add();
     //       listar(vista.tabla);
         //   nuevo();
        }
//        if (e.getSource() == vista.btnEditar) {
//            int fila = vista.tabla.getSelectedRow();
//            if (fila == -1) {
//                JOptionPane.showMessageDialog(vista, "Debee Seleccionar Una fila..!!");
//            } else {
//                int id = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());
//                String nom = (String) vista.tabla.getValueAt(fila, 1);
//                String correo = (String) vista.tabla.getValueAt(fila, 2);
//                String tel = (String) vista.tabla.getValueAt(fila, 3);
//                vista.txtId.setText("" + id);
//                vista.txtNom.setText(nom);
//                vista.txtCorreo.setText(correo);
//                vista.txtTel.setText(tel);
//            }
//        }
//        if (e.getSource() == vista.btnActualizar) {
//            Actualizar();
//            listar(vista.tabla);
//            nuevo();
//
//        }
//        if (e.getSource() == vista.btnDelete) {
//            delete();
//            listar(vista.tabla);
//            nuevo();
//        }
//        if (e.getSource() == vista.btnNuevo) {
//            nuevo();
//        }
//
//    }
//
//    void nuevo() {
//        vista.txtId.setText("");
//        vista.txtNom.setText("");
//        vista.txtTel.setText("");
//        vista.txtCorreo.setText("");
//        vista.txtNom.requestFocus();
//    }
//
//    public void delete() {
//        int fila = vista.tabla.getSelectedRow();
//        if (fila == -1) {
//            JOptionPane.showMessageDialog(vista, "Debe Seleccionar una Fila...!!!");
//        } else {
//            int id = Integer.parseInt((String) vista.tabla.getValueAt(fila, 0).toString());
//            dao.eliminar(id);
//            System.out.println("El Reusltaod es" + id);
//            JOptionPane.showMessageDialog(vista, "Usuario Eliminado...!!!");
//        }
//        limpiarTabla();
//    }
//
//    public void add() {
//        String nom = vista.txtNom.getText();
//        String correo = vista.txtCorreo.getText();
//        String tel = vista.txtTel.getText();
//        p.setNom(nom);
//        p.setCorreo(correo);
//        p.setTelefono(tel);
//        int r = dao.agregar(p);
//        if (r == 1) {
//            JOptionPane.showMessageDialog(vista, "Usuario Agregado con Exito.");
//        } else {
//            JOptionPane.showMessageDialog(vista, "Error");
//        }
//        limpiarTabla();
//    }
//
//    public void Actualizar() {
//        if (vista.txtId.getText().equals("")) {
//            JOptionPane.showMessageDialog(vista, "No se Identifica el Id debe selecionar la opcion Editar");
//        } else {
//            int id = Integer.parseInt(vista.txtId.getText());
//            String nom = vista.txtNom.getText();
//            String correo = vista.txtCorreo.getText();
//            String tel = vista.txtTel.getText();
//            p.setId(id);
//            p.setNom(nom);
//            p.setCorreo(correo);
//            p.setTelefono(tel);
//            int r = dao.actualizar(p);
//            if (r == 1) {
//                JOptionPane.showMessageDialog(vista, "Usuario Actualizado con Exito.");
//            } else {
//                JOptionPane.showMessageDialog(vista, "Error");
//            }
//        }
//        limpiarTabla();
//    }
//
//    public void listar(JTable tabla) {
//        limpiarTabla();
//        centrarCeldas(tabla);
//        modelo = (DefaultTableModel) tabla.getModel();
//        tabla.setModel(modelo);
//        List<Persona> lista = dao.listar();
//        Object[] objeto = new Object[4];
//        for (int i = 0; i < lista.size(); i++) {
//            objeto[0] = lista.get(i).getId();
//            objeto[1] = lista.get(i).getNom();
//            objeto[2] = lista.get(i).getCorreo();
//            objeto[3] = lista.get(i).getTelefono();
//            modelo.addRow(objeto);
//        }
//        tabla.setRowHeight(35);
//        tabla.setRowMargin(10);
//
//    }
//
//    void centrarCeldas(JTable tabla) {
//        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
//        tcr.setHorizontalAlignment(SwingConstants.CENTER);
//        for (int i = 0; i < vista.tabla.getColumnCount(); i++) {
//            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
//        }
//    }
//
//    void limpiarTabla() {
//        for (int i = 0; i < vista.tabla.getRowCount(); i++) {
//            modelo.removeRow(i);
//            i = i - 1;
//        }
//    }
}

    


}
