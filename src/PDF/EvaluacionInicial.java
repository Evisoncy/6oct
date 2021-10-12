/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF;

/**
 *
 * @author cesar.arzapalo
 */
public class EvaluacionInicial {
    int tiempoTotal;
    Metodo[] metodos;
    String metodoActual;
    Planeamiento[] planeamientos;
    String reduccionPMTD;
    String motivoReduccion;
    String organizaciones;
    
    public EvaluacionInicial(int tiempoInicialDias,Planeamiento[] planeamientos,String metodoActual,String reduccionPMTD,String motivoReduccion, String organizaciones){
        this.metodos = new Metodo[]{new Metodo("Paralelo",(float)5.0), new Metodo("Secuencial",(float)3.0)};
        this.metodoActual= metodoActual;
        this.tiempoTotal = tiempoInicialDias;
        this.planeamientos=planeamientos;
        this.reduccionPMTD=reduccionPMTD;
        this.organizaciones=organizaciones;
        this.motivoReduccion=motivoReduccion;
    }
    
    private int obtenerIndex(String nombre){
        int index = 0, contador = 0;
        for (Metodo metodo: metodos){
            if(nombre.equalsIgnoreCase(metodo.nombre)){
                index = contador;
            }
            contador+=1;
        }
        return index;        
    }
    
    public float obtenerPesoActual(){
        return metodos[obtenerIndex(metodoActual)].peso;
    }
    
    
    public class Metodo{
        String nombre;
        float peso;
        public Metodo(String nombre, float peso){
            this.nombre=nombre;
            this.peso=peso;
        }
    }
    
    public static class Planeamiento{
        String descripcion;
        float peso;
        public Planeamiento(String descripcion, float peso){
            this.descripcion=descripcion;
            this.peso=peso;
        }
    }
}
