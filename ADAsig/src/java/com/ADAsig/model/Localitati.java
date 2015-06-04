
package com.ADAsig.model;

import java.io.Serializable;


public class Localitati implements Serializable{
    
    int idLocalitate;
    String Denumire;
    int Judet;

    public int getIdLocalitate() {
        return idLocalitate;
    }

    public void setIdLocalitate(int idLocalitate) {
        this.idLocalitate = idLocalitate;
    }

    public String getDenumire() {
        return Denumire;
    }

    public void setDenumire(String Denumire) {
        this.Denumire = Denumire;
    }

    public int getJudet() {
        return Judet;
    }

    public void setJudet(int Judet) {
        this.Judet = Judet;
    }
    
    
}
