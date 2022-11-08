/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.util.Date;
import Modelo.Enfermero;
import Modelo.Gestor;
import Modelo.Medicamento;
import Modelo.Medico;
import Modelo.Paciente;
import java.time.Instant;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
/**
 *
 * @author roralo3
 */
public class AltaPaciente extends javax.swing.JFrame {
    private VistaMedico viewMedico;
    private Medico medico;
    private Enfermero enfermero;
    private Gestor gestor;
    
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private String Enfermedad;
    private String FechaS;
    private Date Fecha;
    private String Pacientenuevo;
    
    private Paciente Paciente;
    
    private ArrayList<Paciente> Pacientes;
    private DefaultListModel listaPacientesActivos;
    
    /**
     * Creates new form DarAltaPaciente
     */
    public AltaPaciente(Medico medico, Enfermero enfermero, Gestor gestor) {
        initComponents();
        this.medico = medico;
        this.enfermero = enfermero;
        this.gestor = gestor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDNIPaciente = new javax.swing.JLabel();
        textDNIPaciente = new javax.swing.JTextField();
        labelNombrePaciente = new javax.swing.JLabel();
        labeApellidosPacientes = new javax.swing.JLabel();
        textNombrePaciente = new javax.swing.JTextField();
        apellidosTextPaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        labelHistorialMedico = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        DiaComboBox = new javax.swing.JComboBox<>();
        MesComboBox = new javax.swing.JComboBox<>();
        AñoComboBox = new javax.swing.JComboBox<>();
        labelEnferemedad = new javax.swing.JLabel();
        enfermedadText = new javax.swing.JTextField();
        addHistorialButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDNIPaciente.setText("DNI:");

        textDNIPaciente.setText("12345678 X");
        textDNIPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDNIPacienteActionPerformed(evt);
            }
        });

        labelNombrePaciente.setText("Nombre:");

        labeApellidosPacientes.setText("Apellidos:");

        textNombrePaciente.setText("Manolo");
        textNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombrePacienteActionPerformed(evt);
            }
        });

        apellidosTextPaciente.setText("García Hernandez");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        labelHistorialMedico.setText("Historial");

        labelFecha.setText("Fecha:");

        DiaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "...." }));

        MesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        AñoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022" }));
        AñoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoComboBoxActionPerformed(evt);
            }
        });

        labelEnferemedad.setText("Enfermedad:");

        enfermedadText.setText("VIH");

        addHistorialButton.setText("Añadir al Historial");
        addHistorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHistorialButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Salir");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labeApellidosPacientes)
                        .addGap(18, 18, 18)
                        .addComponent(apellidosTextPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombrePaciente)
                        .addGap(18, 18, 18)
                        .addComponent(textNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDNIPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDNIPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DiaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AñoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEnferemedad)
                        .addGap(18, 18, 18)
                        .addComponent(enfermedadText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(addHistorialButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHistorialMedico)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHistorialMedico)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDNIPaciente)
                            .addComponent(textDNIPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombrePaciente)
                            .addComponent(textNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labeApellidosPacientes)
                            .addComponent(apellidosTextPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFecha)
                            .addComponent(DiaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AñoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEnferemedad)
                            .addComponent(enfermedadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(addHistorialButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textDNIPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDNIPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDNIPacienteActionPerformed

    private void textNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombrePacienteActionPerformed

    private void AñoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AñoComboBoxActionPerformed

    private void addHistorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHistorialButtonActionPerformed
        this.DNI = textDNIPaciente.getText();
        this.Nombre=textNombrePaciente.getText();
        this.Apellidos=apellidosTextPaciente.getText();
        this.Enfermedad=enfermedadText.getText();
        this.FechaS = (DiaComboBox.toString()+"//"+MesComboBox.toString()+"//"+AñoComboBox.toString());

        Pacientenuevo = (DNI + Nombre + Apellidos);
        listaPacientesActivos = new DefaultListModel();
        
        listaPacientesActivos.addElement(Pacientenuevo);
        
        jList1.setModel(listaPacientesActivos);
    }//GEN-LAST:event_addHistorialButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        viewMedico = new VistaMedico(medico,enfermero, gestor);
        viewMedico.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AñoComboBox;
    private javax.swing.JComboBox<String> DiaComboBox;
    private javax.swing.JComboBox<String> MesComboBox;
    private javax.swing.JButton addHistorialButton;
    private javax.swing.JTextField apellidosTextPaciente;
    private javax.swing.JTextField enfermedadText;
    private javax.swing.JButton exitButton;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeApellidosPacientes;
    private javax.swing.JLabel labelDNIPaciente;
    private javax.swing.JLabel labelEnferemedad;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHistorialMedico;
    private javax.swing.JLabel labelNombrePaciente;
    private javax.swing.JTextField textDNIPaciente;
    private javax.swing.JTextField textNombrePaciente;
    // End of variables declaration//GEN-END:variables
}
