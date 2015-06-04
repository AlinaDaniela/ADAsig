/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ADAsig.model;

import java.io.Serializable;

public class Asigurat  implements Serializable{
    
    private Persoane persoana;
    private char TipPersoana;
    private String CnpCui;
    private String Adresa;
    private int Localitate;
    private int AnObtinerePermis;

    public Asigurat(Persoane persoana, char TipPersoana, String CnpCui, String Adresa, int Localitate, int AnObtinerePermis) {
        this.persoana = persoana;
        this.TipPersoana = TipPersoana;
        this.CnpCui = CnpCui;
        this.Adresa = Adresa;
        this.Localitate = Localitate;
        this.AnObtinerePermis = AnObtinerePermis;
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

    public String getCnpCui() {
        return CnpCui;
    }

    public void setCnpCui(String CnpCui) {
        this.CnpCui = CnpCui;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String Adresa) {
        this.Adresa = Adresa;
    }

    public int getLocalitate() {
        return Localitate;
    }

    public void setLocalitate(int Localitate) {
        this.Localitate = Localitate;
    }

    public int getAnObtinerePermis() {
        return AnObtinerePermis;
    }

    public void setAnObtinerePermis(int AnObtinerePermis) {
        this.AnObtinerePermis = AnObtinerePermis;
    }
    
    
    
    
}
