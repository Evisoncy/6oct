/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD;

import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.scene.media.AudioClip;

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
    public static void inicializarMusica(String ruta){
        MusicaFondo.sonido = new AudioClip(Paths.get(ruta).toUri().toString());
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
