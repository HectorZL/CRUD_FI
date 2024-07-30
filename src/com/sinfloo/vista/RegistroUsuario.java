
package com.sinfloo.vista;

import com.sinfloo.controlador.ControladorRegistro;

public class RegistroUsuario extends javax.swing.JFrame {

    
    public RegistroUsuario() {
        initComponents();
    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_contrasena = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_Cedula = new javax.swing.JTextField();
        label_Nombre = new javax.swing.JTextField();
        label_Correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_Telefono = new javax.swing.JTextField();
        label_Direccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Btn_Registrar = new javax.swing.JButton();
        label_rol = new javax.swing.JComboBox<>();
        Rol = new javax.swing.JLabel();

        label_contrasena.setBackground(new java.awt.Color(217, 217, 217));
        label_contrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("CEDULA :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE USUARIO");

        jLabel4.setText("NOMBRE :");

        jLabel5.setText("CORREO  :");

        label_Cedula.setBackground(new java.awt.Color(217, 217, 217));
        label_Cedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_CedulaActionPerformed(evt);
            }
        });

        label_Nombre.setBackground(new java.awt.Color(217, 217, 217));
        label_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        label_Correo.setBackground(new java.awt.Color(217, 217, 217));
        label_Correo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_CorreoActionPerformed(evt);
            }
        });

        jLabel6.setText("TELEFONO :");

        jLabel7.setText("DIRECCION :");

        label_Telefono.setBackground(new java.awt.Color(217, 217, 217));
        label_Telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_TelefonoActionPerformed(evt);
            }
        });

        label_Direccion.setBackground(new java.awt.Color(217, 217, 217));
        label_Direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_DireccionActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/extintor-de-incendios.png"))); // NOI18N

        Btn_Registrar.setBackground(new java.awt.Color(183, 56, 56));
        Btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Registrar.setText("REGISTRAR");
        Btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistrarActionPerformed(evt);
            }
        });

        label_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "DESPACHADOR", "CLIENTE", "PROVEEDOR" }));
        label_rol.setToolTipText("");
        label_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_rolActionPerformed(evt);
            }
        });

        Rol.setText("ROL:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Rol)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(label_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(label_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(label_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Registrar)
                        .addGap(248, 248, 248))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(label_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(label_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(label_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(Btn_Registrar)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_CedulaActionPerformed

    private void label_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_CorreoActionPerformed

    private void label_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_TelefonoActionPerformed

    private void label_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_DireccionActionPerformed

    private void label_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_rolActionPerformed

    private void Btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_RegistrarActionPerformed

    public static void main(String args[]) {
       
   
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_Registrar;
    private javax.swing.JLabel Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField label_Cedula;
    public javax.swing.JTextField label_Correo;
    public javax.swing.JTextField label_Direccion;
    public javax.swing.JTextField label_Nombre;
    public javax.swing.JTextField label_Telefono;
    public javax.swing.JTextField label_contrasena;
    public javax.swing.JComboBox<String> label_rol;
    // End of variables declaration//GEN-END:variables
}
