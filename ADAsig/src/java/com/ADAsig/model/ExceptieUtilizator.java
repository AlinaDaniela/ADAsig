package com.ADAsig.model;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ExceptieUtilizator extends Exception{
    
    
    private Map<String, Object> mesajHash;
    private Map<String, Object> valoriCorecte;
    private String mesaj, mesajValCorecte;
    
    ExceptieUtilizator(Map mesajHash, Map valoriCorecte)
    {
        super();
        mesaj = "";
        mesajValCorecte = "";
        this.mesajHash = mesajHash;
        this.valoriCorecte = valoriCorecte;
        
        Set<String> keys= mesajHash.keySet();
        Iterator<String> it=keys.iterator();
        while(it.hasNext())
            mesaj = mesaj + mesajHash.get(it.next());
        
        
        Set<String> keysV= valoriCorecte.keySet();
        Iterator<String> itV=keysV.iterator();
        while(itV.hasNext())
            mesajValCorecte = mesajValCorecte + valoriCorecte.get(itV.next());
        

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
    public String getMesajValCorecte() {
        return mesajValCorecte;
    }
    
}

