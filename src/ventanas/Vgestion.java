package ventanas;

import clases.Analgesicos;
import clases.Antibioticos;
import clases.Antihistamínicos;
import clases.Diuréticos;
import clases.ListaMedicamentos;
import clases.RelajantesMusculares;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author dam117
 */
public class Vgestion extends javax.swing.JDialog {    
    static Vgestion gestion = new Vgestion(null, true); //Ventana creada estática para poder usarla desde cualquier ventana
    private VLista vl;
    boolean asignado = false;

    /**
     * Creates new form Vgestion
     * Además pone el texto adicional al pasar por encima de un botón
     * @param parent
     * @param modal
     */
    public Vgestion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botonAñadir.setToolTipText("Necesita todos los campos para añadir un medicamento");
        botonBorrar.setToolTipText("Necesita la referencia para borrar el medicamento");
        botonModificar.setToolTipText("Modifica todos los datos por la referencia del medicamento");
        botonBuscar.setToolTipText("Busca un medicamento por el nombre");
        botonListar.setToolTipText("Muestra la lista de medicamentos que hay guardada");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbllogoGestion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonAñadir = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonListar = new javax.swing.JButton();
        lblReferencia = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        lblPA = new javax.swing.JLabel();
        txtPA = new javax.swing.JTextField();
        lblLaboratorio = new javax.swing.JLabel();
        txtLaboratorio = new javax.swing.JTextField();
        lblReceta = new javax.swing.JLabel();
        comboReceta = new javax.swing.JComboBox();
        botonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbllogoGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoGestion.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("Gestión");

        botonAñadir.setText("Añadir");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonListar.setText("Lista");
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });

        lblReferencia.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblReferencia.setText("Referencia:");

        txtReferencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 102), 2, true));

        lblNombre.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 102), 2, true));

        lblTipo.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblTipo.setText("Tipo:");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Antibiótico", "Analgésico", "Antihistamínico", "Relajante Muscular", "Diurético" }));

        lblPA.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblPA.setText("Principio activo:");

        txtPA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 102), 2, true));

        lblLaboratorio.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblLaboratorio.setText("Laboratorio:");

        txtLaboratorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 102), 2, true));

        lblReceta.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblReceta.setText("Receta:");

        comboReceta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Con receta", "Sin receta" }));

        botonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoCerrar.png"))); // NOI18N
        botonCerrar.setBorder(null);
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTipo)
                                    .addComponent(lblNombre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPA)
                                    .addComponent(lblLaboratorio)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReceta))))
                    .addComponent(lblReferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtReferencia)
                    .addComponent(txtNombre)
                    .addComponent(comboTipo, 0, 1, Short.MAX_VALUE)
                    .addComponent(txtPA)
                    .addComponent(txtLaboratorio)
                    .addComponent(comboReceta, 0, 95, Short.MAX_VALUE))
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbllogoGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllogoGestion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReferencia)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLaboratorio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReceta)
                            .addComponent(comboReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(571, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose(); //Cierra esta ventana
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        String tipo;
        tipo = comboTipo.getSelectedItem().toString(); //Asigna el texto que hay en el combo
        if (txtReferencia.getText().length() == 6) { //Si la referencia tiene un tamaño de 6 crea los medicamentos segun el tipo
            switch (tipo) {
                case "Antibiótico":
                    Antibioticos m1 = new Antibioticos(Integer.parseInt(txtReferencia.getText()), txtNombre.getText(), txtPA.getText(), txtLaboratorio.getText(), comboReceta.getSelectedItem().toString());
                    ListaMedicamentos.listaM.añadir(m1); //Añade el medicamento a la lista
                    JOptionPane.showMessageDialog(null, "Medicamento guardado:\nEl antibiótico ha sido creado correctamente", null, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Analgésico":
                    Analgesicos m2 = new Analgesicos(Integer.parseInt(txtReferencia.getText()), txtNombre.getText(), txtPA.getText(), txtLaboratorio.getText(), comboReceta.getSelectedItem().toString());
                    ListaMedicamentos.listaM.añadir(m2);
                    JOptionPane.showMessageDialog(null, "Medicamento guardado:\nEl analgésico ha sido creado correctamente", null, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Antihistamínico":
                    Antihistamínicos m3 = new Antihistamínicos(Integer.parseInt(txtReferencia.getText()), txtNombre.getText(), txtPA.getText(), txtLaboratorio.getText(), comboReceta.getSelectedItem().toString());
                    ListaMedicamentos.listaM.añadir(m3);
                    JOptionPane.showMessageDialog(null, "Medicamento guardado:\nEl antihistamínico ha sido creado correctamente", null, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Relajante Muscular":
                    RelajantesMusculares m4 = new RelajantesMusculares(Integer.parseInt(txtReferencia.getText()), txtNombre.getText(), txtPA.getText(), txtLaboratorio.getText(), comboReceta.getSelectedItem().toString());
                    ListaMedicamentos.listaM.añadir(m4);
                    JOptionPane.showMessageDialog(null, "Medicamento guardado:\nEl relajante muscular ha sido creado correctamente", null, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Diuréticos":
                    Diuréticos m5 = new Diuréticos(Integer.parseInt(txtReferencia.getText()), txtNombre.getText(), txtPA.getText(), txtLaboratorio.getText(), comboReceta.getSelectedItem().toString());
                    ListaMedicamentos.listaM.añadir(m5);
                    JOptionPane.showMessageDialog(null, "Medicamento guardado:\nEl diurético ha sido creado correctamente", null, JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } else { //Si no tiene longitud 6 salta un mensaje y no crea el objeto
            JOptionPane.showMessageDialog(null, "Creación denegada:\n"
                    + "La referencia no contiene 6 dígitos.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAñadirActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        ListaMedicamentos.listaM.eliminar(Integer.parseInt(txtReferencia.getText())); //Si encuentra la referencia borra el medicamento
        JOptionPane.showMessageDialog(null, "Medicamento borrado correctamente", null, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        //Si encuentra la referencia del medicamento modifica sus datos
        ListaMedicamentos.listaM.modificarMedicamento(Integer.parseInt(txtReferencia.getText()), txtNombre.getText(), txtLaboratorio.getText(), txtPA.getText(), comboReceta.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, "Medicamento modificado correctamente", null, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        this.setVisible(false); //Deja de ser visible esta ventana
        vl = new VLista(); //Creamos una ventana nueva de Lista
        vl.setVisible(true); //Hacemos visible la ventana de lista
    }//GEN-LAST:event_botonListarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        //Si encuentra el medicamento por su nombre, muestra sus datos
        JOptionPane.showMessageDialog(null, ListaMedicamentos.listaM.buscarMedicamento(txtNombre.getText()), null, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonBuscarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vgestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vgestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vgestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vgestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vgestion dialog = new Vgestion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonListar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JComboBox comboReceta;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLaboratorio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPA;
    private javax.swing.JLabel lblReceta;
    private javax.swing.JLabel lblReferencia;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lbllogoGestion;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPA;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
