
package com.ADAsig.model;

import java.sql.Date;

public class AmenziPersoana {
    
    int idAmenziPersoana;
    Date Data;
    float Valoare;
    int idAmenda;
    int idPersoana;

    public int getIdAmenziPersoana() {
        return idAmenziPersoana;
    }

    public void setIdAmenziPersoana(int idAmenziPersoana) {
        this.idAmenziPersoana = idAmenziPersoana;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public float getValoare() {
        return Valoare;
    }

    public void setValoare(float Valoare) {
        this.Valoare = Valoare;
    }

    public int getIdAmenda() {
        return idAmenda;
    }

    public void setIdAmenda(int idAmenda) {
        this.idAmenda = idAmenda;
    }

    public int getIdPersoana() {
        return idPersoana;
    }

    public void setIdPersoana(int idPersoana) {
        this.idPersoana = idPersoana;
    }
    
    
}
