/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD;

import java.applet.AudioClip;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author cesar.arzapalo
 */
public class MusicaFondo {
    
    private static AudioClip sonido;
    private static ArrayList<EstadoMusica> Estados;
    private static EstadoMusica Seleccionado;
    public MusicaFondo(){
    }
    public static void inicializarMusica(URL ruta){
        MusicaFondo.sonido = java.applet.Applet.newAudioClip(ruta);
        Estados = new ArrayList<>();
        Estados.add(new EstadoMusica("/imagenes/Musica/Inicializado.png","Inicializado"));
        Estados.add(new EstadoMusica("/imagenes/Musica/Reproduciendo.png","Reproducciendo"));
        Estados.add(new EstadoMusica("/imagenes/Musica/Detenido.png","Detenido"));
        MusicaFondo.Seleccionado= Estados.get(0);
    }
    
    public static void reproducirMusica(){
        MusicaFondo.sonido.play();
        MusicaFondo.Seleccionado = Estados.get(1);
    }
    
    public static void detenerMusica(){
        MusicaFondo.sonido.stop();
        MusicaFondo.Seleccionado = Estados.get(2);
    }
    
    public static EstadoMusica obtenerEstado(){
        return MusicaFondo.Seleccionado;
    }
}
