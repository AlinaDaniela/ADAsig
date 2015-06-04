package com.ADAsig.model;

import java.io.Serializable;


public class Dealeri  implements Serializable{
    
    private Utilizatori utilizator;
    private int Sucursala;
    private String CodDealer;

    public Dealeri(Utilizatori utilizator, int Sucursala, String CodDealer) {
        this.utilizator = utilizator;
        this.Sucursala = Sucursala;
        this.CodDealer = CodDealer;
    }

    public Utilizatori getUtilizator() {
        return utilizator;
    }

    public void setUtilizator(Utilizatori utilizator) {
        this.utilizator = utilizator;
    }

    public int getSucursala() {
        return Sucursala;
    }

    public void setSucursala(int Sucursala) {
        this.Sucursala = Sucursala;
    }

    public String getCodDealer() {
        return CodDealer;
    }

    public void setCodDealer(String CodDealer) {
        this.CodDealer = CodDealer;
    }
    
    
}
