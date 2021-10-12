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
public class detTareas {
    String tareaExp;
    String desTxp;
    String tareaImp;
    String desTimp;
    String tareaEse;
    String justi;

    public detTareas(String tareaExp, String desTxp, String tareaImp, String desTimp, String tareaEse, String justi) {
        this.tareaExp = tareaExp;
        this.desTxp = desTxp;
        this.tareaImp = tareaImp;
        this.desTimp = desTimp;
        this.tareaEse = tareaEse;
        this.justi = justi;
    }

    public String getTareaExp() {
        return tareaExp;
    }

    public void setTareaExp(String tareaExp) {
        this.tareaExp = tareaExp;
    }

    public String getDesTxp() {
        return desTxp;
    }

    public void setDesTxp(String desTxp) {
        this.desTxp = desTxp;
    }

    public String getTareaImp() {
        return tareaImp;
    }

    public void setTareaImp(String tareaImp) {
        this.tareaImp = tareaImp;
    }

    public String getDesTimp() {
        return desTimp;
    }

    public void setDesTimp(String desTimp) {
        this.desTimp = desTimp;
    }

    public String getTareaEse() {
        return tareaEse;
    }

    public void setTareaEse(String tareaEse) {
        this.tareaEse = tareaEse;
    }

    public String getJusti() {
        return justi;
    }

    public void setJusti(String justi) {
        this.justi = justi;
    }
    
}
