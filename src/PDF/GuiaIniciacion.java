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
public class GuiaIniciacion {
    int TiempoInicial;
    String metodoPlaneamiento;
    String inciarDiseño;
    String coordinacionesPorRealizar;
    String movimientosAutorizados;
    String trabajosAdicionales;
    String requerimientosDeInformacion;
    String fechaPlanteamiento;
    String lugarPlanteamiento;
    
    public GuiaIniciacion(int TiempoInicial, String metodoPlaneamiento, String inciarDiseño,
                            String coordinacionesPorRealizar, String movimientosAutorizados,
                            String trabajosAdicionales, String requerimientosDeInformacion,
                            String fechaPlanteamiento,String lugarPlanteamiento){
    this.TiempoInicial=TiempoInicial;
    this.metodoPlaneamiento=metodoPlaneamiento;
    this.inciarDiseño=inciarDiseño;
    this.coordinacionesPorRealizar=coordinacionesPorRealizar;
    this.movimientosAutorizados=movimientosAutorizados;
    this.trabajosAdicionales=trabajosAdicionales;
    this.requerimientosDeInformacion=requerimientosDeInformacion;
    this.fechaPlanteamiento=fechaPlanteamiento;
    this.lugarPlanteamiento=lugarPlanteamiento;
    }
}
