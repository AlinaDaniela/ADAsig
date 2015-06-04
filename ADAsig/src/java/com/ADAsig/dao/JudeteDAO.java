/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ADAsig.dao;

import com.ADAsig.model.Judete;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class JudeteDAO {
    
    private DBAccessController dba;

    public JudeteDAO(Connection con) {
        System.out.println("Am ajuns aici sa creez JudeteDAO");
        try {
            dba = new DBAccessController(con);
        } catch (Exception e) {
            System.out.println("A aparut o problema");
        }
    }

    public String addJudet(Judete judet) throws NoSuchAlgorithmException, InvalidKeySpecException {
        return null;
    }


    public void deleteJudet(int juderId) {
    }

    public void updateJudet(Judete judet) {
    }

    public List<Judete> getAllJudete() {
        Map<String, String> allJudete = new LinkedHashMap<String, String>();
        String querydb = "select * from judete ";
        
        ArrayList rezultatCautare = dba.runSQL(querydb);
        
        dba.stop();

        System.out.println("Rez cautare " + rezultatCautare);
        
        return rezultatCautare;
      
    }
    
    public List<Judete> getAllJudeteDenumire() {
        
        String querydb = "select Denumire from judete ";
        
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
