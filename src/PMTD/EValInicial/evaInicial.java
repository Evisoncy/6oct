/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD.EValInicial;

import PMTD.GuiaIni;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author WIMBER
 */
public class evaInicial extends javax.swing.JDialog {

    /**
     * Creates new form evaInicial
     */
    String nombre="EvaInicial";
    public evaInicial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        seleccion();
    }
    
    public void seleccion() {
        jPanel3.removeAll();
        jPanel3.add(panelPlaneamientoParalelo);
        jPanel3.repaint();
        jPanel3.revalidate();
    }
    
    public void Generar1(String nombre) throws FileNotFoundException, DocumentException{
        if(!(jTextField1.getText().isEmpty() || (jTextField38.getText().isEmpty()) || (jTextField21.getText().isEmpty()))){
            FileOutputStream archivo = new FileOutputStream(nombre + ".pdf"); 
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            
            Paragraph parrafo = new Paragraph("ORDEN PREPARATORIA N°1 \n\n");
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            documento.add(new Paragraph("Planteamiento Paralelo \n" + "Regla de 1/5" + "\n"));
            documento.add(new Paragraph("Tiempo Total Disponible \n" + jTextField38.getText() + "\n"));
            documento.add(new Paragraph("Tiempo Asignado \n" + " Días: " + jTextField1.getText() + "\n" + " Horas: " + jTextField21.getText() + "\n"));
            documento.add(new Paragraph("Etapas y pasos del PMTD \n"));
            documento.add(new Paragraph("Análisis de la misión \n" + " %Planteamiento: " + jTextField2.getText() + "\n" + "Tiempo en Días: " + jTextField3.getText() + "\n" + "Tiempo en Horas: " + jTextField33.getText() + "\n"));
            documento.add(new Paragraph("Elaboración de los cursos \n" + " %Planteamiento: " + jTextField4.getText() + "\n" + "Tiempo en Días: " + jTextField10.getText() + "\n" + "Tiempo en Horas: " + jTextField36.getText() + "\n"));
            documento.add(new Paragraph("Análisis/Comparación \n" + " %Planteamiento: " + jTextField5.getText() + "\n" + "Tiempo en Días: " + jTextField9.getText() + "\n" + "Tiempo en Horas: " + jTextField35.getText() + "\n"));
            documento.add(new Paragraph("Desarrollo del Plan \n" + " %Planteamiento: " + jTextField6.getText() + "\n" + "Tiempo en Días: " + jTextField8.getText() + "\n" + "Tiempo en Horas: " + jTextField34.getText() + "\n"));
            documento.add(new Paragraph("Tiempo Total \n" + " %Planteamiento: " + jTextField7.getText() + "\n" + "Tiempo en Días: " + jTextField11.getText() + "\n" + "Tiempo en Horas: " + jTextField37.getText() + "\n"));
            documento.add(new Paragraph("Reducit el PMTD: " + jComboBox2.getSelectedItem().toString() + "\n"));
            documento.add(new Paragraph("Organizaciones a Integrar \n" + jTextField19.getText() + "\n"));
            
            //documento.add(new Paragraph("asdsad: " + xd))
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo pdf fue creado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Llenar los campos");    
        }
    }
    
    public void Generar2(String nombre) throws FileNotFoundException, DocumentException{
        if(!(jTextField32.getText().isEmpty() || (jTextField22.getText().isEmpty()) || (jTextField12.getText().isEmpty()))){
            FileOutputStream archivo = new FileOutputStream(nombre + ".pdf"); 
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            
            Paragraph parrafo = new Paragraph("ORDEN PREPARATORIA N°1 \n\n");
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            documento.add(new Paragraph("Planteamiento Secuencial \n" + "Regla de 1/3" + "\n"));
            documento.add(new Paragraph("Tiempo Total Disponible \n" + jTextField32.getText() + "\n"));
            documento.add(new Paragraph("Tiempo Asignado \n" + " Días: " + jTextField12.getText() + "\n" + " Horas: " + jTextField22.getText() + "\n"));
            documento.add(new Paragraph("Etapas y pasos del PMTD \n"));
            documento.add(new Paragraph("Análisis de la misión \n" + " %Planteamiento: " + jTextField16.getText() + "\n" + "Tiempo en Días: " + jTextField13.getText() + "\n" + "Tiempo en Horas: " + jTextField28.getText() + "\n"));
            documento.add(new Paragraph("Elaboración de los cursos \n" + " %Planteamiento: " + jTextField15.getText() + "\n" + "Tiempo en Días: " + jTextField24.getText() + "\n" + "Tiempo en Horas: " + jTextField31.getText() + "\n"));
            documento.add(new Paragraph("Análisis/Comparación \n" + " %Planteamiento: " + jTextField23.getText() + "\n" + "Tiempo en Días: " + jTextField26.getText() + "\n" + "Tiempo en Horas: " + jTextField30.getText() + "\n"));
            documento.add(new Paragraph("Desarrollo del Plan \n" + " %Planteamiento: " + jTextField25.getText() + "\n" + "Tiempo en Días: " + jTextField17.getText() + "\n" + "Tiempo en Horas: " + jTextField27.getText() + "\n"));
            documento.add(new Paragraph("Tiempo Total \n" + " %Planteamiento: " + jTextField18.getText() + "\n" + "Tiempo en Días: " + jTextField18.getText() + "\n" + "Tiempo en Horas: " + jTextField29.getText() + "\n"));
            documento.add(new Paragraph("Reducit el PMTD: " + jComboBox1.getSelectedItem().toString() + "\n"));
            documento.add(new Paragraph("Organizaciones a Integrar \n" + jTextField20.getText() + "\n"));

            //documento.add(new Paragraph("asdsad: " + xd))
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        panelPlaneamientoSecuencial = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        panelPlaneamientoParalelo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EVALUACIÓN INICIAL ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        jRadioButton1.setText("Secuencial");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Paralelo");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 92, -1));

        jPanel3.setLayout(new java.awt.CardLayout());

        panelPlaneamientoSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Planeamiento Secuencial / Regla 1/3"));
        panelPlaneamientoSecuencial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Tiempo Asignado:");
        panelPlaneamientoSecuencial.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 20));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        panelPlaneamientoSecuencial.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 40, -1));

        jLabel12.setText("Analisis de la mision");
        panelPlaneamientoSecuencial.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 133, 20));

        jLabel13.setText("Elaboracion de los cursos");
        panelPlaneamientoSecuencial.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 155, 20));

        jLabel14.setText("Total Tiempo");
        panelPlaneamientoSecuencial.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 106, 20));
        panelPlaneamientoSecuencial.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 60, -1));
        panelPlaneamientoSecuencial.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 60, -1));

        jTextField15.setText("20%");
        panelPlaneamientoSecuencial.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 90, -1));

        jLabel15.setText("Etapas y pasos del PMTD");
        panelPlaneamientoSecuencial.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel16.setText("% Planeamiento");
        panelPlaneamientoSecuencial.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, -1));

        jLabel17.setText("En horas");
        panelPlaneamientoSecuencial.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jTextField16.setText("30%");
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        panelPlaneamientoSecuencial.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 90, 22));
        panelPlaneamientoSecuencial.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 60, -1));

        jTextField18.setText("100%");
        panelPlaneamientoSecuencial.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 90, -1));

        jLabel18.setText("Organizaciones a integrar");
        panelPlaneamientoSecuencial.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 158, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panelPlaneamientoSecuencial.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 90, -1));

        jLabel19.setText("Reducir el PMTD");
        panelPlaneamientoSecuencial.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 106, 20));
        panelPlaneamientoSecuencial.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 260, 40));

        jLabel24.setText("Dias");
        panelPlaneamientoSecuencial.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 20));
        panelPlaneamientoSecuencial.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 60, -1));

        jLabel25.setText("Horas");
        panelPlaneamientoSecuencial.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 20));

        jTextField23.setText("30%");
        panelPlaneamientoSecuencial.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 90, -1));

        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        panelPlaneamientoSecuencial.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 60, -1));

        jTextField25.setText("20%");
        panelPlaneamientoSecuencial.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 90, -1));
        panelPlaneamientoSecuencial.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 60, -1));

        jLabel26.setText("Analisis /Comparacion");
        panelPlaneamientoSecuencial.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 155, 20));

        jLabel27.setText("Desarrollo del plan");
        panelPlaneamientoSecuencial.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 155, 20));
        panelPlaneamientoSecuencial.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 70, -1));
        panelPlaneamientoSecuencial.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 70, -1));
        panelPlaneamientoSecuencial.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 70, -1));
        panelPlaneamientoSecuencial.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 70, -1));

        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        panelPlaneamientoSecuencial.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 70, -1));

        jLabel28.setText("Tiempo Total Disponible");
        panelPlaneamientoSecuencial.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 20));

        jTextField32.setText("112");
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });
        panelPlaneamientoSecuencial.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 40, -1));

        jLabel29.setText("Dias");
        panelPlaneamientoSecuencial.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 20));

        jButton2.setText("Generar informe");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelPlaneamientoSecuencial.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelPlaneamientoSecuencial.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 150, 50));

        jButton6.setText("Abrir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelPlaneamientoSecuencial.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel34.setText("Tiempo Acumulado ");
        panelPlaneamientoSecuencial.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, 30));

        jLabel35.setText("En días");
        panelPlaneamientoSecuencial.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jPanel3.add(panelPlaneamientoSecuencial, "card3");
        panelPlaneamientoSecuencial.getAccessibleContext().setAccessibleParent(panelPlaneamientoSecuencial);

        panelPlaneamientoParalelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Planeamiento Paralelo/ Regla de 1/5"));
        panelPlaneamientoParalelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Tiempo Asignado:");
        panelPlaneamientoParalelo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelPlaneamientoParalelo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 40, -1));

        jLabel1.setText("Etapas y pasos del PMTD ");
        panelPlaneamientoParalelo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel2.setText("En horas");
        panelPlaneamientoParalelo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel3.setText("% Planeamiento");
        panelPlaneamientoParalelo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 90, -1));

        jLabel4.setText("Analisis de la mision");
        panelPlaneamientoParalelo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel6.setText("Analisis/ comparacion");
        panelPlaneamientoParalelo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jLabel7.setText("Elaboracion de los cursos");
        panelPlaneamientoParalelo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        jLabel8.setText("Desarrollo del plan");
        panelPlaneamientoParalelo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        jLabel10.setText("Tiempo total");
        panelPlaneamientoParalelo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jTextField2.setText("30%");
        panelPlaneamientoParalelo.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 90, -1));
        panelPlaneamientoParalelo.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 60, -1));

        jTextField4.setText("20%");
        panelPlaneamientoParalelo.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 90, -1));

        jTextField5.setText("30%");
        panelPlaneamientoParalelo.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 90, -1));

        jTextField6.setText("20%");
        panelPlaneamientoParalelo.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 90, -1));

        jTextField7.setText("100%");
        panelPlaneamientoParalelo.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 90, -1));
        panelPlaneamientoParalelo.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 60, -1));
        panelPlaneamientoParalelo.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 60, -1));
        panelPlaneamientoParalelo.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 60, -1));
        panelPlaneamientoParalelo.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 60, -1));

        jLabel20.setText("Reducir el PMTD");
        panelPlaneamientoParalelo.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 106, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        panelPlaneamientoParalelo.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 90, -1));

        jLabel21.setText("Organizaciones a integrar");
        panelPlaneamientoParalelo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 158, -1));
        panelPlaneamientoParalelo.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 260, 40));

        jLabel22.setText("Dias");
        panelPlaneamientoParalelo.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 20));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        panelPlaneamientoParalelo.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 60, -1));

        jLabel23.setText("Horas");
        panelPlaneamientoParalelo.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 20));
        panelPlaneamientoParalelo.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 70, -1));
        panelPlaneamientoParalelo.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 70, -1));
        panelPlaneamientoParalelo.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 70, -1));
        panelPlaneamientoParalelo.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 70, -1));
        panelPlaneamientoParalelo.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 70, -1));

        jLabel30.setText("Tiempo Total Disponible");
        panelPlaneamientoParalelo.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 20));

        jTextField38.setText("112");
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });
        panelPlaneamientoParalelo.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 40, -1));

        jLabel31.setText("Dias");
        panelPlaneamientoParalelo.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 20));

        jButton1.setText("Generar Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelPlaneamientoParalelo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelPlaneamientoParalelo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 150, 50));

        jButton5.setText("Abrir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelPlaneamientoParalelo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel32.setText("Tiempo Acumulado ");
        panelPlaneamientoParalelo.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 84, -1, 20));

        jLabel33.setText("En dias");
        panelPlaneamientoParalelo.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jPanel3.add(panelPlaneamientoParalelo, "card3");
        panelPlaneamientoParalelo.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, 530, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        ((CardLayout) jPanel3.getLayout()).show(jPanel3, "Planteamiento Paralelo");
        jPanel3.removeAll();
        jPanel3.add(panelPlaneamientoParalelo);
        jPanel3.repaint();
        jPanel3.revalidate();

        if (jRadioButton2.isSelected() == true) {
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    ((CardLayout) jPanel3.getLayout()).show(jPanel3, "Planteamiento Secuencial");
        jPanel3.removeAll();
        jPanel3.add(panelPlaneamientoSecuencial);
        jPanel3.repaint();
        jPanel3.revalidate();

        if (jRadioButton1.isSelected() == true) {
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Generar2(nombre);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null,ex);
        } catch (DocumentException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');

        DecimalFormat formato1 = new DecimalFormat("#.00", separadoresPersonalizados);
        
        float diasA = Float.parseFloat(jTextField32.getText());
        diasA=(diasA/3);
        float diasAM= (diasA*3)/10;
        float diasAE= (diasA*2)/10;
        float diasH = diasA*24;
        float diasAMH= diasAM*24;
        float diasAEH= diasAE*24;
        String diasAC = formato1.format(diasA);
        String diasHC = formato1.format(diasH);
        String diasAMC = formato1.format(diasAM);
        String diasAMCH = formato1.format(diasAMH);
        String diasAEC = formato1.format(diasAE);
        String diasAECH = formato1.format(diasAEH);
        jTextField12.setText(diasAC);
        jTextField22.setText(diasHC);
        jTextField13.setText(diasAMC);
        jTextField26.setText(diasAMC);
        jTextField28.setText(diasAMCH);
        jTextField30.setText(diasAMCH);
        jTextField24.setText(diasAEC);
        jTextField17.setText(diasAEC);
        jTextField31.setText(diasAECH);
        jTextField27.setText(diasAECH);
        jTextField14.setText(diasAC);
        jTextField29.setText(diasHC);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Generar1(nombre);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null,ex);
        } catch (DocumentException ex) {
            Logger.getLogger(GuiaIni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');

        DecimalFormat formato1 = new DecimalFormat("#.00", separadoresPersonalizados);
        
        float diasA = Float.parseFloat(jTextField38.getText());
        diasA=(diasA/5);
        float diasAM= (diasA*3)/10;
        float diasAE= (diasA*2)/10;
        float diasH = diasA*24;
        float diasAMH= diasAM*24;
        float diasAEH= diasAE*24;
        String diasAC = formato1.format(diasA);
        String diasHC = formato1.format(diasH);
        String diasAMC = formato1.format(diasAM);
        String diasAMCH = formato1.format(diasAMH);
        String diasAEC = formato1.format(diasAE);
        String diasAECH = formato1.format(diasAEH);
        jTextField1.setText(diasAC);
        jTextField21.setText(diasHC);
        jTextField3.setText(diasAMC);
        jTextField9.setText(diasAMC);
        jTextField33.setText(diasAMCH);
        jTextField35.setText(diasAMCH);
        jTextField10.setText(diasAEC);
        jTextField8.setText(diasAEC);
        jTextField36.setText(diasAECH);
        jTextField34.setText(diasAECH);
        jTextField11.setText(diasAC);
        jTextField37.setText(diasHC);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!nombre.isEmpty())
            abrir(nombre);
        else
            JOptionPane.showMessageDialog(null, "no se encuentra ese archivo con ese nombre","Atencion",2);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(evaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(evaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(evaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(evaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                evaInicial dialog = new evaInicial(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel panelPlaneamientoParalelo;
    private javax.swing.JPanel panelPlaneamientoSecuencial;
    // End of variables declaration//GEN-END:variables
}
