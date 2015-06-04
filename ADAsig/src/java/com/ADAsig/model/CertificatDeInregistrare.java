package com.ADAsig.model;

class CertificatDeInregistrare {
    
    private String cif;
    private String denumireSocietate;

    public CertificatDeInregistrare(String cif, String denumireSocietate) {
        this.cif = cif;
        this.denumireSocietate = denumireSocietate;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDenumireSocietate() {
        return denumireSocietate;
    }

    public void setDenumireSocietate(String denumireSocietate) {
        this.denumireSocietate = denumireSocietate;
    }
    
    
}
