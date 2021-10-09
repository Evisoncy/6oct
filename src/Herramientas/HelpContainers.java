/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author cesar.arzapalo
 */
public class HelpContainers {
    
    public static void setValorTextField(JTextField cuadro, String tiempo){
        cuadro.setText(tiempo);
    }
    
    public static void setListaComboBox(JComboBox<String> lista,DefaultComboBoxModel modelo, int index){
        lista.setModel(modelo);
        lista.setSelectedIndex(index);

    }
}
