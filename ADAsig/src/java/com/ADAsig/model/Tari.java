package com.ADAsig.model;

import java.io.Serializable;


public class Tari implements Serializable{

    
    int idTara;
    String Denumire;

    public Tari(String Denumire) {
        this.Denumire = Denumire;
    }

    public int getIdTara() {
        return idTara;
    }

    public void setIdTara(int idTara) {
        this.idTara = idTara;
    }

    public String getDenumire() {
        return Denumire;
    }

    public void setDenumire(String Denumire) {
        this.Denumire = Denumire;
    }
    
    
    
}
