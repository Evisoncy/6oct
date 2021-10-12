/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD.CRM;

import PMTD.GuiaIni;
import com.itextpdf.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;
import net.sf.clipsrules.jni.MultifieldValue;

/**
 *
 * @author WIMBER
 */
public class CRM extends javax.swing.JDialog {

    /**
     * Creates new form CRM
     */
    //Color
    private static BaseColor verdeClaro = new BaseColor(197,255,99);
    private static BaseColor amarillo = new BaseColor(255,255,0);
    private static BaseColor rosadoClaro = new BaseColor(255,135,207);
    private static BaseColor rojo = new BaseColor(255,0,0);
    private static BaseColor guinda = new BaseColor(212,0,0);
    private static BaseColor hueso = new BaseColor(255,253,219);
    private static BaseColor blanco = new BaseColor(255,255,255);
    
    private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
         
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);    
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD); 
    private static final Font tittleBold = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
    private static final Font HeaderWhite = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD,blanco); 
    private static final String iTextExampleImage = "/home/xules/codigoxules/iText-Example-image.png";

    private String resultadoAnalisis;
    
    String nombre ="riesgos";
    Environment clips;
    
    /*
    
    
    Environment clips;
    //Compilar
    //String categoriaRiesgoPath =  System.getProperty("user.dir")+"\\res\\clips\\cat_riesgo.CLP";
    //Construido
    String categoriaRiesgoPath =  System.getProperty("user.dir")+"\\clips\\cat_riesgo.CLP";
    public CRM(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //JOptionPane.showMessageDialog(null, categoriaRiesgoPath);
        //System.out.println( categoriaRiesgoPath);
        clips = new Environment();
        clips.load("cat_riesgos.CLP");
    */
    public CRM(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        clips = new Environment();
        clips.load("cat_riesgo.CLP");
        initComponents();
        this.setLocationRelativeTo(null);
    }

   public void Generar(String nombre) throws FileNotFoundException, DocumentException{
        if(!(jTextArea1.getText().isEmpty() || (jTextArea2.getText().isEmpty()) || (factor.getText().isEmpty()) || (riesgo.getText().isEmpty()) || (cat.getText().isEmpty()))){
            FileOutputStream archivo = new FileOutputStream(nombre + ".pdf");

            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            
            String probab=prob.getSelectedItem().toString();
            String impac =impacto.getSelectedItem().toString();
            
            documento.open();

            //Titulo
            Paragraph parrafo = new Paragraph("EVALUACIÓN DE RIESGOS \n\n",tittleBold);
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            //Tabla de riesgos detectados
            documento.add(new Paragraph("1. Riesgos detectados: \n\n",smallBold));
            
            //Nro de filas y columnas
            Integer numColumnsRiesgosDetectados = 6;
            Integer numRowsRiesgosDetectados = 1;
            
            // Creacion de la tabla
            PdfPTable tablaRiesgosDetectados = new PdfPTable(numColumnsRiesgosDetectados); 
            //Lista de campos de la cabecera
            ArrayList<String> camposRiesgosList =  new ArrayList<>();
            camposRiesgosList.add("NRO");
            camposRiesgosList.add("FUNCIÓN DE COMBATE");
            camposRiesgosList.add("PELIGRO IDENTIFICADO");
            camposRiesgosList.add("FACTOR POSIBILITANTE");
            camposRiesgosList.add("RIESGO");
            camposRiesgosList.add("EVALUACIÓN O ANÁLISIS");
            //Lista de campos de la cabecera
            ArrayList<String> valoresRiesgoList =  new ArrayList<>();
            valoresRiesgoList.add("1");
            valoresRiesgoList.add(jTextArea1.getText());
            valoresRiesgoList.add(jTextArea2.getText());
            valoresRiesgoList.add(factor.getText());
            valoresRiesgoList.add(riesgo.getText());
            valoresRiesgoList.add("P   :"+ probab + "\n"+"I:   "+ impac + "\n"+ "CR:" +resultadoAnalisis);
            //rellenamos los campos de la cabecera de la tabla
            PdfPCell columnHeader;              
            for (int column = 0; column < numColumnsRiesgosDetectados; column++) {
                columnHeader = new PdfPCell(new Phrase(camposRiesgosList.get(column),HeaderWhite));
                columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                columnHeader.setVerticalAlignment(Element.ALIGN_CENTER);
                columnHeader.setBackgroundColor(guinda);
                tablaRiesgosDetectados.addCell(columnHeader);
            }
            tablaRiesgosDetectados.setWidths(new int[]{30,60,90,100,80,80});
            tablaRiesgosDetectados.setHeaderRows(1);
            
            // Rellenamos las filas de la tabla.
            PdfPCell cellContentRiesgos;           
            for (int row = 0; row < numRowsRiesgosDetectados; row++) {
                for (int column = 0; column < numColumnsRiesgosDetectados; column++) {
                    cellContentRiesgos = new PdfPCell(new Phrase(valoresRiesgoList.get(column),normalFont));
                    cellContentRiesgos.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    if(column==0||column==1||column==2||column==3||column==4||column==5){
                        cellContentRiesgos.setHorizontalAlignment(Element.ALIGN_CENTER);                
                    }
                    cellContentRiesgos.setMinimumHeight(20);
                    cellContentRiesgos.setBackgroundColor(hueso);
                    tablaRiesgosDetectados.addCell(cellContentRiesgos);
                }
            }
            // We add the paragraph with the table (Añadimos el elemento con la tabla).
            documento.add(tablaRiesgosDetectados);
            
            documento.add(new Paragraph("\n"));

            documento.add(new Paragraph("2. Resumen de la Evaluacion de Matriz de riesgos: \n\n",smallBold ));
            //Resumen de evaluacion de matriz de riesgos
            Integer numColumns = 6;
            Integer numRows = 5;
            // We create the table (Creamos la tabla).
            PdfPTable tablaEvaluacionRiesgos = new PdfPTable(numColumns); 
            // Now we fill the PDF table 
            //
            ArrayList<String> impactoList =  new ArrayList<>();
            impactoList.add("Catastrofico");
            impactoList.add("Critico");
            impactoList.add("Marginal");
            impactoList.add("Insignificante");
            
            //
            ArrayList<String> ocurrenciaList =  new ArrayList<>();
            ocurrenciaList.add("Improbable");
            ocurrenciaList.add("Rara-vez");
            ocurrenciaList.add("Ocasional");
            ocurrenciaList.add("Probable");
            ocurrenciaList.add("Frecuente");
            
            // Ahora llenamos la tabla del PDF
            
            // Fill table rows (rellenamos las filas de la tabla).                
            
            tablaEvaluacionRiesgos.setHeaderRows(0);
            // Fill table rows (rellenamos las filas de la tabla.

            for (int row = 0; row < numRows-1; row++) {
                //col 0
                PdfPCell rowLeft = new PdfPCell(new Phrase(impactoList.get(row),normalFont));
                rowLeft.setHorizontalAlignment(Element.ALIGN_CENTER);
                rowLeft.setVerticalAlignment(Element.ALIGN_MIDDLE);
                rowLeft.setBorderWidth(0);
                tablaEvaluacionRiesgos.addCell(rowLeft);
                //col 1-maxcol
                for (int column = 1; column < numColumns; column++) {
                    
                    PdfPCell cellContent = new PdfPCell();
                    cellContent.setMinimumHeight(32);
                    cellContent.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellContent.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    if (impactoList.get(row).equalsIgnoreCase(impac)&&ocurrenciaList.get(column-1).equalsIgnoreCase(probab)){
                        cellContent.setPhrase(new Phrase(new Chunk("Riesgo 01",smallBold)));
                    }
                    
                    switch(""+row+column){
                        case "01":{
                            cellContent.setBackgroundColor(amarillo);
                            break;
                        }
                        case "02":
                        case "03":{
                            cellContent.setBackgroundColor(rosadoClaro);
                            break;
                        }
                        case "04":
                        case "05":{
                            cellContent.setBackgroundColor(rojo);
                            break;
                        }
                        case "11":{
                            cellContent.setBackgroundColor(verdeClaro);
                            break;
                        }
                        case "12":{
                            cellContent.setBackgroundColor(amarillo);
                            break;
                        }
                        case "13":
                        case "14":{
                            cellContent.setBackgroundColor(rosadoClaro);
                            break;
                        }
                        case "15":{
                            cellContent.setBackgroundColor(rojo);
                            break;
                        }
                        case "21":
                        case "22":{
                            cellContent.setBackgroundColor(verdeClaro);
                            break;
                        }
                        case "23":
                        case "24":{
                            cellContent.setBackgroundColor(amarillo);
                            break;
                        }
                        case "25":{
                            cellContent.setBackgroundColor(rosadoClaro);
                            break;
                        }
                        case "31":
                        case "32":
                        case "33":
                        case "34":{
                            cellContent.setBackgroundColor(verdeClaro);
                            break;
                        }
                        case "35":{
                            cellContent.setBackgroundColor(amarillo);
                            break;
                        }
                    }
                    tablaEvaluacionRiesgos.addCell(cellContent);
                }
            }
            PdfPCell cellVacio = new PdfPCell();
            cellVacio.setMinimumHeight(32);
            cellVacio.setBorderWidth(0);
            tablaEvaluacionRiesgos.addCell(cellVacio);
            
            PdfPCell columnFooter;
            for (int column = 1; column < numColumns; column++) {
                columnFooter = new PdfPCell(new Phrase(ocurrenciaList.get(column-1),normalFont));
                columnFooter.setHorizontalAlignment(Element.ALIGN_CENTER);
                columnFooter.setVerticalAlignment(Element.ALIGN_MIDDLE);
                columnFooter.setMinimumHeight(32);
                columnFooter.setBorderWidth(0);
                tablaEvaluacionRiesgos.addCell(columnFooter);
            }
            // We add the paragraph with the table (Añadimos el elemento con la tabla).
            documento.add(tablaEvaluacionRiesgos);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        factor = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        riesgo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prob = new javax.swing.JComboBox<>();
        impacto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("FUNCIÓN DE COMBATE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("EVALUACIÓN DE RIESGOS");

        jLabel1.setText("PELIGRO IDENTIFICADO");

        jLabel2.setText("FACTOR POSIBILITANTE");

        factor.setColumns(20);
        factor.setLineWrap(true);
        factor.setRows(5);
        factor.setText("AMARILLO dispone de una (01) Cía de FFEE en PISCO las que pueden realizar incursiones contra PC e instalaciones administrativas");
        factor.setWrapStyleWord(true);
        jScrollPane1.setViewportView(factor);

        jLabel4.setText("RIESGO");

        riesgo.setText("Destrucción de nuestro PC");

        jButton4.setText("Generar PDF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Evaluar probabilidad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Evaluar impacto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Abrir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("EVALUACIÓN DE LA CATEGORIA");

        jLabel7.setText("PROBABILIDAD");

        prob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "frecuente", "probable", "ocasional", "rara-vez", "improbable" }));
        prob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probActionPerformed(evt);
            }
        });

        impacto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "catastrofico", "critico", "marginal", "insignificante" }));
        impacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impactoActionPerformed(evt);
            }
        });

        jLabel8.setText("IMPACTO");

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel5.setText("CATEGORIA DEL RIESGO");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Movimiento y Maniobra");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("El enemigo puede efectuar operaciones de sabotaje en nuestra retaguardia\n");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel9)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(impacto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prob, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProcesar))
                            .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton4)
                        .addGap(80, 80, 80)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(riesgo, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(riesgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(prob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(impacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnProcesar)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
            Generar(nombre);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null,ex);
        } catch (DocumentException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EvImp ei = new EvImp(null, true);
        ei.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EvProb ep = new EvProb(null, true);
        ep.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void probActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probActionPerformed

    private void impactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_impactoActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        String profesor, curso, horario, faltas, hecho;
        profesor = prob.getSelectedItem().toString();
        curso = impacto.getSelectedItem().toString();
        

        hecho = "(assert" +
        "(categoria-riesgo" +
        "(prob " + profesor + ")" +
        "(impacto " + curso +")))"  ;
       

        clips.eval(hecho);
        clips.run();

        String evaluador = "(find-all-facts ((?m recomendacion)) TRUE)";

        FactAddressValue fv = (FactAddressValue) ((MultifieldValue) clips.eval(evaluador)).get(0);

        try {
            resultadoAnalisis = fv.getFactSlot("mensaje").toString();
            JOptionPane.showMessageDialog(null,"La categoria del riesgo es "+ resultadoAnalisis);
            cat.setText("La categoria del riesgo es "+resultadoAnalisis);
            clips.reset();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(!nombre.isEmpty())
            abrir(nombre);
        else
            JOptionPane.showMessageDialog(null, "no se encuentra ese archivo con ese nombre","Atencion",2);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(CRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CRM dialog = new CRM(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnProcesar;
    private javax.swing.JTextField cat;
    private javax.swing.JTextArea factor;
    private javax.swing.JComboBox<String> impacto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JComboBox<String> prob;
    private javax.swing.JTextField riesgo;
    // End of variables declaration//GEN-END:variables
}
