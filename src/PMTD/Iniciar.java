/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD;

import Herramientas.HelpConstructor;
import Visual.MostrarPDF;
import Visual.PDF;
import java.applet.AudioClip;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;

/**
 *
 * @author Argenis
 */
public class Iniciar extends javax.swing.JFrame implements Runnable{
    
    /**
     * Creates new form NewJFrame
     */
    static int contador=1;
     static  JLabel imagenk;
     static ImageIcon icono;
     Thread hilo;
     Menu menu;
    public Iniciar() {
        
        hilo = new Thread(this);
        hilo.start();
//        setLayout(null);
//        imagen = new JLabel();
//        icono = new ImageIcon("src/PMTD/1.jpeg");
//        imagen.setIcon(icono);
//        imagen.setBounds(300, 50, 200, 200);
//        imagen.setSize(500, 500);
//        
//        add(imagen);
        initComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
        try{
        
        MusicaFondo.inicializarMusica("musica/prueba.wav");
        MusicaFondo.reproducirMusica();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
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

        vistaLogin = new javax.swing.JPanel();
        encabezado = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        ingresar = new javax.swing.JButton();
        documentacion = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pieDePagina = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        VistaCarrusel = new javax.swing.JPanel();
        prev = new javax.swing.JButton();
        next = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vistaLogin.setBackground(new java.awt.Color(31, 103, 92));
        vistaLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vistaLogin.setMinimumSize(new java.awt.Dimension(320, 360));
        vistaLogin.setVerifyInputWhenFocusTarget(false);
        vistaLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        encabezado.setOpaque(false);
        encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Encabezado/escudo.png"))); // NOI18N
        logo.setText("jLabel8");
        encabezado.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 20, 90, 120));

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("PROCESO MILITAR DE TOMA DE DECISIONES");
        encabezado.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 320, 60));

        vistaLogin.add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 200));

        login.setOpaque(false);
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Login/Botones/Ingresar.png"))); // NOI18N
        ingresar.setContentAreaFilled(false);
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        login.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 60, 272, 32));

        documentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Login/Botones/Registrar Documentación.png"))); // NOI18N
        documentacion.setContentAreaFilled(false);
        documentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentacionActionPerformed(evt);
            }
        });
        login.add(documentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 110, 272, 32));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        login.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 10, 240, 32));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Login/Input/Usuario.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        login.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 10, 272, 32));

        vistaLogin.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 320, 160));

        pieDePagina.setOpaque(false);
        pieDePagina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieDePagina.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 100));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sin-sonido.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pieDePagina.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simbolo-de-interfaz-de-sonido-dibujado-a-mano-de-un-altavoz.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pieDePagina.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 30, 50, -1));

        vistaLogin.add(pieDePagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 320, 100));

        getContentPane().add(vistaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        VistaCarrusel.setBackground(new java.awt.Color(46, 146, 160));
        VistaCarrusel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Login/Botones/left-chevron (2).png"))); // NOI18N
        prev.setContentAreaFilled(false);
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        VistaCarrusel.add(prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Login/Botones/right-arrow (1).png"))); // NOI18N
        next.setContentAreaFilled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        VistaCarrusel.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Fondo/1.jpeg"))); // NOI18N
        imagen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        imagen.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        VistaCarrusel.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 460));

        getContentPane().add(VistaCarrusel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 600, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MusicaFondo.detenerMusica();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MusicaFondo.reproducirMusica();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        menu = (Menu)HelpConstructor.objectCreator(menu, Menu.class, HelpConstructor.getTypeParameter(Iniciar.class), this);
        this.setVisible(false);
        menu.setVisible(true);
        JOptionPane.showMessageDialog(this, "Bienvenido Comandante");
    }//GEN-LAST:event_ingresarActionPerformed

    private void documentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentacionActionPerformed
        PDF f = new PDF(null,true);
        f.setVisible(true);
    }//GEN-LAST:event_documentacionActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
       if(evt.getSource() == prev){
            if(contador <=1){
                contador=3;
            }else{
                contador--;
            }
        }
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Fondo/"+contador+".jpeg")));

    }//GEN-LAST:event_prevActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(evt.getSource() == next){
            if(contador >=3){
                contador=1;
            }else{
                contador++;
            }
        }
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Fondo/"+contador+".jpeg")));
        

    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VistaCarrusel;
    private javax.swing.JButton documentacion;
    private javax.swing.JPanel encabezado;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logo;
    private javax.swing.JButton next;
    private javax.swing.JPanel pieDePagina;
    private javax.swing.JButton prev;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JPanel vistaLogin;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (hilo!= null) {
        try {
            for (int i = 1; i <= 3; i++) {
                //imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/"+i+".jpeg")));
                imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio/Fondo/"+i+".jpeg"))); 
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }
}
