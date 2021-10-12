/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formatos;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author cesar.arzapalo
 */
public class NumberFormatApt {
    
    public static String darFormatoDecimal(Object number){
        DecimalFormatSymbols  separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formatoPorcentual = new DecimalFormat("#%", separadoresPersonalizados);
        return formatoPorcentual.format(number);
    }
    public static String darFormatoPorcentual(Object number){
        DecimalFormatSymbols  separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formatoDecimal = new DecimalFormat("#.00", separadoresPersonalizados); 
        return formatoDecimal.format(number);
    }
    public static String darFormatoSinDecimas(Object number){
        DecimalFormatSymbols  separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formatoSinDecimas = new DecimalFormat("#", separadoresPersonalizados);
        return formatoSinDecimas.format(number);
    }
}
