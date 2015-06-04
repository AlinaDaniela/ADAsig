
package com.ADAsig.model;

import java.io.Serializable;
import java.sql.Date;

public class Accidente implements Serializable{
 
    int idAccident;
    String Descriere;
    Date Data;
    float ValoarePaguba;
    int idPersoana;

    public int getIdAccident() {
        return idAccident;
    }

    public void setIdAccident(int idAccident) {
        this.idAccident = idAccident;
    }

    public String getDescriere() {
        return Descriere;
    }

    public void setDescriere(String Descriere) {
        this.Descriere = Descriere;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public float getValoarePaguba() {
        return ValoarePaguba;
    }

    public void setValoarePaguba(float ValoarePaguba) {
        this.ValoarePaguba = ValoarePaguba;
    }

    public int getIdPersoana() {
        return idPersoana;
    }

    public void setIdPersoana(int idPersoana) {
        this.idPersoana = idPersoana;
    }
    
    
}
