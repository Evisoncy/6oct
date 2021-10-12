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
public class OrdenPreaparatoriaN1 {
    String tipoOperacion;
    String areaOperacion;
    String fechaInicio;
    String movimientosARealizar;
    String ActividadesIVEPorRealizar;
    
    public OrdenPreaparatoriaN1(String tipoOperacion, String areaOperacion, String fechaInicio,
                                String movimientosARealizar, String ActividadesIVEPorRealizar){
        
        this.tipoOperacion=tipoOperacion;
        this.areaOperacion=areaOperacion;
        this.fechaInicio=fechaInicio;
        this.movimientosARealizar=movimientosARealizar;
        this.ActividadesIVEPorRealizar=ActividadesIVEPorRealizar;
    }
}
