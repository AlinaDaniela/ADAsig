package com.ADAsig.model;

import java.io.Serializable;


public class Judete implements Serializable{
    
    
    int idJudet;
    int Tara;
    String Denumire;

    public int getIdJudet() {
        return idJudet;
    }

    public void setIdJudet(int idJudet) {
        this.idJudet = idJudet;
    }

    public int getTara() {
        return Tara;
    }

    public void setTara(int Tara) {
        this.Tara = Tara;
    }

    public String getDenumire() {
        return Denumire;
    }

    public void setDenumire(String Denumire) {
        this.Denumire = Denumire;
    }
    
    
}
