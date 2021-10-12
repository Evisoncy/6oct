/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diegoelchoche
 */
public class limitacionesDialog extends javax.swing.JDialog {

    /**
     * Creates new form limitacionesDialog
     */
    private static final Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
    String nombre="limitaciones";
    List<limitaciones> lista = new ArrayList();
    public limitacionesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void Generar(String nombre) throws FileNotFoundException, DocumentException{
        if(!(jTextArea2.getText().isEmpty() || (jTextArea4.getText().isEmpty())  )){
            FileOutputStream archivo = new FileOutputStream(nombre + ".pdf");

            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
           
            
//            String probab=prob.getSelectedItem().toString();
//            String impac =impacto.getSelectedItem().toString();
//            
            documento.open();

            //Titulo
            Paragraph parrafo = new Paragraph("IDENTIFICACIÓN DE LIMITACIONES \n\n");
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            //Tabla de tareas 
            documento.add(new Paragraph("1. Limitaciones \n\n"));
            
            //Nro de filas y columnas
            Integer numColumnsRiesgosDetectados = 4;
            Integer numRowsRiesgosDetectados = 1;
            
            // Creacion de la tabla
            PdfPTable tablaRiesgosDetectados = new PdfPTable(numColumnsRiesgosDetectados); 
            //Lista de campos de la cabecera
            ArrayList<String> camposRiesgosList =  new ArrayList<>();
            camposRiesgosList.add("Nº");
            camposRiesgosList.add("Tipo");
            camposRiesgosList.add("Limitaciones");
            camposRiesgosList.add("Implicancias");
            
           
            //Lista de campos de la cabecera
            ArrayList<String> valoresRiesgoList =  new ArrayList<>();
            valoresRiesgoList.add("1");
            valoresRiesgoList.add(jComboBox1.getSelectedItem().toString());
            valoresRiesgoList.add(jTextArea2.getText());
            valoresRiesgoList.add(jTextArea4.getText());
            

            
            
            //rellenamos los campos de la cabecera de la tabla
            PdfPCell columnHeader;              
            for (int column = 0; column < numColumnsRiesgosDetectados; column++) {
                columnHeader = new PdfPCell(new Phrase(camposRiesgosList.get(column),normalFont));
                columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                columnHeader.setVerticalAlignment(Element.ALIGN_MIDDLE);
                //columnHeader.setBackgroundColor(guinda);
                tablaRiesgosDetectados.addCell(columnHeader);
            }
            tablaRiesgosDetectados.setWidths(new int[]{15,60,60,80});
            tablaRiesgosDetectados.setHeaderRows(1);
            
            // Rellenamos las filas de la tabla.
            PdfPCell cellContentRiesgos;           
            for (int row = 0; row < numRowsRiesgosDetectados; row++) {
                for (int column = 0; column < numColumnsRiesgosDetectados; column++) {
                    cellContentRiesgos = new PdfPCell(new Phrase(valoresRiesgoList.get(column),normalFont));
                    cellContentRiesgos.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    if(column==0||column==1){
                        cellContentRiesgos.setHorizontalAlignment(Element.ALIGN_CENTER);                
                    }
                    cellContentRiesgos.setMinimumHeight(20);
                    //cellContentRiesgos.setBackgroundColor(hueso);
                    tablaRiesgosDetectados.addCell(cellContentRiesgos);
                }
            }
            // We add the paragraph with the table (Añadimos el elemento con la tabla).
            documento.add(tablaRiesgosDetectados);
            
            documento.add(new Paragraph("\n"));
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo pdf fue creado correctamente");
        
        }
       else{
            JOptionPane.showMessageDialog(null, "Llenar los campos");  
        }
    }
    
    public void abrir(String nombre){
        try {
            File path = new File(nombre + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"atencion",2);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Identificación de las limitaciones existentes");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Tipo");

        jLabel4.setText("Limitaciones");

        jLabel6.setText("Implicancias");

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("-No esta autorizado el empleo de\nminado ofensivo en la isla\nCharlie.\n-No efectuar ataques sobre\ninstalaciones portuarias del\npuerto de Charlie.");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setMargin(new java.awt.Insets(4, 4, 4, 4));
        jScrollPane4.setViewportView(jTextArea2);

        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("-Aceptar riesgo del no bloqueo\nde puertos en la isla, para\nimpedir zarpar unidades\nenemigas.\n-Necesidad de planear\noperaciones especiales o\nsubmarinas para\nneutralización de unidades\nenemigas en puerto.");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setMargin(new java.awt.Insets(4, 4, 4, 4));
        jScrollPane6.setViewportView(jTextArea4);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restrictivas", "Impositivas", "Pre condicionantes" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Abrir PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Generar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if(!nombre.isEmpty())
            abrir(nombre);
        else
            JOptionPane.showMessageDialog(null, "no se encuentra ese archivo con ese nombre","Atencion",2);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Generar(nombre);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null,ex);
        } catch (DocumentException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(limitacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(limitacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(limitacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(limitacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                limitacionesDialog dialog = new limitacionesDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables

     DefaultTableModel modelo = new DefaultTableModel();
//declarando la fila del modelo 
   String fila[] = new String[4];
}
