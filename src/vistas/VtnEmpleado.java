package vistas;

import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Empleado;
import dao.ClienteImpDAO;

public class VtnEmpleado extends javax.swing.JFrame {

    VtnPrincipal vtnPrincipal = null;
    Cliente ObjCliente = null;
    Empleado ObjEmpleado = null;
    ClienteImpDAO bd = new ClienteImpDAO();

    public VtnEmpleado(VtnPrincipal vtnPrincipal,
            Cliente ObjCliente,
            Empleado ObjEmpleado) {
        this.vtnPrincipal = vtnPrincipal;
        this.ObjCliente = ObjCliente;
        this.ObjEmpleado = ObjEmpleado;

        initComponents();
        //ocultarComponentes();
    }

    public VtnEmpleado() {
        initComponents();
        //ocultarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitulo = new javax.swing.JLabel();
        tbpEmpleado = new javax.swing.JTabbedPane();
        pnlRegistrar = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblPago = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        pnlModificar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblEdadMod = new javax.swing.JLabel();
        txtEdadMod = new javax.swing.JTextField();
        lblTelefonoMod = new javax.swing.JLabel();
        txtTelefonoMod = new javax.swing.JTextField();
        lblEMailMod = new javax.swing.JLabel();
        txtEmailMod = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        lblPlataforma = new javax.swing.JLabel();
        cbPlataformaMod = new javax.swing.JComboBox<>();
        pnlEliminar = new javax.swing.JPanel();
        lbleliminar = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setFont(new java.awt.Font("Cantarell", 3, 26)); // NOI18N
        lblTitulo.setText("Empleados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        getContentPane().add(lblTitulo, gridBagConstraints);

        pnlRegistrar.setLayout(new java.awt.GridBagLayout());

        lblNombre.setText("Nombre :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblNombre, gridBagConstraints);

        txtNombre.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
        pnlRegistrar.add(txtNombre, gridBagConstraints);

        lblEdad.setText("Edad :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblEdad, gridBagConstraints);

        txtEdad.setColumns(3);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
        pnlRegistrar.add(txtEdad, gridBagConstraints);

        lblEmail.setText("Email :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblEmail, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
        pnlRegistrar.add(txtEmail, gridBagConstraints);

        lblHoras.setText("Horas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblHoras, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
        pnlRegistrar.add(txtHoras, gridBagConstraints);

        lblTelefono.setText("Teléfono: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblTelefono, gridBagConstraints);

        txtTelefono.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
        pnlRegistrar.add(txtTelefono, gridBagConstraints);

        lblPago.setText("Pago:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblPago, gridBagConstraints);

        txtPago.setColumns(3);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
        pnlRegistrar.add(txtPago, gridBagConstraints);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(btnGuardar, gridBagConstraints);

        tbpEmpleado.addTab(" Regristrar Empleado", pnlRegistrar);

        pnlModificar.setLayout(new java.awt.GridBagLayout());

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 5, 10);
        pnlModificar.add(btnBuscar, gridBagConstraints);

        txtBuscar.setColumns(3);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.5;
        gridBagConstraints.weighty = 1.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 5, 10);
        pnlModificar.add(txtBuscar, gridBagConstraints);

        lblEdadMod.setText("Edad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlModificar.add(lblEdadMod, gridBagConstraints);

        txtEdadMod.setColumns(3);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlModificar.add(txtEdadMod, gridBagConstraints);

        lblTelefonoMod.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlModificar.add(lblTelefonoMod, gridBagConstraints);

        txtTelefonoMod.setColumns(3);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlModificar.add(txtTelefonoMod, gridBagConstraints);

        lblEMailMod.setText("Plataforma");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlModificar.add(lblEMailMod, gridBagConstraints);

        txtEmailMod.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlModificar.add(txtEmailMod, gridBagConstraints);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlModificar.add(btnModificar, gridBagConstraints);

        lblPlataforma.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlModificar.add(lblPlataforma, gridBagConstraints);

        cbPlataformaMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xbox", "PlayStation", "NintendoSwitch", "Pc" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlModificar.add(cbPlataformaMod, gridBagConstraints);

        tbpEmpleado.addTab("Modificar Cliente", pnlModificar);

        pnlEliminar.setLayout(new java.awt.GridBagLayout());

        lbleliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbleliminar.setText("Para encontrar a un cliente a eliminar, ingrese su número de teléfono");
        pnlEliminar.add(lbleliminar, new java.awt.GridBagConstraints());

        txtEliminar.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
        pnlEliminar.add(txtEliminar, gridBagConstraints);

        btnEliminar.setText("Eliminar Alumno");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlEliminar.add(btnEliminar, gridBagConstraints);

        tbpEmpleado.addTab("Eliminar Empleado", pnlEliminar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 91;
        gridBagConstraints.ipady = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 60, 139, 109);
        getContentPane().add(tbpEmpleado, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        vtnPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        ObjEmpleado.setNombre(txtHoras.getText());
        ObjEmpleado.setEdad(Integer.parseInt(txtEdad.getText()));
        ObjEmpleado.setTelefono(txtNombre.getText());
        ObjEmpleado.setEmail(txtEmail.getText());
        ObjEmpleado.setCantHoras(Integer.parseInt(txtPago.getText()));
        ObjEmpleado.setPagoHora(Double.parseDouble(txtTelefono.getText()));

        JOptionPane.showMessageDialog(this, "Empleado agregado correctamente");

        limpiarCajas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscado = txtEmailMod.getText();

        bd.abrirConexion();
        ObjCliente = bd.consultarCliente(buscado);
        bd.cerrarConexion();

        if (ObjCliente != null) {
            JOptionPane.showMessageDialog(this, "Cliente encontrado");
            mostrarComponentes();
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no existe");
            ocultarComponentes();
        }
        limpiarCajas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        int nuevaEdad = Integer.parseInt(txtEdad.getText());
        String nuevoEmail = txtEmail.getText();
        String nuevaPlataforma = cbPlataformaMod.getSelectedItem().toString();// esta mal, investigar qué da error: Exception in thread "AWT-EventQueue-0" java.lang.NumberFormatException: For input string: ""

        // Modifica los atributos del objeto Cliente
        ObjCliente.setEdad(nuevaEdad);
        ObjCliente.setEmail(nuevoEmail);
        ObjCliente.setPlataforma(nuevaPlataforma);

        bd.abrirConexion();
        bd.actualizarCliente(ObjCliente);
        bd.cerrarConexion();

        JOptionPane.showMessageDialog(this, "Cliente Modificado");
        ocultarComponentes();
        limpiarCajas();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String eliminado = txtEliminar.getText();
        bd.abrirConexion();
        ObjCliente = bd.consultarCliente(eliminado);

        if (ObjCliente != null) {
            int opcion = JOptionPane.showConfirmDialog(this,
                    "¿Deseas eliminar al cliente :" + ObjCliente.getNombre());

            if (opcion == 0) {
                bd.eliminarCliente(eliminado);
                JOptionPane.showMessageDialog(this,
                        "Alumno Eliminado de la BD");
            } else {
                JOptionPane.showMessageDialog(this,
                        "El Alumno sigue activo en la BD");
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "No existe el Alumno con ese código en la BD");
        }
        bd.cerrarConexion();

    }//GEN-LAST:event_btnEliminarActionPerformed

    public void ocultarComponentes() {
        lblEdadMod.setVisible(false);
        lblTelefonoMod.setVisible(false);
        lblEMailMod.setVisible(false);
        txtBuscar.setVisible(false);
        txtTelefonoMod.setVisible(false);
        txtEdadMod.setVisible(false);
        btnModificar.setVisible(false);

    }

    public void mostrarComponentes() {
        lblEdadMod.setVisible(true);
        lblTelefonoMod.setVisible(true);
        lblEMailMod.setVisible(true);
        txtBuscar.setVisible(true);
        txtTelefonoMod.setVisible(true);
        txtEdadMod.setVisible(true);
        btnModificar.setVisible(true);
    }

    public void limpiarCajas() {
        txtHoras.setText("");
        txtEdad.setText("");
        txtEmail.setText("");
        txtNombre.setText("");
        txtPago.setText("");
        txtTelefono.setText("");
        txtBuscar.setText("");
        txtTelefonoMod.setText("");
        txtEdadMod.setText("");
        txtEmailMod.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbPlataformaMod;
    private javax.swing.JLabel lblEMailMod;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdadMod;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPago;
    private javax.swing.JLabel lblPlataforma;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoMod;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbleliminar;
    private javax.swing.JPanel pnlEliminar;
    private javax.swing.JPanel pnlModificar;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JTabbedPane tbpEmpleado;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdadMod;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailMod;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoMod;
    // End of variables declaration//GEN-END:variables
}
