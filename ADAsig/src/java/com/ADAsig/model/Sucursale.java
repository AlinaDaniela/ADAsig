
package com.ADAsig.model;

import java.io.Serializable;

public class Sucursale implements Serializable{
    
    int idSucursala;
    String codSucursala;
    int Localitate;

    public int getIdSucursala() {
        return idSucursala;
    }

    public void setIdSucursala(int idSucursala) {
        this.idSucursala = idSucursala;
    }

    public String getCodSucursala() {
        return codSucursala;
    }

    public void setCodSucursala(String codSucursala) {
        this.codSucursala = codSucursala;
    }

    public int getLocalitate() {
        return Localitate;
    }

    public void setLocalitate(int Localitate) {
        this.Localitate = Localitate;
    }
    
    
    
}
