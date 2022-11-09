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

/**
 *
 * @author Bobby
 */
public class VistaGestor extends javax.swing.JFrame {
    private Login viewLogin;
    private DefaultListModel enfermerosList;
    private DefaultListModel medicosList;
    private Medico medico;
    private Enfermero enfermero;
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
        btn_consultar = new javax.swing.JButton();
        lbl_gestor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_medicos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_enfermeros = new javax.swing.JList<>();
        lbl_medicos = new javax.swing.JLabel();
        lbl_enfermeros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_consultar.setText("Consultar Médicos y Enfermeros");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btn_consultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lbl_gestor)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lbl_medicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_enfermeros)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_gestor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_medicos)
                    .addComponent(lbl_enfermeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btn_consultar)
                .addGap(8, 8, 8)
                .addComponent(btn_salir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        int tam_enfermeros, tam_medicos;
        
        
        
        /*
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
        Medico medico= new Medico(hospital,1,"Manolo","García","34567812F","546993455",new Date());
        Enfermero enfermero= new Enfermero(1,"Pedro","Garcés","34567812F","546993455",new Date(),hospital);
        
        medicosList.addElement(medico.getName());
        enfermerosList.addElement(enfermero.getName());
        
        
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        viewLogin = new Login (medico,enfermero, gestor);
        viewLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_enfermeros;
    private javax.swing.JLabel lbl_gestor;
    private javax.swing.JLabel lbl_medicos;
    private javax.swing.JList<String> list_enfermeros;
    private javax.swing.JList<String> list_medicos;
    // End of variables declaration//GEN-END:variables
}
