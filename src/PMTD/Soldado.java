package PMTD;

public class Soldado {
    private String nombre;
    private String telef;
    private String tipoenlace;
    private String unidad ; 
    private String grado;

    public Soldado( String nombre,String telef, String tipoenlace, String unidad, String grado) {
        this.nombre = nombre;
        this.telef = telef;
        this.tipoenlace = tipoenlace;
        this.unidad = unidad;
        this.grado = grado;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }
       
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoenlace() {
        return tipoenlace;
    }

    public void setTipoenlace(String tipoenlace) {
        this.tipoenlace = tipoenlace;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }   

    public static void main (String args[]){
        
        
             
        
    }
     
}