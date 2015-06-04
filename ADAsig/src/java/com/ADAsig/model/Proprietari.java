package com.ADAsig.model;

public class Proprietari {
 
    private Persoane persoana;
    private char TipPersoana;
    private String Adresa;
    private Localitati localitate;

    public Proprietari(Persoane persoana, char TipPersoana, String Adresa, Localitati localitate) {
        this.persoana = persoana;
        this.TipPersoana = TipPersoana;
        this.Adresa = Adresa;
        this.localitate = localitate;
    }

    public Persoane getPersoana() {
        return persoana;
    }

    public void setPersoana(Persoane persoana) {
        this.persoana = persoana;
    }

    public char getTipPersoana() {
        return TipPersoana;
    }

    public void setTipPersoana(char TipPersoana) {
        this.TipPersoana = TipPersoana;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String Adresa) {
        this.Adresa = Adresa;
    }

    public Localitati getLocalitate() {
        return localitate;
    }

    public void setLocalitate(Localitati localitate) {
        this.localitate = localitate;
    }
    
    
    
}
