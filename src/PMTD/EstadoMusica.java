/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD;

import java.net.URL;

/**
 *
 * @author cesar.arzapalo
 */
public class EstadoMusica {
    URL urlImagen;
    String nombreEstado;
    public EstadoMusica(String url,String nombre){
        System.out.println(getClass().getResource(url));
        urlImagen=getClass().getResource(url);
        nombreEstado=nombre;
    }
}
