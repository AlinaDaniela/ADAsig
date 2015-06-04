package com.ADAsig.dao;

import com.ADAsig.model.Judete;
import com.ADAsig.model.Localitati;
import com.ADAsig.model.Persoane;
import com.ADAsig.model.Utilizatori;
import com.ADAsig.util.DBAccessController;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author user
 */
public class LocalitatiDAO {
    
    private DBAccessController dba;

    public LocalitatiDAO(Connection con) {
        System.out.println("Am ajuns aici sa creez LocalitatiDAO");
        try {
            dba = new DBAccessController(con);
        } catch (Exception e) {
            System.out.println("A aparut o problema");
        }
    }

    public String addLocalitate(Localitati localitate) throws NoSuchAlgorithmException, InvalidKeySpecException {
        return null;
    }


    public void deleteLocalitate(int localitateId) {
    }

    public void updateLocalitate(Localitati localitate) {
    }
    
    public List<Localitati> getAllLocalitatiDenumireForJudet(String judetID) {
        
        String querydb = "select Denumire from localitati WHERE Judet = '" + judetID + "'";
        
        System.out.println("Query: " + querydb);
        ArrayList rezultatCautare = dba.runSQL(querydb);
        
        dba.stop();

        System.out.println("Rez cautare " + rezultatCautare);
        
        return rezultatCautare;
      
    }

    public List<Localitati> getAllLocalitati() {
        
        String querydb = "select * from localitati ";
        
        ArrayList rezultatCautare = dba.runSQL(querydb);
        
        dba.stop();

        System.out.println("Rez cautare " + rezultatCautare);
        
        return rezultatCautare;
      
    }
    
    public List<Judete> getAllJudeteDenumire() {
        
        String querydb = "select Denumire from localitati ";
        
        ArrayList rezultatCautare = dba.runSQL(querydb);
        
        dba.stop();

        System.out.println("Rez cautare " + rezultatCautare);
        
        return rezultatCautare;
      
    }

    public Utilizatori getUserById(int userId) {
        //Utilizatori user = new Utilizatori();

        return null;
        //return user;
    }
}
