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
import com.itextpdf.text.PageSize;
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
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author argen
 */
public class Desarrollar_sect extends javax.swing.JDialog {

    /**
     * Creates new form Desarrollar_sect
     */
    private static final Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
    String nombre="eval_recursos";
    List<desarrollar_sec> lista = new ArrayList();
    public Desarrollar_sect(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
         
        initComponents();
        
    }

    public void Generar(String nombre) throws FileNotFoundException, DocumentException{
        if(!(jTextArea1.getText().isEmpty() || (jTextArea2.getText().isEmpty()) || (jTextArea3.getText().isEmpty()) || (jTextArea4.getText().isEmpty())  )){
            FileOutputStream archivo = new FileOutputStream(nombre + ".pdf");

            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
           
            
//            String probab=prob.getSelectedItem().toString();
//            String impac =impacto.getSelectedItem().toString();
//            
            documento.open();

            //Titulo
            Paragraph parrafo = new Paragraph("EVALUACIÓN DE RECURSOS \n\n");
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            //Tabla de tareas 
            documento.add(new Paragraph("1. recursos \n\n"));
            
            //Nro de filas y columnas
            Integer numColumnsRiesgosDetectados = 5;
            Integer numRowsRiesgosDetectados = 1;
            
            // Creacion de la tabla
            PdfPTable tablaRiesgosDetectados = new PdfPTable(numColumnsRiesgosDetectados); 
            //Lista de campos de la cabecera
            ArrayList<String> camposRiesgosList =  new ArrayList<>();
            camposRiesgosList.add("Nº");
            camposRiesgosList.add("Tareas");
            camposRiesgosList.add("Recursos disponibles");
            camposRiesgosList.add("Juicio de valor");
            camposRiesgosList.add("Requerimiento");
           
            //Lista de campos de la cabecera
            ArrayList<String> valoresRiesgoList =  new ArrayList<>();
            valoresRiesgoList.add("1");
            valoresRiesgoList.add(jTextArea1.getText());
            valoresRiesgoList.add(jTextArea2.getText());
            valoresRiesgoList.add(jTextArea3.getText());
            valoresRiesgoList.add(jTextArea4.getText());
//            valoresRiesgoList.add(jTextField2.getText());
//            valoresRiesgoList.add(jTextArea3.getText());
            
            
            //rellenamos los campos de la cabecera de la tabla
            PdfPCell columnHeader;              
            for (int column = 0; column < numColumnsRiesgosDetectados; column++) {
                columnHeader = new PdfPCell(new Phrase(camposRiesgosList.get(column),normalFont));
                columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                columnHeader.setVerticalAlignment(Element.ALIGN_MIDDLE);
                //columnHeader.setBackgroundColor(guinda);
                tablaRiesgosDetectados.addCell(columnHeader);
            }
            tablaRiesgosDetectados.setWidths(new int[]{15,60,60,80,60});
            tablaRiesgosDetectados.setHeaderRows(1);
            
            // Rellenamos las filas de la tabla.
            PdfPCell cellContentRiesgos;           
            for (int row = 0; row < numRowsRiesgosDetectados; row++) {
                for (int column = 0; column < numColumnsRiesgosDetectados; column++) {
                    cellContentRiesgos = new PdfPCell(new Phrase(valoresRiesgoList.get(column),normalFont));
                    cellContentRiesgos.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    if(column==0||column==1||column==2 ||column==3 ||column==4 ||column==5 ||column==6){
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(647, 620));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Tareas");

        jLabel3.setText("Recursos disponibles");

        jLabel5.setText("Jucio de valor");

        jLabel6.setText("Requerimiento");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Bloquear al BIM 24 en\nRg Cruz de Hueso");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("3 Compañías de Fusileros, 1 Cía de Morteros, 1 Sec Ing Comb en A/D");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("El frente en Rg Cruz de\nHueso es de 4 Km y la\nprofundidad es de 8 Km, los\nrecursos disponibles no son\nsuficientes para ocupar y\nBLOQUEAR toda el AO\nasignada.");
        jTextArea3.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("1 Cía de Fus");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setText("EVALUACION DE RECURSOS DISPONIBLES");

        jButton1.setText("Generar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Abrir PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if(!nombre.isEmpty())
            abrir(nombre);
        else
            JOptionPane.showMessageDialog(null, "no se encuentra ese archivo con ese nombre","Atencion",2);
    }//GEN-LAST:event_jButton2ActionPerformed

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
        //  Imagen Imagen = new Imagen();
      
        
        //asignar columnas al modelo
        modelo.addColumn("Tareas");
        modelo.addColumn("Recursos disponibles");
        modelo.addColumn("Jucio de valor");
        modelo.addColumn("Requerimiento");
        Object [] fila = new Object[4];
        fila[0] = "MHCNC";
        fila[1] = "RCB 21, RCB 22, RCB 23, BTQ 20, Esc AT 2,GAB 2,GAAA 2,B Ing Blin 2 ";
        fila[2] = "Los recursos con que disponemos son adecuados para cumplir la misión";
        fila[3] = "";
       modelo.addRow(fila);
        //ASIGNAR modelo a la tabla
        //jTable2.setModel(modelo);
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
            java.util.logging.Logger.getLogger(Desarrollar_sect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desarrollar_sect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desarrollar_sect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desarrollar_sect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Desarrollar_sect dialog = new Desarrollar_sect(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables

//declarando el modelo de la tabla 
   DefaultTableModel modelo = new DefaultTableModel();
//declarando la fila del modelo 
   String fila[] = new String[5];
}
