package Vista;

import Modelo.Medico;
import Modelo.Visita;
import Modelo.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author algar
 */
public class VistaMedico extends javax.swing.JFrame {
    private Medico medico;
    
    /**
     * Creates new form MedicoVista
     */
    public VistaMedico(Medico medico) {
        initComponents();
        
        this.medico = medico;
        
        LocalDate currentdate = LocalDate.now();
        
        this.diaText.setText(currentdate.getDayOfMonth()+"");
        this.mesText.setText(currentdate.getMonth()+"");
        this.anyoText.setText(currentdate.getYear()+"");
        DefaultListModel listaEnfermosModel = new DefaultListModel();
       
        ArrayList<Visita> visitas = medico.getVisitasHoy();
        
        listaEnfermosModel.addAll(visitas);
        
        listaEnfermos.setModel(listaEnfermosModel);
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
        diaLabel = new javax.swing.JLabel();
        mesText = new javax.swing.JTextField();
        mesLabel = new javax.swing.JLabel();
        anyoText = new javax.swing.JTextField();
        anyoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enfermedadText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        darAltaPacienteButton = new javax.swing.JButton();
        infoEnfermedadButton = new javax.swing.JButton();
        historialPacienteButton = new javax.swing.JButton();
        infoMedicamenteButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEnfermos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        diaText.setEditable(false);

        diaLabel.setText("Dia:");

        mesText.setEditable(false);

        mesLabel.setText("Mes:");

        anyoText.setEditable(false);

        anyoLabel.setText("Año:");

        enfermedadText.setEditable(false);
        enfermedadText.setColumns(20);
        enfermedadText.setRows(5);
        jScrollPane2.setViewportView(enfermedadText);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Médicos");

        darAltaPacienteButton.setText("Dar Alta Paciente");
        darAltaPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAltaPacienteButtonActionPerformed(evt);
            }
        });

        infoEnfermedadButton.setText("Información enfermedad");
        infoEnfermedadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoEnfermedadButtonActionPerformed(evt);
            }
        });

        historialPacienteButton.setText("Consultar historial paciente");
        historialPacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialPacienteButtonActionPerformed(evt);
            }
        });

        infoMedicamenteButton.setText("Información medicamento");
        infoMedicamenteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoMedicamenteButtonActionPerformed(evt);
            }
        });

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        listaEnfermos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaEnfermosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaEnfermos);

        jLabel1.setText("Síntomas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(salirButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(darAltaPacienteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoEnfermedadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(infoMedicamenteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(historialPacienteButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(diaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diaText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(anyoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(anyoText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaLabel)
                    .addComponent(mesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesLabel)
                    .addComponent(anyoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anyoLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(darAltaPacienteButton)
                    .addComponent(infoEnfermedadButton)
                    .addComponent(historialPacienteButton)
                    .addComponent(infoMedicamenteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(salirButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historialPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialPacienteButtonActionPerformed
        // TODO add your handling code here:
        new ConsultarHistorial(this.medico).setVisible(true);
        dispose();
    }//GEN-LAST:event_historialPacienteButtonActionPerformed

    private void infoEnfermedadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoEnfermedadButtonActionPerformed
        // TODO add your handling code here:
        new InfoEnfermedades(this.medico).setVisible(true);
        dispose();
    }//GEN-LAST:event_infoEnfermedadButtonActionPerformed

    private void darAltaPacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAltaPacienteButtonActionPerformed
        try{
            new AltaPaciente(medico, this.listaEnfermos.getSelectedValue().getPaciente()).setVisible(true);
            dispose();
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this, "Seleccione primero un paciente", "Alta Paciente", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_darAltaPacienteButtonActionPerformed

    private void infoMedicamenteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoMedicamenteButtonActionPerformed
        // TODO add your handling code here:
        new InfoMedicamento(this.medico).setVisible(true);
        dispose();
    }//GEN-LAST:event_infoMedicamenteButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

    private void listaEnfermosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaEnfermosMouseClicked
        // TODO add your handling code here:
        if(listaEnfermos.getSelectedIndex() == -1)
            return;
        
        String text = this.listaEnfermos.getSelectedValue().getSintomas();
        
        // Crea el texto que se pondrá en el JTextArea que tiene el historial de enfermedades.
        //String text = listaEnfermos.getSelectedValue().getPaciente().getEnfermedades().stream().map(e -> e.toString() + "\n").reduce("", String::concat);

        enfermedadText.setText(text);

    }//GEN-LAST:event_listaEnfermosMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anyoLabel;
    private javax.swing.JTextField anyoText;
    private javax.swing.JButton darAltaPacienteButton;
    private javax.swing.JLabel diaLabel;
    private javax.swing.JTextField diaText;
    private javax.swing.JTextArea enfermedadText;
    private javax.swing.JButton historialPacienteButton;
    private javax.swing.JButton infoEnfermedadButton;
    private javax.swing.JButton infoMedicamenteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Visita> listaEnfermos;
    private javax.swing.JLabel mesLabel;
    private javax.swing.JTextField mesText;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}
