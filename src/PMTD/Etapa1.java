/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD;


import Herramientas.HelpConstructor;
import PMTD.EValInicial.evaInicial;
import Visual.MostrarPDF;
import Visual.PDF;
import java.awt.Menu;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author argen
 */
public class Etapa1 extends javax.swing.JPanel {

    /**
     * Creates new form Etapa1
     */
    public Etapa1() {
        
        initComponents();
    }
    private Class<?>[] typeParametter = HelpConstructor.getTypeParameter(java.awt.Frame.class, boolean.class );
    private organizacionDialog actividad_2;
    private PDF actividad_3;
    private ActSit actividad_4;
    private Establecer_enlace1 actividad_5;
    private evaInicial actividad_6;
    private GuiaIni guiaIniciacion;
    private OrdenP ordenPreparatoria_1;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(650, 460));
        setPreferredSize(new java.awt.Dimension(650, 460));
        setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(280, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(280, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(280, 30));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(30, 90, 280, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 2.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(280, 30));
        jButton3.setMinimumSize(new java.awt.Dimension(280, 30));
        jButton3.setPreferredSize(new java.awt.Dimension(280, 30));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(30, 140, 280, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 3.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(280, 30));
        jButton4.setMinimumSize(new java.awt.Dimension(280, 30));
        jButton4.setPreferredSize(new java.awt.Dimension(280, 30));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(30, 190, 280, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 4.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(280, 30));
        jButton5.setMinimumSize(new java.awt.Dimension(280, 30));
        jButton5.setPreferredSize(new java.awt.Dimension(280, 30));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(30, 240, 280, 30);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 5.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(280, 30));
        jButton6.setMinimumSize(new java.awt.Dimension(280, 30));
        jButton6.setPreferredSize(new java.awt.Dimension(280, 30));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(30, 290, 280, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Salida 1.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(280, 30));
        jButton2.setMinimumSize(new java.awt.Dimension(280, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(280, 30));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(30, 340, 280, 30);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Salida 2.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setMaximumSize(new java.awt.Dimension(280, 30));
        jButton7.setMinimumSize(new java.awt.Dimension(280, 30));
        jButton7.setPreferredSize(new java.awt.Dimension(280, 30));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7);
        jButton7.setBounds(30, 390, 280, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/etapa1/etapa1fondo.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 60, 340, 400);

        jLabel4.setBackground(new java.awt.Color(86, 96, 62));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RECEPCIÓN DE LA MISIÓN");
        jLabel4.setOpaque(true);
        add(jLabel4);
        jLabel4.setBounds(0, 0, 340, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //jButton1.setLocation(0,0);
        actividad_2 =  (organizacionDialog) HelpConstructor.objectCreator(actividad_2,organizacionDialog.class,typeParametter, null,true);
        actividad_2.setLocationRelativeTo(null);
        actividad_2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        /*ReunirHe r = new ReunirHe(null,true);
        r.setLocationRelativeTo(null);
        r.setVisible(true);*/
        actividad_3 =  (PDF) HelpConstructor.objectCreator(guiaIniciacion,PDF.class,typeParametter, null,true);
        actividad_3.setLocationRelativeTo(null);
        actividad_3.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /*ActSitAprec asap = new ActSitAprec();
        asap.setLocationRelativeTo(null);
        asap.setVisible(true);*/
        
        //agregado al menu principal
        actividad_4 =  (ActSit) HelpConstructor.objectCreator(actividad_4,ActSit.class,typeParametter, null,true);
        actividad_4.setLocationRelativeTo(null);
        actividad_4.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        actividad_5 =  (Establecer_enlace1) HelpConstructor.objectCreator(actividad_5,Establecer_enlace1.class,typeParametter, null,true);
        actividad_5.setLocationRelativeTo(null);
        actividad_5.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       actividad_6 =  (evaInicial) HelpConstructor.objectCreator(actividad_6,evaInicial.class,typeParametter, null,true);
       actividad_6.setLocationRelativeTo(null);
       actividad_6.setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       actividad_6 =  (evaInicial) HelpConstructor.objectCreator(actividad_6,evaInicial.class,typeParametter, null,true);
       guiaIniciacion =  (GuiaIni) HelpConstructor.objectCreator(guiaIniciacion,GuiaIni.class,typeParametter, null,true);
       guiaIniciacion.setLocationRelativeTo(null);
       guiaIniciacion.setValoresIniciales(actividad_6.getTimeincial(),actividad_6.getModeloMetodo(), actividad_6.getIndexMetodo());
       guiaIniciacion.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Class<?>[] typeParametter = HelpConstructor.getTypeParameter(java.awt.Frame.class, boolean.class );
        ordenPreparatoria_1 =  (OrdenP) HelpConstructor.objectCreator(ordenPreparatoria_1,OrdenP.class,typeParametter, null,true);
        ordenPreparatoria_1.setLocationRelativeTo(null);
        ordenPreparatoria_1.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        //jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 1 - Seleccionable.png")));
        
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 1.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        //jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 2 - Seleccionable.png"))); // NOI18N
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 2.png"))); // NOI18N
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 3 - Seleccionable.png"))); // NOI18N
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        //jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 3.png"))); // NOI18N
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        //jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 4 - Seleccionable.png"))); // NOI18N

    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 4.png"))); // NOI18N
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        //jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 5 - Seleccionable.png"))); // NOI18N
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Actividad 5.png"))); // NOI18N
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
         //jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Salida 1 - Seleccionable.png"))); // NOI18N
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Salida 1.png"))); // NOI18N
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        //jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Salida 2 - Seleccionable.png"))); // NOI18N

    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ra etapa/botones/Etapa 1 - Salida 2.png"))); // NOI18N

    }//GEN-LAST:event_jButton7MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
