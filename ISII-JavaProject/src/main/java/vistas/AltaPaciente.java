package vistas;

import Controlador.DAOmedico;

import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Enfermedad;
import Controlador.DAOhistorial;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author roralo3
 */
public class AltaPaciente extends javax.swing.JFrame {
    private boolean was_focused = false;
    private Medico medico;
  
    private LocalDate currentdate;
    
    private Paciente paciente;
    private boolean paciente_existente;
    
    private ArrayList<String> Pacientes;
    
    private DefaultListModel listahist = new DefaultListModel();
    
    private ArrayList<String> array_hist = new ArrayList<String>();
    
    /**
     * Creates new form DarAltaPaciente
     */
    public AltaPaciente(Medico medico, Paciente paciente) {
        initComponents();
        this.paciente = paciente;
        this.medico = medico;
        this.currentdate = LocalDate.now();
        
        RellenarDatos();
        
        this.paciente_existente = true;
    }
    
    public AltaPaciente(Medico medico){
        initComponents();
        
        this.medico = medico;
        
        this.paciente_existente = false;
    }

    public void RellenarDatos()
    {
        this.textDNIPaciente.setText( paciente.getDNI());
        this.textNombrePaciente.setText(paciente.getNombre());
        this.apellidosTextPaciente.setText(paciente.getApellidos());
        
        ArrayList<Enfermedad> enfermedades = Enfermedad.getEnfermedades();
        this.cbo_enfer.setModel(new DefaultComboBoxModel(enfermedades.toArray()));

        this.DiaComboBox.addItem(currentdate.getDayOfMonth()+"");
        this.MesComboBox.addItem(currentdate.getMonthValue()+"");
        this.AñoComboBox.addItem(currentdate.getYear()+"");
        
        
        
        array_hist = DAOhistorial.getHistorial(paciente.getID());    
        
        if (!array_hist.isEmpty())
        {
        for(int i=0; i<array_hist.size(); i++)
            listahist.addElement(array_hist.get(i));
        }
        
        historial.setModel(listahist); 
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
        historial = new javax.swing.JList<>();
        labelHistorialMedico = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        DiaComboBox = new javax.swing.JComboBox<>();
        MesComboBox = new javax.swing.JComboBox<>();
        AñoComboBox = new javax.swing.JComboBox<>();
        labelEnferemedad = new javax.swing.JLabel();
        addHistorialButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        cbo_enfer = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDNIPaciente.setText("DNI:");

        textDNIPaciente.setEditable(false);

        labelNombrePaciente.setText("Nombre:");

        labeApellidosPacientes.setText("Apellidos:");

        textNombrePaciente.setEditable(false);
        textNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombrePacienteActionPerformed(evt);
            }
        });

        apellidosTextPaciente.setEditable(false);

        jScrollPane1.setViewportView(historial);

        labelHistorialMedico.setText("Historial");

        labelFecha.setText("Fecha:");

        DiaComboBox.setFocusable(false);

        MesComboBox.setFocusable(false);

        AñoComboBox.setFocusable(false);
        AñoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñoComboBoxActionPerformed(evt);
            }
        });

        labelEnferemedad.setText("Enfermedad:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEnferemedad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_enfer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(19, 19, 19)
                        .addComponent(addHistorialButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(labelHistorialMedico)
                        .addGap(338, 338, 338))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
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
                            .addComponent(cbo_enfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(addHistorialButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombrePacienteActionPerformed

    private void AñoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AñoComboBoxActionPerformed

    private void addHistorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHistorialButtonActionPerformed
        Enfermedad enfermedad = (Enfermedad) this.cbo_enfer.getSelectedItem();
        
        if ( enfermedad == null ){
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna enfermedad", "Dar de alta", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if ( paciente_existente )
            DAOmedico.addToHistorialPaciente(paciente, enfermedad, LocalDate.now());
    }//GEN-LAST:event_addHistorialButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //new VistaMedico(medico).setVisible(true);
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AñoComboBox;
    private javax.swing.JComboBox<String> DiaComboBox;
    private javax.swing.JComboBox<String> MesComboBox;
    private javax.swing.JButton addHistorialButton;
    private javax.swing.JTextField apellidosTextPaciente;
    private javax.swing.JComboBox<Enfermedad> cbo_enfer;
    private javax.swing.JButton exitButton;
    private javax.swing.JList<String> historial;
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
