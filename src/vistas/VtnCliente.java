package vistas;

import javax.swing.JOptionPane;
import modelo.Cliente;
import dao.ClienteImpDAO;

public class VtnCliente extends javax.swing.JFrame {

    VtnPrincipal vtnPrincipal = null;
    Cliente ObjCliente = null;
    ClienteImpDAO bd = new ClienteImpDAO();

    public VtnCliente() {
        initComponents();
    }

    public VtnCliente(VtnPrincipal vtnPrincipal, Cliente ObjetoCliente) {
        this.vtnPrincipal = vtnPrincipal;
        this.ObjCliente = ObjetoCliente;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitulo = new javax.swing.JLabel();
        tbpCliente = new javax.swing.JTabbedPane();
        pnlRegistrar = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPlataforma = new javax.swing.JLabel();
        cbPlataforma = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        pnlBuscar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        pnlBuscarAl = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitulo.setFont(new java.awt.Font("Cantarell", 3, 28)); // NOI18N
        lblTitulo.setText("Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        getContentPane().add(lblTitulo, gridBagConstraints);

        pnlRegistrar.setLayout(new java.awt.GridBagLayout());

        lblNombre.setText("Nombre :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblNombre, gridBagConstraints);

        txtNombre.setMaximumSize(new java.awt.Dimension(1024, 768));
        txtNombre.setMinimumSize(new java.awt.Dimension(80, 22));
        txtNombre.setPreferredSize(new java.awt.Dimension(80, 22));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(txtNombre, gridBagConstraints);

        lblEdad.setText("Edad :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblEdad, gridBagConstraints);

        txtEdad.setColumns(3);
        txtEdad.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        txtEdad.setMaximumSize(new java.awt.Dimension(1024, 768));
        txtEdad.setMinimumSize(new java.awt.Dimension(80, 22));
        txtEdad.setOpaque(true);
        txtEdad.setPreferredSize(new java.awt.Dimension(80, 22));
        txtEdad.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(txtEdad, gridBagConstraints);

        lblTelefono.setText("Telefono :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblTelefono, gridBagConstraints);

        txtTelefono.setMinimumSize(new java.awt.Dimension(80, 22));
        txtTelefono.setPreferredSize(new java.awt.Dimension(80, 22));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(txtTelefono, gridBagConstraints);

        lblEmail.setText("Email :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblEmail, gridBagConstraints);

        txtEmail.setMinimumSize(new java.awt.Dimension(80, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(txtEmail, gridBagConstraints);

        lblPlataforma.setText("Plataforma :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(lblPlataforma, gridBagConstraints);

        cbPlataforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xbox", "PlayStation", "Nintendo Switch", "PC" }));
        cbPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlataformaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(cbPlataforma, gridBagConstraints);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        pnlRegistrar.add(btnGuardar, gridBagConstraints);

        tbpCliente.addTab("Registrar", pnlRegistrar);

        pnlBuscar.setLayout(new java.awt.BorderLayout());

        txtResultados.setEditable(false);
        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        jScrollPane1.setViewportView(txtResultados);

        pnlBuscar.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlBuscarAl.setLayout(new java.awt.GridBagLayout());

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscador.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pnlBuscarAl.add(btnBuscar, gridBagConstraints);

        txtBuscar.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pnlBuscarAl.add(txtBuscar, gridBagConstraints);

        pnlBuscar.add(pnlBuscarAl, java.awt.BorderLayout.PAGE_START);

        tbpCliente.addTab("Buscar", pnlBuscar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        getContentPane().add(tbpCliente, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        vtnPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        ObjCliente.setNombre(txtNombre.getText());
        ObjCliente.setEdad(Integer.parseInt(txtEdad.getText()));
        ObjCliente.setEmail(txtEmail.getText());
        ObjCliente.setTelefono(txtTelefono.getText());
        Object selectedItem = cbPlataforma.getSelectedItem();

        if (selectedItem != null) {
            String plataforma = selectedItem.toString();
            ObjCliente.setPlataforma(plataforma);

            bd.abrirConexion();
            bd.insertarCliente(ObjCliente);
            bd.cerrarConexion();
            JOptionPane.showMessageDialog(this,
                    "Datos Guardados correctamente");
            limpiarCajas();
        } else {
            JOptionPane.showMessageDialog(this, "Por Favor, selecciona una plataforma");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String buscado = txtBuscar.getText();
        
        bd.abrirConexion();
        ObjCliente = bd.consultarCliente(buscado);
        bd.cerrarConexion();
        
        if(ObjCliente != null){
            txtResultados.setText(ObjCliente.mostrarInfo());
        }else{
            JOptionPane.showMessageDialog(this,
                    "Cliente no existe");
            limpiarCajas();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cbPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlataformaActionPerformed
        /*Object selectedItem = cbPlataforma.getSelectedItem();

        if (selectedItem != null) {
            String plataformaSeleccionada = selectedItem.toString();
            ObjCliente.setPlataforma(plataformaSeleccionada);
        } else {
            System.out.println("No se seleccionó nada");
        }*/

    }//GEN-LAST:event_cbPlataformaActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    public void limpiarCajas() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
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
            java.util.logging.Logger.getLogger(VtnCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbPlataforma;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlataforma;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlBuscarAl;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JTabbedPane tbpCliente;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtResultados;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
