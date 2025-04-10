/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import Repository.IngredienteRepository;

import Service.ListaComprasService;
import Service.RecetaService;
import Service.ServiceGeneradorIA;
import Service.UserService;
import dataBaseConfig.DatabaseConfig;
import dto.IngredienteDTO;
import dto.RecetaDTO;
import exception.InvalidRecetaDataException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina
 */
public class VentanaRecetas extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRecetas
     */
    public VentanaRecetas() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtMensajeIA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRespuesta = new javax.swing.JTextArea();
        btnGuardarReceta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("GastroBot ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("PREGUNTALE A LA IA");

        btnEnviar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtRespuesta.setColumns(20);
        txtRespuesta.setRows(5);
        jScrollPane1.setViewportView(txtRespuesta);

        btnGuardarReceta.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnGuardarReceta.setText("Guardar");
        btnGuardarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRecetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnEnviar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMensajeIA, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(162, 162, 162))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardarReceta)
                        .addGap(189, 189, 189))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensajeIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEnviar)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarReceta)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         VentanaGeneral ventana = new VentanaGeneral();
        ventana.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:                                           
    String mensaje = txtMensajeIA.getText();

    if (!mensaje.isBlank()) {
        String respuesta = ServiceGeneradorIA.generarContenido(mensaje);
        txtRespuesta.setText(respuesta);

        // Guardar en ListaCompra
        try {
            String correoUsuario = UserService.correoActual;
            ListaComprasService service = new ListaComprasService();
            service.createListaCompra(0, correoUsuario, respuesta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar en la lista: " + e.getMessage());
        }

        // Procesar y guardar en tabla Ingrediente
        try {
            String correoUsuario = UserService.correoActual;
            IngredienteRepository repo = new IngredienteRepository();

            int idUsuario = obtenerIdUsuarioPorCorreo(correoUsuario); // Método auxiliar

            String[] lineas = respuesta.split("\n");

            for (String linea : lineas) {
                linea = linea.replaceFirst("^\\s*(\\|\\d+\\.|-)\\s", ""); // quita *, 1., -
                String[] partes = linea.split(",");

                if (partes.length == 4) {
                    String nombre = partes[0].trim();
                    String categoria = partes[1].trim();
                    java.sql.Date fecha = java.sql.Date.valueOf(partes[2].trim());
                    double cantidad = Double.parseDouble(partes[3].trim());

                    IngredienteDTO ingrediente = new IngredienteDTO(0, nombre, categoria, fecha, cantidad, idUsuario);
                    repo.save(ingrediente);
                }
            }

            JOptionPane.showMessageDialog(this, "Ingredientes guardados correctamente en la tabla Ingrediente.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar ingredientes: " + e.getMessage());
        }

    } else {
        txtRespuesta.setText("Por favor escribe una pregunta antes de enviar.");
    }
        
        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnGuardarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRecetaActionPerformed
        // TODO add your handling code here:
    
        String mensaje = txtMensajeIA.getText();

    if (!mensaje.isBlank()) {
        String respuesta = ServiceGeneradorIA.generarContenido(mensaje);
        txtRespuesta.setText(respuesta);

        try {
            RecetaService recetaService = new RecetaService();
            recetaService.crearRecetaDesdeRespuestaIA(respuesta); 
        
            JOptionPane.showMessageDialog(this, "¡Receta guardada exitosamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            txtRespuesta.setText("Error al guardar la receta.");
            
           
            JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar la receta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        txtRespuesta.setText("Por favor escribe una pregunta antes de enviar.");

      
        JOptionPane.showMessageDialog(this, "Por favor escribe una pregunta antes de enviar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
        
    }//GEN-LAST:event_btnGuardarRecetaActionPerformed

   private int obtenerIdUsuarioPorCorreo(String correo) throws SQLException {
    int idUsuario = -1;
    String query = "SELECT idUsuario FROM Usuario WHERE correo = ?";

    try (Connection conn = DatabaseConfig.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, correo);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                idUsuario = rs.getInt("idUsuario");
            }
        }
    }

    return idUsuario;
}
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardarReceta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMensajeIA;
    private javax.swing.JTextArea txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
