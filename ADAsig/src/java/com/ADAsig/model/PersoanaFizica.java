
package com.ADAsig.model;

public class PersoanaFizica {
    
    private Proprietari proprietar;
    private CarteDeIdentitate ci;
    private int AnObtinerePermis;
    
    public PersoanaFizica(Proprietari proprietar, CarteDeIdentitate ci, int AnObtinerePermis) {
        this.proprietar = proprietar;
        this.ci = ci;
        this.AnObtinerePermis = AnObtinerePermis;
    }

    
    public Proprietari getProprietar() {
        return proprietar;
    }

    public void setProprietar(Proprietari proprietar) {
        this.proprietar = proprietar;
    }

    public CarteDeIdentitate getCi() {
        return ci;
    }

    public void setCi(CarteDeIdentitate ci) {
        this.ci = ci;
    }

    public int getAnObtinerePermis() {
        return AnObtinerePermis;
    }

    public void setAnObtinerePermis(int AnObtinerePermis) {
        this.AnObtinerePermis = AnObtinerePermis;
    }
    
    
    
}
