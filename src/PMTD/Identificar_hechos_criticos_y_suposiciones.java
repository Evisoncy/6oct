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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mbf15
 */
public class Identificar_hechos_criticos_y_suposiciones extends javax.swing.JDialog {
    
    List<hechos> lista = new ArrayList();

    /**
     * Creates new form Identificar_hechos_criticos_y_suposiciones
     */
    private static final Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
    String nombre="Hechos";
    public Identificar_hechos_criticos_y_suposiciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void Generar(String nombre) throws FileNotFoundException, DocumentException{
        if(!(jTextField1.getText().isEmpty() || (jTextArea1.getText().isEmpty())|| (jTextArea2.getText().isEmpty())|| (jTextArea4.getText().isEmpty())  )){
            FileOutputStream archivo = new FileOutputStream(nombre + ".pdf");

            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
           
            
//            String probab=prob.getSelectedItem().toString();
//            String impac =impacto.getSelectedItem().toString();
//            
            documento.open();

            //Titulo
            Paragraph parrafo = new Paragraph("IDENTIFICAR HECHOS CRÍTICOS Y SUPOSICIONES \n\n");
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            //Tabla de tareas 
            documento.add(new Paragraph("1. Hechos criticos y suposiciones \n\n"));
            
            //Nro de filas y columnas
            Integer numColumnsRiesgosDetectados = 5;
            Integer numRowsRiesgosDetectados = 1;
            
            // Creacion de la tabla
            PdfPTable tablaRiesgosDetectados = new PdfPTable(numColumnsRiesgosDetectados); 
            //Lista de campos de la cabecera
            ArrayList<String> camposRiesgosList =  new ArrayList<>();
            camposRiesgosList.add("Nº");
            camposRiesgosList.add("Factor");
            camposRiesgosList.add("Hechos críticos");
            camposRiesgosList.add("Suposiciones");
            camposRiesgosList.add("Justificación");
            
           
            //Lista de campos de la cabecera
            ArrayList<String> valoresRiesgoList =  new ArrayList<>();
            valoresRiesgoList.add("1");
            valoresRiesgoList.add(jTextField1.getText());
            valoresRiesgoList.add(jTextArea1.getText());
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
            tablaRiesgosDetectados.setWidths(new int[]{15,60,60,80,80});
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("IDENTIFICAR HECHOS CRITICOS Y DESARROLLAR SUPOSICIONES");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Hechos criticos");

        jLabel4.setText("Suposiciones");

        jLabel6.setText("Justificacion");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Los Rios Ocoña y Quilca que se encuentran\nen nuestra AO incrementaran su caudal\npor las lluvias en los meses de septiembre \na diciembre de forma muy frecuente.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMargin(new java.awt.Insets(3, 3, 3, 3));
        jScrollPane3.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Que los rios Ocaña y Quilca al incrementar su \ncaudal provocarian inundaciones y por ende\nretrsararian nuestras operaciones en especial \nel repliegue a traves de la posicion cuando \nlleguemos al limite anterior de la Zona de \nresistencia");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setMargin(new java.awt.Insets(3, 3, 3, 3));
        jScrollPane4.setViewportView(jTextArea2);

        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("\nEs factible esta suposicion debido a que el \nsistema local de asistencia medica de la \npoblación de MAJES esta por colapsar y en las \npoblaciones de Quilca y Vitor la Gripe Aviar \nse encuentra en grado de propagación alta.");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setMargin(new java.awt.Insets(3, 3, 3, 3));
        jScrollPane6.setViewportView(jTextArea4);

        jLabel2.setText("Factor");

        jTextField1.setText("Terreno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Generar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Abrir PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 174, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Generar(nombre);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null,ex);
        } catch (DocumentException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!nombre.isEmpty())
        abrir(nombre);
        else
        JOptionPane.showMessageDialog(null, "no se encuentra ese archivo con ese nombre","Atencion",2);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Identificar_hechos_criticos_y_suposiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Identificar_hechos_criticos_y_suposiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Identificar_hechos_criticos_y_suposiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Identificar_hechos_criticos_y_suposiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Identificar_hechos_criticos_y_suposiciones dialog = new Identificar_hechos_criticos_y_suposiciones(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
//declarando el modelo de la tabla 
   DefaultTableModel modelo = new DefaultTableModel();
//declarando la fila del modelo 
   String fila[] = new String[4];
}
