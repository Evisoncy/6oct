/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMTD;

/**
 *
 * @author WIMBER
 */
public class limitaciones {
    private String tipo;
    private String lim;
    private String imp;

    public limitaciones(String tipo, String lim, String imp) {
        this.tipo = tipo;
        this.lim = lim;
        this.imp = imp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLim() {
        return lim;
    }

    public void setLim(String lim) {
        this.lim = lim;
    }

    public String getImp() {
        return imp;
    }

    public void setImp(String imp) {
        this.imp = imp;
    }
    
    
}
