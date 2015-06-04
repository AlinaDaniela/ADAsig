/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ADAsig.model;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExceptiePersoana extends Exception{
    
    
    private Map<String, Object> mesajHash;
    private Map<String, Object> valoriCorecte;
    private String mesaj;
    
    ExceptiePersoana(Map mesajHash, Map valoriCorecte)
    {
        super();
        mesaj = "";
        this.mesajHash = mesajHash;
        this.valoriCorecte = valoriCorecte;
        
        Set<String> keys= mesajHash.keySet();
        Iterator<String> it=keys.iterator();
        while(it.hasNext())
            mesaj = mesaj + mesajHash.get(it.next());

    }

    public Map<String, Object> getMesajHash() {
        return mesajHash;
    }

    public Map<String, Object> getValoriCorecte() {
        return valoriCorecte;
    }
    
    public String getMesaj() {
        return mesaj;
    }
    
}