package vista;

import Modelo.Enfermero;
import Modelo.Medicamento;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author algar
 */
public class BotiquinHospital extends javax.swing.JFrame {
    private VistaEnfermeros viewEnfemeros;
    private Enfermero enfermero;
    private DefaultListModel listaMedicamentosBotiquin;
    private ArrayList<Medicamento> medicamentos;
    
    /**
     * Creates new form VistaBotiquin
     */
    public BotiquinHospital(Enfermero enfermero) {
        initComponents();
        this.enfermero = enfermero;
        
        listaMedicamentosBotiquin = new DefaultListModel();
        medicamentos = Modelo.Botiquin.getBotiquin().consultar();
        listaMedicamentosBotiquin.addAll(medicamentos);
        lst_botiquin.setModel(listaMedicamentosBotiquin);
        
        try{
            for(Medicamento m: medicamentos){
                if(m.getCantidad() <= 0){
                    throw new Illegal­Argument­Exception("No quedan existencias del medicamento: " + m.getNombre());
                }
            }
        }catch(IllegalArgumentException iae){
            JOptionPane.showMessageDialog(this, iae.getMessage(), "Consultar Botiquin", JOptionPane.ERROR_MESSAGE);
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
        cantidadMinLabel = new javax.swing.JLabel();
        txt_cantminima = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_botiquin = new javax.swing.JList<>();
        btn_atras = new javax.swing.JButton();
        findButton = new javax.swing.JButton();
        cantidadDispoLabel = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Botiquin");

        cantidadMinLabel.setText("Cantidad mínima:");

        lst_botiquin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lst_botiquin.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_botiquinValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_botiquin);

        btn_atras.setText("Atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        findButton.setText("BUSCAR");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        cantidadDispoLabel.setText("Cantidad disponible:");

        lbl_cantidad.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cantidadMinLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cantminima, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cantidadDispoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_atras)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMinLabel)
                    .addComponent(txt_cantminima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findButton)
                    .addComponent(cantidadDispoLabel)
                    .addComponent(lbl_cantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btn_atras)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        // TODO add your handling code here:
        this.enfermero.launchMenu();
        this.dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:
        
        int number;
        try{
            number = Integer.parseInt(txt_cantminima.getText());   
        }
        catch (NumberFormatException ex){
            System.out.println("Error parsing numero.");
            System.out.println(ex.getMessage());
            number = Integer.MAX_VALUE;
        }
            
        ArrayList<Medicamento> medicamentos = this.enfermero.consultarBotiquin(number);
        
        listaMedicamentosBotiquin = new DefaultListModel();
        listaMedicamentosBotiquin.addAll(medicamentos);
        lst_botiquin.setModel(listaMedicamentosBotiquin);
    }//GEN-LAST:event_findButtonActionPerformed

    private void lst_botiquinValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_botiquinValueChanged
        try{
            this.lbl_cantidad.setText("" + this.lst_botiquin.getSelectedValue().getCantidad());
        }catch(NullPointerException npe){
            System.out.println("NullPointerException -- lst_botiquinValueChanged");
            System.out.println(npe.getMessage());
            this.lbl_cantidad.setText("");
        }
    }//GEN-LAST:event_lst_botiquinValueChanged

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JLabel cantidadDispoLabel;
    private javax.swing.JLabel cantidadMinLabel;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JList<Medicamento> lst_botiquin;
    private javax.swing.JTextField txt_cantminima;
    // End of variables declaration//GEN-END:variables
}
