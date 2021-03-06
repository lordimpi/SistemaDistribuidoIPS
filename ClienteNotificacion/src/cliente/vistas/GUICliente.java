/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cliente.vistas;

import Common.Entidades.IndicadorClinicoDTO;
import Common.Entidades.SensorDTO;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author adrianfelipegp
 */
public class GUICliente extends javax.swing.JFrame {
    private static int idCliente;
    /**
     * Creates new form FrmNotificacion
     */
    public GUICliente() {
        initComponents();
        this.setVisible(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEncabezado = new javax.swing.JLabel();
        lblContexto = new javax.swing.JLabel();
        lblIndicadoresTexto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIndicadores = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEncabezado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncabezado.setText("Nueva Alerta");
        getContentPane().add(lblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 500, 40));

        lblContexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContexto.setText("Contexto");
        lblContexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblContexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, 30));

        lblIndicadoresTexto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIndicadoresTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicadoresTexto.setText("Indicadores Fuera de Rango");
        getContentPane().add(lblIndicadoresTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 500, 50));

        txtIndicadores.setColumns(2);
        txtIndicadores.setRows(7);
        txtIndicadores.setMaximumSize(new java.awt.Dimension(600, 600));
        txtIndicadores.setMinimumSize(new java.awt.Dimension(400, 300));
        jScrollPane1.setViewportView(txtIndicadores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 500, 250));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Desarrollado por: Adrian Gironza, Santiago Acu??a, Andres Rubiano");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 394, 500, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

   
    /**
     * @param args the command line arguments
     */
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContexto;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblIndicadoresTexto;
    private javax.swing.JTextArea txtIndicadores;
    // End of variables declaration//GEN-END:variables

    public void mostrarNotificacion(SensorDTO objSensor) {
          String menContexto = "El paciente de la habitacion "+objSensor.getNumeroHabitacion() +" ";
    String menIndicadores="";
    int contarIndicadores=0;
    IndicadorClinicoDTO objIndicadores = objSensor.getIndicador();
    if (!(objIndicadores.getFrecuenciaCardiaca() >= 60 && objIndicadores.getFrecuenciaCardiaca() <= 80)) {
        menIndicadores = menIndicadores+"Frecuencia cardiaca: "+objIndicadores.getFrecuenciaCardiaca()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getFrecuenciaRespiratoria() >= 12 && objIndicadores.getFrecuenciaRespiratoria() <= 20)) {
        menIndicadores = menIndicadores+"Frecuencia respiratoria: "+objIndicadores.getFrecuenciaRespiratoria()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getSaturacionOxigeno() >= 95 && objIndicadores.getSaturacionOxigeno() <= 100)) {
        menIndicadores = menIndicadores+"Saturacion de Oxigeno: "+objIndicadores.getSaturacionOxigeno()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getTemperatura() >= 36.2 && objIndicadores.getTemperatura() <= 37.2)) {
        menIndicadores = menIndicadores+"Temperatura: "+objIndicadores.getTemperatura()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getTensionArterial().getPresionSistolica() >= 110 && objIndicadores.getTensionArterial().getPresionSistolica() <= 140)) {
        menIndicadores = menIndicadores+"Presion arterial (Sistolica): "+objIndicadores.getTensionArterial().getPresionSistolica()+"\n\n";
        contarIndicadores++;
    }
    if (!(objIndicadores.getTensionArterial().getPresionDiastolica() >= 70 && objIndicadores.getTensionArterial().getPresionDiastolica() <= 90)) {
        menIndicadores = menIndicadores+"Presion arterial (Diastolica): "+objIndicadores.getTensionArterial().getPresionDiastolica()+"\n\n";
        contarIndicadores++;
    }
    menContexto = menContexto + "presenta " + contarIndicadores + " indicadores fuera de rango.";
    this.lblContexto.setText(menContexto);
    this.txtIndicadores.setText(menIndicadores);
    this.setVisible(true);
      
   
    }

    public void setIdCliente(int id) {
        this.idCliente = id;
        this.setTitle("Notificacion Cliente Id:"+id);
    }
}
