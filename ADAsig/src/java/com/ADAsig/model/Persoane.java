package com.ADAsig.model;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class Persoane implements Serializable {

    private String Nume;
    private String Prenume;
    private Date DataInregistrare;
    private Map<String, Object> exceptiePersoana;
    private Map<String, Object> valoriCorecte;

    public Persoane(String Nume, String Prenume) throws ExceptiePersoana {

        exceptiePersoana = new HashMap<>();
        valoriCorecte = new HashMap<>();

        if (!Nume.matches("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{2,}")) {
            exceptiePersoana.put("eroareNume", "Numele nu are formatul potrivit!");
        } else {
            this.Nume = Nume;
            valoriCorecte.put("nume", Nume);
        }

        if (!Prenume.matches("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{2,}")) {
            exceptiePersoana.put("eroarePrenume", "Prenume nu are formatul potrivit!");
        } else {
            this.Prenume = Prenume;
            valoriCorecte.put("prenume", Prenume);
        }

        if (!exceptiePersoana.isEmpty()) {
            throw new ExceptiePersoana(exceptiePersoana, valoriCorecte);
        }
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String Nume) {
        this.Nume = Nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String Prenume) {
        this.Prenume = Prenume;
    }

    public Date getDataInregistrare() {
        return DataInregistrare;
    }

    public void setDataInregistrare(Date DataInregistrare) {
        this.DataInregistrare = DataInregistrare;
    }

}
