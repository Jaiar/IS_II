/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Gestor;
import Modelo.Enfermero;
import Modelo.Medico;
import java.time.LocalDate;
import Modelo.Paciente;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author algar
 */
public class VistaMedico extends javax.swing.JFrame {

    private AltaPaciente vistaDarAltaPaciente;
    private InfoMedicamentos vistaMedicamento;
    private ConsultarHistorial viewHistorialPaciente;
    private InfoEnfermedades viewInfoEfermedades;
    private Login viewLogin;
    private Medico medico;
    private Enfermero enfermero;
    private Gestor gestor;
    private ArrayList<Paciente> pacientes;
    private LocalDate currentdate = LocalDate.now();
    
    private DefaultListModel listaEnfermosModel;
    
    /**
     * Creates new form MedicoVista
     */
    public VistaMedico(Medico medico) {
        initComponents();
        
        this.diaText.setText(currentdate.getDayOfMonth()+"");
        this.mesText.setText(currentdate.getMonth()+"");
        this.anyoText.setText(currentdate.getYear()+"");
        listaEnfermosModel = new DefaultListModel();
        pacientes = medico.getPacientes();
       
       
        for (Paciente p: pacientes)
            listaEnfermosModel.addElement(p.toString());
        
        listaEnfermos.setModel(listaEnfermosModel);
        
        this.medico = medico;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diaText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mesText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        anyoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enfermedadText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        DarAltaPacienteButton = new javax.swing.JButton();
        InfoEnfermedadButton = new javax.swing.JButton();
        HistorialPacienteButton = new javax.swing.JButton();
        InfoMedicamenteButton = new javax.swing.JButton();
        SalirButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEnfermos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        diaText.setEditable(false);
        diaText.setText("jTextField1");
        diaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Dia:");

        mesText.setEditable(false);
        mesText.setText("jTextField1");
        mesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Mes:");

        anyoText.setEditable(false);
        anyoText.setText("jTextField1");
        anyoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anyoTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Año:");

        enfermedadText.setEditable(false);
        enfermedadText.setColumns(20);
        enfermedadText.setRows(5);
        jScrollPane2.setViewportView(enfermedadText);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Médicos");

        DarAltaPacienteButton.setText("Dar Alta Paciente");
        DarAltaPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarAltaPacienteButtonActionPerformed(evt);
            }
        });

        InfoEnfermedadButton.setText("Información enfermedad");
        InfoEnfermedadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoEnfermedadButtonActionPerformed(evt);
            }
        });

        HistorialPacienteButton.setText("Consultar historial paciente");
        HistorialPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialPacienteButtonActionPerformed(evt);
            }
        });

        InfoMedicamenteButton.setText("Información medicamento");
        InfoMedicamenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoMedicamenteButtonActionPerformed(evt);
            }
        });

        SalirButton.setText("Salir");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        listaEnfermos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaEnfermos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaEnfermosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaEnfermos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(DarAltaPacienteButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(InfoEnfermedadButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(InfoMedicamenteButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HistorialPacienteButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(diaText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(anyoText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalirButton)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(anyoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DarAltaPacienteButton)
                    .addComponent(InfoEnfermedadButton)
                    .addComponent(HistorialPacienteButton)
                    .addComponent(InfoMedicamenteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(SalirButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaTextActionPerformed

    private void mesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesTextActionPerformed

    private void anyoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anyoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anyoTextActionPerformed

    private void HistorialPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialPacienteButtonActionPerformed
        // TODO add your handling code here:
        viewHistorialPaciente = new ConsultarHistorial(medico,enfermero,gestor);
        viewHistorialPaciente.setVisible(true);
        dispose();
    }//GEN-LAST:event_HistorialPacienteButtonActionPerformed

    private void InfoEnfermedadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoEnfermedadButtonActionPerformed
        // TODO add your handling code here:
        viewInfoEfermedades = new InfoEnfermedades(medico,enfermero,gestor);
        viewInfoEfermedades.setVisible(true);
        dispose();
    }//GEN-LAST:event_InfoEnfermedadButtonActionPerformed

    private void DarAltaPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarAltaPacienteButtonActionPerformed
        // TODO add your handling code here:
        vistaDarAltaPaciente = new AltaPaciente(medico,enfermero,gestor,pacientes.get(listaEnfermos.getSelectedIndex()));
        vistaDarAltaPaciente.setVisible(true);
        dispose();
    }//GEN-LAST:event_DarAltaPacienteButtonActionPerformed

    private void InfoMedicamenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoMedicamenteButtonActionPerformed
        // TODO add your handling code here:
        vistaMedicamento = new InfoMedicamentos(medico,enfermero,gestor);
        vistaMedicamento.setVisible(true);
        dispose();
    }//GEN-LAST:event_InfoMedicamenteButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        // TODO add your handling code here:
        viewLogin = new Login();
        viewLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void listaEnfermosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaEnfermosMouseClicked
        // TODO add your handling code here:
         if(listaEnfermos.getSelectedIndex() != -1)
        {
            System.out.print("YYYYYY");
            enfermedadText.setText(pacientes.get(listaEnfermos.getSelectedIndex()).getEnfermedades());
        }
    }//GEN-LAST:event_listaEnfermosMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DarAltaPacienteButton;
    private javax.swing.JButton HistorialPacienteButton;
    private javax.swing.JButton InfoEnfermedadButton;
    private javax.swing.JButton InfoMedicamenteButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JTextField anyoText;
    private javax.swing.JTextField diaText;
    private javax.swing.JTextArea enfermedadText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaEnfermos;
    private javax.swing.JTextField mesText;
    // End of variables declaration//GEN-END:variables
}
