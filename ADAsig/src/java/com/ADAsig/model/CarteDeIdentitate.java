package com.ADAsig.model;

public class CarteDeIdentitate {

    String CNP;
    String Serie;
    int Numar;

    public CarteDeIdentitate(String CNP) {
        this.CNP = CNP;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public int getNumar() {
        return Numar;
    }

    public void setNumar(int Numar) {
        this.Numar = Numar;
    }

}
