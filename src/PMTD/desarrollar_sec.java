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
public class desarrollar_sec {
    private String tareas;
    private String rec_disp;
    private String juicio;
    private String req; 

    public desarrollar_sec(String tareas, String rec_disp, String juicio, String req) {
        this.tareas = tareas;
        this.rec_disp = rec_disp;
        this.juicio = juicio;
        this.req = req;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    public String getRec_disp() {
        return rec_disp;
    }

    public void setRec_disp(String rec_disp) {
        this.rec_disp = rec_disp;
    }

    public String getJuicio() {
        return juicio;
    }

    public void setJuicio(String juicio) {
        this.juicio = juicio;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }
    

    
    
}
