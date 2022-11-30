/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.DAOenfermero;
import Controlador.DAO;
import Controlador.DAOmedico;
import Data.Hospital;
import Modelo.Enfermero;
import Modelo.Gestor;
import Modelo.Medico;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;

/**
 *
 * @author Bobby
 */
public class VistaGestor extends javax.swing.JFrame {
    private Login viewLogin;
    private DefaultListModel<String> enfermerosList;
    private DefaultListModel<String> medicosList;
    private Medico medico;
    private Enfermero enfermero;
    private Gestor gestor;
    private ArrayList<Enfermero> venfermeros;
    private ArrayList<Medico> vmedicos;
    /**
     * Creates new form VistaGestor
     */
    public VistaGestor(Gestor gestor) {
        this.gestor = gestor;
        initComponents();
        enfermerosList = new DefaultListModel();
        medicosList = new DefaultListModel();
        list_medicos.setModel(medicosList);
        list_enfermeros.setModel(enfermerosList);
        Medico m;
        Enfermero e;
        venfermeros = new ArrayList<Enfermero>();
        vmedicos = new ArrayList<Medico>();
        
        venfermeros = DAOenfermero.getAllEnfermeros();
        vmedicos = DAOmedico.getAllMedicos();
        
        for(int i=0; i<venfermeros.size(); i++)
            enfermerosList.addElement(venfermeros.get(i).getNombre());
        
        for(int i=0; i<vmedicos.size(); i++)
            medicosList.addElement(vmedicos.get(i).getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salir = new javax.swing.JButton();
        lbl_gestor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_medicos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_enfermeros = new javax.swing.JList<>();
        lbl_medicos = new javax.swing.JLabel();
        lbl_enfermeros = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        lbl_dni = new javax.swing.JLabel();
        jtf_apellidos = new javax.swing.JTextField();
        lbl_tel = new javax.swing.JLabel();
        jtf_dni = new javax.swing.JTextField();
        lbl_fecha = new javax.swing.JLabel();
        jtf_tel = new javax.swing.JTextField();
        lbl_apellidos = new javax.swing.JLabel();
        jtf_fecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        lbl_gestor.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbl_gestor.setText("GESTOR");

        list_medicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_medicos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_medicosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list_medicos);

        list_enfermeros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_enfermeros.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_enfermerosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(list_enfermeros);

        lbl_medicos.setText("Médicos");

        lbl_enfermeros.setText("Enfermeros");

        lbl_nombre.setText("Nombre:");

        jtf_nombre.setText("                   ");
        jtf_nombre.setToolTipText("");

        lbl_dni.setText("DNI:");

        jtf_apellidos.setText("                   ");

        lbl_tel.setText("Teléfono");

        jtf_dni.setText("                   ");
        jtf_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dniActionPerformed(evt);
            }
        });

        lbl_fecha.setText("Fecha:");

        jtf_tel.setText("                   ");

        lbl_apellidos.setText("Apellidos");

        jtf_fecha.setText("                   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lbl_medicos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_enfermeros)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_apellidos)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_dni)
                            .addComponent(lbl_tel)
                            .addComponent(lbl_fecha))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_nombre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jtf_fecha))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtf_dni)
                                .addComponent(jtf_tel)
                                .addComponent(jtf_apellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                            .addComponent(btn_salir, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lbl_gestor)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_gestor)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_medicos)
                            .addComponent(lbl_enfermeros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_apellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_dni))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_fecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btn_salir)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        viewLogin = new Login ();
        viewLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jtf_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dniActionPerformed

    private void list_medicosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_medicosValueChanged
        list_enfermeros.clearSelection();
        int x = list_medicos.getSelectedIndex();
        Medico medaux = vmedicos.get(x);

        this.jtf_nombre.setText(medaux.getNombre());
        this.jtf_apellidos.setText(medaux.getApellidos());
        this.jtf_dni.setText(medaux.getDni());
        this.jtf_tel.setText(medaux.getTelefono());
        this.jtf_fecha.setText(medaux.getFecha().toString());
    }//GEN-LAST:event_list_medicosValueChanged

    private void list_enfermerosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_enfermerosValueChanged
        list_medicos.clearSelection();
        int x = list_enfermeros.getSelectedIndex();
        Enfermero enferaux = venfermeros.get(x);

        this.jtf_nombre.setText(enferaux.getNombre());
        this.jtf_apellidos.setText(enferaux.getApellidos());
        this.jtf_dni.setText(enferaux.getDni());
        this.jtf_tel.setText(enferaux.getTelefono());
        this.jtf_fecha.setText(enferaux.getFecha().toString());
    }//GEN-LAST:event_list_enfermerosValueChanged

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtf_apellidos;
    private javax.swing.JTextField jtf_dni;
    private javax.swing.JTextField jtf_fecha;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_tel;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_dni;
    private javax.swing.JLabel lbl_enfermeros;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_gestor;
    private javax.swing.JLabel lbl_medicos;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JList<String> list_enfermeros;
    private javax.swing.JList<String> list_medicos;
    // End of variables declaration//GEN-END:variables
}
