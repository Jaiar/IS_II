/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Data.Hospital;
import Modelo.Enfermero;
import Modelo.Gestor;
import Modelo.Medico;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Bobby
 */
public class VistaGestor extends javax.swing.JFrame {
    private Login viewLogin;
    private DefaultListModel enfermerosList;
    private DefaultListModel medicosList;
    private Medico medico, m;
    private Enfermero enfermero, e;
    private Gestor gestor;
    private ArrayList<String> venfermeros;
    private ArrayList<String> vmedicos;
    /**
     * Creates new form VistaGestor
     */
    public VistaGestor(Medico medico, Enfermero enfermero, Gestor gestor) {
        this.medico = medico;
        this.enfermero = enfermero;
        this.gestor = gestor;
        initComponents();
        enfermerosList = new DefaultListModel();
        medicosList = new DefaultListModel();
        list_medicos.setModel(medicosList);
        list_enfermeros.setModel(enfermerosList);
        
        
        /*int tam_enfermeros, tam_medicos;

        venfermeros = SELECT...
        vmedicosos = SELECT...   
        
        
        tam_enfermeros = venfermeros.size();
        tam_medicos = vmedicos.size();
        
        for(int i=0; i<tam_enfermeros; i++)
            enfermerosList.addElement(venfermeros.get(i));
        
        for(int i=0; i<tam_medicos; i++)
            medicosList.addElement(vmedicos.get(i));
         
        */
        
        Hospital hospital = new Hospital();
        m= new Medico(hospital,1,"Manolo","García","12345678F","656565653",new Date());
        e= new Enfermero(1,"Pedro","Garcés","87654321F","666999333",new Date(),hospital);
       
        medicosList.addElement(m);
        enfermerosList.addElement(e);
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
        btn_consultar_medico = new javax.swing.JButton();
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
        btn_consultar_enfermero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_consultar_medico.setText("Consultar Médico");
        btn_consultar_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_medicoActionPerformed(evt);
            }
        });

        lbl_gestor.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbl_gestor.setText("GESTOR");

        list_medicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_medicos);

        list_enfermeros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(list_enfermeros);

        lbl_medicos.setText("Médicos");

        lbl_enfermeros.setText("Enfermeros");

        lbl_nombre.setText("Nombre:");

        lbl_dni.setText("DNI:");

        lbl_tel.setText("Teléfono");

        jtf_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_dniActionPerformed(evt);
            }
        });

        lbl_fecha.setText("Fecha:");

        lbl_apellidos.setText("Apellidos");

        btn_consultar_enfermero.setText("Consultar Enfermero");
        btn_consultar_enfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_enfermeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lbl_medicos)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_nombre)
                                            .addComponent(lbl_fecha))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_dni)
                                            .addComponent(lbl_tel)
                                            .addComponent(lbl_apellidos))
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtf_apellidos)
                                            .addComponent(jtf_dni)
                                            .addComponent(jtf_tel)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lbl_enfermeros)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lbl_gestor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btn_consultar_medico)
                        .addGap(18, 18, 18)
                        .addComponent(btn_consultar_enfermero)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_consultar_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultar_enfermero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btn_salir)
                        .addGap(21, 21, 21))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultar_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_medicoActionPerformed
        
        
       int x = list_medicos.getSelectedIndex();
    
        
        
        
        
        /*
        this.jtf_nombre.setText(t);
        this.jtf_apellidos.setText(t);
        this.jtf_dni.setText(t);
        this.jtf_tel.setText(t);
        this.jtf_fecha.setText(t);
        */
    }//GEN-LAST:event_btn_consultar_medicoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        viewLogin = new Login (medico,enfermero, gestor);
        viewLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jtf_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_dniActionPerformed

    private void btn_consultar_enfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_enfermeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultar_enfermeroActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar_enfermero;
    private javax.swing.JButton btn_consultar_medico;
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
