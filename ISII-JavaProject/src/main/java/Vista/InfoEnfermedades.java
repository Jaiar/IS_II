/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import java.awt.Component;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.text.Document;
import javax.swing.text.BadLocationException;
/**
 *
 * @author Bobby
 */
public class InfoEnfermedades extends javax.swing.JFrame {
    private VistaMedico viewMedico;
    
    public static void main(String[] args){
        new InfoEnfermedades().setVisible(true);
    }

    /**
     * Creates new form InfoEnfermedades
     */
    public InfoEnfermedades() {
        initComponents();
        
        Component editor = this.cbo_enfermedad.getEditor().getEditorComponent();
        if (editor instanceof JTextField) {
            ((JTextField) editor).getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent documentEvent) {
                    //To change body of implemented methods use File | Settings | File Templates.
                    Document doc = documentEvent.getDocument();
                    
                    if ( doc.getLength() < 3 )
                        return;
                    
                    try{
                        String criterio = doc.getText(0, doc.getLength());
                    }catch(BadLocationException ble){
                        ble.printStackTrace();
                        return;
                    }
                    
                    // Buscar enfermedad que tenga criterio.
                    /*
                    ArrayList<Enfermedad> enfermedad = consultaSQL;
                    
                    Enfermedad[] enfermedades = consultaSQL;
                    
                    this.cbo_enfermedad.setModel(new DefaultComboBoxModel<Enfermedad>(enfermedades));
                    
                    */
                    
                }

                @Override
                public void removeUpdate(DocumentEvent documentEvent) {
                    //To change body of implemented methods use File | Settings | File Templates.
                    Document doc = documentEvent.getDocument();
                    try{
                    System.out.println(doc.getText(0, doc.getLength()));
                    }catch(Exception x){}
                }

                @Override
                public void changedUpdate(DocumentEvent documentEvent) {}
            });                                      
        }
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
        jLabel2 = new javax.swing.JLabel();
        cbo_enfermedad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_medicamentos = new javax.swing.JList<>();
        btn_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_enfermedades = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ch_contagiosa = new javax.swing.JCheckBox();
        txt_dosis_recom = new javax.swing.JTextField();
        txt_dosis_dia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setText("Enfermedades");

        jLabel2.setText("Seleccionar Enfermedad:");

        cbo_enfermedad.setEditable(true);
        cbo_enfermedad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_enfermedadItemStateChanged(evt);
            }
        });

        jScrollPane1.setViewportView(lst_medicamentos);

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel3.setText("Medicamento que la tratan:");

        jLabel4.setText("Enfermedades relacionadas:");

        jScrollPane2.setViewportView(lst_enfermedades);

        jLabel5.setText("Dosis recomendada:");

        jLabel6.setText("Veces al día:");

        ch_contagiosa.setText("Contagiosa");
        ch_contagiosa.setEnabled(false);
        ch_contagiosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_contagiosaActionPerformed(evt);
            }
        });

        txt_dosis_recom.setEditable(false);

        txt_dosis_dia.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbo_enfermedad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 58, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(btn_salir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ch_contagiosa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_dosis_recom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dosis_dia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbo_enfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_dosis_recom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_dosis_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ch_contagiosa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        viewMedico = new VistaMedico();
        viewMedico.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void ch_contagiosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_contagiosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_contagiosaActionPerformed

    private void cbo_enfermedadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_enfermedadItemStateChanged
        // TODO add your handling code here:
        if ( evt.getStateChange() != java.awt.event.ItemEvent.SELECTED )
            return;
        
        Enfermedad enf = (Enfermedad)evt.getItem();
    }//GEN-LAST:event_cbo_enfermedadItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cbo_enfermedad;
    private javax.swing.JCheckBox ch_contagiosa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lst_enfermedades;
    private javax.swing.JList<String> lst_medicamentos;
    private javax.swing.JTextField txt_dosis_dia;
    private javax.swing.JTextField txt_dosis_recom;
    // End of variables declaration//GEN-END:variables
}
