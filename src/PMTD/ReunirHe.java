/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Diegoelchoche
 */
public class ReunirHe extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    
    public class AgregarArchivos{
    private boolean Active_Ruta, Active_Ruta1, Active_Ruta2, Active_Ruta3, Active_Ruta4;
 
    public ArrayList<String> introduceFiles(String ruta, JList<String> jList1, ArrayList<String> list_ext, boolean Active_Ruta, boolean Active_Ruta1, boolean Active_Ruta2, boolean Active_Ruta3, boolean Active_Ruta4)
    {
        this.Active_Ruta = Active_Ruta;
        this.Active_Ruta1 = Active_Ruta1;
        this.Active_Ruta2 = Active_Ruta2;
        this.Active_Ruta3 = Active_Ruta3;
        this.Active_Ruta4 = Active_Ruta4;
 
        //Creamos un ArrayList donde vamos almacenar los archivos con las extensiones posibles.
        ArrayList<String> arraylistDatos = new ArrayList<>();
 
        //Llamamos al metodo para que agregue todos los archivos de las rutas mas la ruta por defecto.
        ArrayList<String> list_Files = agrega_Rutas(ruta);
 
        //Agregamos todos los archivos que contenga la ruta especifica con el metodo .list();
	String []agrega_Files = new String[list_Files.size()];
 
        int t=0;
        for (String file : list_Files)
        {
            agrega_Files[t] = file;
            t++;
        }
 
        //Recorremos el Array con un bucle forEach para almacenar los posibles archivos con extensiones.
        for (String objeto : agrega_Files)
        {
            //Evaluamos las posibles extensiones que contempla el ArrayList<?>.
            list_ext.forEach((String extt) ->
            {
                //Obtenemos la extension del archivo (Este metodo precisa de una libreria EXTERNA).
                String Extension = FilenameUtils.getExtension(objeto);
 
                //Evaluamos que la extension obtenida sea igual que la pasada por el ArrayList.
                if (Extension.equalsIgnoreCase(extt))
                    //Agregamos el objeto al ArrayList.
                    arraylistDatos.add(objeto);
            });
        }
 
        //Creamos un Arreglo de clase donde almacenaremos todos los datos pertinentes de los archivos el tamaño del arreglo depende del Arreglo arrylistDatos.
        OrdenarTamanoFile []datosfiles = new OrdenarTamanoFile[arraylistDatos.size()];
 
        int indice=0;
        for (String path: arraylistDatos)
        {
            File file = new File(path);
            datosfiles[indice] = new OrdenarTamanoFile(path, file.getName(), FilenameUtils.getExtension(path), getPesofile(path));
            indice++;
        }
 
        //Usamos la Clase Arrays con su metodo sort() para hacer un ordenamiento de datos.
        Arrays.sort(datosfiles);
 
        //Eliminamos todo el contenido del ArrayList<> para pasar el nuevo y ordenado Arreglo.
        arraylistDatos.clear();
 
        //Vamos a dar un tamaño Exacto de datos para el Arreglo de String.
        agrega_Files = new String[datosfiles.length];
        indice=0;
        for (OrdenarTamanoFile obtenerdatos: datosfiles)
        {
            File file = new File(obtenerdatos.getPath());
            //Agregamos a la vez en los dos Array en uno el nombre del archivo en el otro la ruta de acceso al archivo.
            agrega_Files[indice] = file.getName();
            arraylistDatos.add(obtenerdatos.getPath());
 
            indice++;
        }
 
        //Por ultimo para terminar con el metodo de la clase añadimos el contenido del Arreglo de String al JList
        jList1.setListData(agrega_Files);
 
        //Datos finalizados mostrados en consola
        for (OrdenarTamanoFile d: datosfiles)
        {
            System.out.println(d.getNombrefile() +"\t\t\t"+d.getExtensionfile()+"\t\t"+d.getPath()+"\t"+d.getPesofile());
        }
        System.out.println("-------------------------------");
        
 
        return arraylistDatos;
    }
 
    //Metodo encargado de obtener el bytes el tamado de los archivos al mismo tiempo redondea la variable arriba.
    public long getPesofile(String rutaFile)
    {
        File file = new File(rutaFile);
        return Math.round(Math.ceil(file.length()));
    }
 
    //Metodo encargado de preparar las diferente rutas para obtener archivos.
    public ArrayList<String> agrega_Rutas(String ruta)
    {
        String r1 = System.getProperty("user.dir")+"/Documents";
        //String r2 = System.getProperty("user.home")+"/Pictures";
        //String r3 = System.getProperty("user.home")+"/Music";
        //String r4 = System.getProperty("user.home")+"/Downloads";
 
        ArrayList<String> allFiles = new ArrayList<>();
 
        //Agregamos todos los archivos que contenga la ruta especifica con el metodo .list();
	String []rut_default = new File(ruta).list();
        String []rut_documentos = new File(r1).list();
        //String []rut_imagenes = new File(r2).list();
        //String []rut_musica = new File(r3).list();
        //String []rut_descarga = new File(r4).list();
 
        if (Active_Ruta)
            Anadir_File(rut_default, allFiles, ruta);
        if (Active_Ruta1)
            Anadir_File(rut_documentos, allFiles, r1);
        //if (Active_Ruta2)
        //    Anadir_File(rut_imagenes, allFiles, r2);
        //if(Active_Ruta3)
        //    Anadir_File(rut_musica, allFiles, r3);
        //if (Active_Ruta4)
        //    Anadir_File(rut_descarga, allFiles, r4);
 
        return allFiles;
    }
 
    //Metodo que devuelve un ArrayList con toda la lista de archivos contenidos en los directorios ruta.
    public ArrayList<String> Anadir_File(String []arreglo, ArrayList<String> arraylist, String rutt)
    {
        try
        {
            for (String arreglo1 : arreglo) {
                arraylist.add(rutt + "/" + arreglo1);
            }
            return arraylist;
        }catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null, "El directoria al que hace referencia no exite!!", "Error", 0);
            System.out.println("Error en vinculacion de una ruta " + rutt + "\n" + e);
            System.out.println(getClass());
        }
        return null;
    }
 
    //Clase que implementa la inteface Comparable encargada de ordenar el Array de Clase.
    private class OrdenarTamanoFile implements Comparable
    {
        public String path, nombrefile, extensionfile;
        public long pesofile;
 
        public OrdenarTamanoFile(String path, String nombrefile, String extensionfile, long pesofile)
        {
            this.path = path;
            this.nombrefile = nombrefile;
            this.extensionfile = extensionfile;
            this.pesofile = pesofile;
        }
 
        public String getPath() {
            return path;
        }
 
        public String getNombrefile() {
            return nombrefile;
        }
 
        public String getExtensionfile() {
            return extensionfile;
        }
 
        public long getPesofile() {
            return pesofile;
        }
 
        @Override
        public int compareTo(Object objeto)
        {
            OrdenarTamanoFile elementodato = (OrdenarTamanoFile) objeto;
 
            if (this.pesofile < elementodato.pesofile)
                return -1;
            else
                return 1;
        }
 
    }
}
        
    public ReunirHe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        AgregarArchivos a = new AgregarArchivos();
        String ruta = System.getProperty("user.dir")+"/Documentos" ;
        ArrayList<String> list_ext = new ArrayList<>();
        list_ext.add("docx");
        list_ext.add("pdf");
        list_ext.add("txt");
        a.introduceFiles(ruta, jList1, list_ext, true, false, false, false, false);
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REUNIR HERRAMIENTAS");
        jLabel1.setToolTipText("");

        jButton1.setText("CARGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton1)))
                .addGap(0, 93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(this);
        File archivo = file.getSelectedFile();
        if(archivo != null){
            try{
                String Dest = System.getProperty("user.dir") + "/Documentos/"+archivo.getName();
                Path Destino = Paths.get(Dest);
                String Orig = archivo.getPath();
                Path Origen = Paths.get(Orig);
                Files.copy(Origen, Destino, REPLACE_EXISTING);
                JOptionPane.showMessageDialog(null, "El archivo fue copiado con exito a la carpeta: "+ Dest);
            }catch (IOException ex){
            }
        }
        jList1.removeAll();
        AgregarArchivos a = new AgregarArchivos();
        String ruta = System.getProperty("user.dir")+"/Documentos" ;
        ArrayList<String> list_ext = new ArrayList<>();
        list_ext.add("docx");
        list_ext.add("pdf");
        list_ext.add("txt");
        a.introduceFiles(ruta, jList1, list_ext, true, false, false, false, false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReunirHe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReunirHe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReunirHe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReunirHe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReunirHe dialog = new ReunirHe(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    public javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
