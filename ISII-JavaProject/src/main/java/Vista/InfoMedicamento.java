package Vista;

import Modelo.Medicamento;
import Modelo.Enfermedad;
import Modelo.Medico;
import Modelo.Botiquin;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
/**
 *
 * @author algar
 */
public class InfoMedicamento extends javax.swing.JFrame {
    
    public Medico user;
    /**
     * Creates new form InfoMedica
     */
    public InfoMedicamento(Medico user) {
        initComponents();
        
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        cbo_medicamentos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_enfer_tratadas = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_alergias = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst_efect_secun = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre:");

        btn_atras.setText("Atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        cbo_medicamentos.setEditable(true);
        cbo_medicamentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_medicamentosItemStateChanged(evt);
            }
        });
        cbo_medicamentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbo_medicamentosKeyPressed(evt);
            }
        });

        lst_enfer_tratadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lst_enfer_tratadas);

        jLabel4.setText("Enfermedades que trata:");

        lst_alergias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lst_alergias);

        jLabel3.setText("Alergias que puede provocar:");

        jLabel5.setText("Efectos secundarios:");

        lst_efect_secun.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lst_efect_secun);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Medicamentos");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_atras)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbo_medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_atras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        new VistaMedico(this.user).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Document doc = (Document)((JTextField) this.cbo_medicamentos.getEditor().getEditorComponent()).getDocument();
        String texto;
        try {
            texto = doc.getText(0, doc.getLength());
        } catch (BadLocationException ex) {
            System.out.println("btn_buscarActionPerformed @ InfoMedicamento -- BadLocation in document from JComboBox");
            return;
        }
        
        ArrayList<Medicamento> arr = new ArrayList<>();
        try{
            arr = Botiquin.getMedicamentosByNombre(texto);
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this, "No se ha encontrado el medicamento", "Busqueda de medicamento", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        dcbm.addAll(arr);
        this.cbo_medicamentos.setModel(dcbm);
        this.cbo_medicamentos.setPopupVisible(true);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void cbo_medicamentosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbo_medicamentosKeyPressed
        if( evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER )
            this.btn_buscarActionPerformed(null);
    }//GEN-LAST:event_cbo_medicamentosKeyPressed

    private void cbo_medicamentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_medicamentosItemStateChanged
        Object selected_obj = ((javax.swing.JComboBox)evt.getSource()).getSelectedItem();
        
        if (!( selected_obj instanceof Medicamento ))
            return;
        
        Medicamento medicamento = (Medicamento)selected_obj;
        
        ArrayList<Enfermedad> enfermedades = medicamento.getEnfermedadesTratadas();
        
        DefaultListModel dflstmodel = new DefaultListModel();
        dflstmodel.addAll(enfermedades);
        this.lst_enfer_tratadas.setModel(dflstmodel);
        
        DefaultListModel dflstmodel2 = new DefaultListModel();
        dflstmodel2.addElement(medicamento.getAlergia());
        this.lst_alergias.setModel(dflstmodel2);
        
        DefaultListModel dflstmodel3 = new DefaultListModel();
        dflstmodel3.addElement(medicamento.getEfecto_s());
        this.lst_efect_secun.setModel(dflstmodel3);
    }//GEN-LAST:event_cbo_medicamentosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<Medicamento> cbo_medicamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lst_alergias;
    private javax.swing.JList<String> lst_efect_secun;
    private javax.swing.JList<Enfermedad> lst_enfer_tratadas;
    // End of variables declaration//GEN-END:variables
}
