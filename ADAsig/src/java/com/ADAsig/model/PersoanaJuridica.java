/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ADAsig.model;


public class PersoanaJuridica {
    
    private CertificatDeInregistrare ci;
    private Proprietari proprietar;

    public PersoanaJuridica(CertificatDeInregistrare ci, Proprietari proprietar) {
        this.ci = ci;
        this.proprietar = proprietar;
    }

    public CertificatDeInregistrare getCi() {
        return ci;
    }

    public void setCi(CertificatDeInregistrare ci) {
        this.ci = ci;
    }

    public Proprietari getProprietar() {
        return proprietar;
    }

    public void setProprietar(Proprietari proprietar) {
        this.proprietar = proprietar;
    }
    
    
}
