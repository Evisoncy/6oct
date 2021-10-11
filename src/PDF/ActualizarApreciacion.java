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
public class ActualizarApreciacion {
    Encabezado encabezado;
    AreaInteres[] areaInteres;
    AreaOperaciones areaOperaciones;    
    String fuerzasEnemigas;
    FuerzasAmigas fuerzasAmigas;
    ConsideracionesCiviles consideracionesCiviles;
    public ActualizarApreciacion(Encabezado  encabezado, AreaInteres[] areaInteres, 
            AreaOperaciones areaOperaciones, String fuerzasEnemigas,
            FuerzasAmigas fuerzasAmigas, ConsideracionesCiviles consideracionesCiviles){
        this.encabezado = encabezado;
        this.areaInteres=areaInteres;
        this.areaOperaciones=areaOperaciones;    
        this.fuerzasEnemigas=fuerzasEnemigas;
        this.fuerzasAmigas=fuerzasAmigas;
        this.consideracionesCiviles=consideracionesCiviles;
    }
    public static class Encabezado{
        String unidad, lugar, fecha, refApreciacion;
        public Encabezado(String un, String lug, String fec, String refAp){
            this.unidad = un;
            this.lugar = lug;
            this.fecha = fec;
            this.refApreciacion = refAp;
        }
    }
    public static class AreaInteres{
        public String factor, descripcion;
        public AreaInteres(String factor, String descripcion ){
            this.factor = factor;
            this.descripcion = descripcion;
        }
    }
    public static class AreaOperaciones{
        String condicionesMetereologicas, terreno, otrosHechos;
        public AreaOperaciones(String condicionesMetereologicas, String terreno, String otrosHechos ){
            this.condicionesMetereologicas = condicionesMetereologicas;
            this.terreno = terreno;
            this.otrosHechos = otrosHechos;
        }
    }
    public static class FuerzasAmigas{
        RecusosDisponibles[] recursosDisponibles;
        String[] capacidadesDisponibles;
        RecursosAdicionales[] recursosAdiciones;
        String nececidadesCapacidades;
        public FuerzasAmigas(RecusosDisponibles[] recursosDisponibles, String[] capacidadesDisponibles, 
                RecursosAdicionales[] recursosAdiciones, String nececidadesCapacidades){
            this.recursosDisponibles= recursosDisponibles;
            this.capacidadesDisponibles=capacidadesDisponibles;
            this.recursosAdiciones=recursosAdiciones;
            this.nececidadesCapacidades=nececidadesCapacidades;
        }
        public static class RecusosDisponibles{
            String recursos, condicionesActuales;
            public RecusosDisponibles(String recursos, String condicionesActuales){
                this.recursos=recursos;
                this.condicionesActuales=condicionesActuales;
            }
        }
        public static class RecursosAdicionales{
            String elonSup, unidadesVecinas, otros;
            public RecursosAdicionales(String elonSup, String unidadesVecinas, String otros){
                this.elonSup = elonSup;
                this.unidadesVecinas = unidadesVecinas;
                this.otros = otros;
            }
        }
    }
    public static class ConsideracionesCiviles{
        String factoresPublicos, factoresSociologicos, factoresInfraestructura, factoresEconomicos, factoresPsicologicos;
        public ConsideracionesCiviles(String factoresPublicos, String factoresSociologicos, String factoresInfraestructura, String factoresEconomicos, String factoresPsicologicos){
            this.factoresPublicos=factoresPublicos;
            this.factoresSociologicos=factoresSociologicos;
            this.factoresInfraestructura=factoresInfraestructura;
            this.factoresEconomicos=factoresEconomicos;
            this.factoresPsicologicos=factoresPsicologicos;
        }
    }
}
