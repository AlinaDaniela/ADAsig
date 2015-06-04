package com.ADAsig.dao;

import com.ADAsig.model.Persoane;
import com.ADAsig.model.Utilizatori;
import com.ADAsig.util.DBAccessController;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class UtilizatoriDAO {

    private DBAccessController dba;

    public UtilizatoriDAO(Connection con) {
        System.out.println("Am ajuns aici sa creez UtilizatoriDAO");
        try {
            dba = new DBAccessController(con);
        } catch (Exception e) {
            System.out.println("A aparut o problema");
        }
    }

    public String addUser(Utilizatori user) throws NoSuchAlgorithmException, InvalidKeySpecException {

        System.out.println("Am ajuns aici sa adaug utilziatorul");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // SQL DateTime format YYYY-MM-DD HH:MI:SS
        
        Persoane p = user.getPersoana();
        String querydb = "insert into persoane(nume, prenume, email, telefon, parola, status, dataInregistrare) values ('"
                + p.getNume() + "', '" + p.getPrenume() + "', '" + user.getEmail() + "', '" + user.getTelefon() + "', '"
                + user.createHash(user.getParola()) + "', " + user.getStatus() + ", '" + dateFormat.format(new Date()) + "')";

        System.out.println("Query la baza de date: " + querydb);

        ArrayList rezultat = dba.runSQL(querydb);
       
        dba.stop();
        
        if (rezultat != null) {
            HashMap<String, String> keysHM = (HashMap) rezultat.get(0);

            System.out.println("Rezultat " + keysHM.get("cheia"));
            return keysHM.get("cheia");
        } else {
            return null;
        }

    }

    public ArrayList authenticate(String email, String parola) {

        String querydb = "SELECT '#P', nume, prenume, telefon, parola, status, dataInregistrare FROM persoane WHERE email='" + email + "'";
        System.out.println("Query la baza de date: " + querydb);

        ArrayList rezultatCautare = dba.runSQL(querydb);

        dba.stop();

        System.out.println("Rez cautare " + rezultatCautare);
        return rezultatCautare;
    }

    public void deleteUser(int userId) {
        //  String querydb = "select * from utilizatori where nume_utilizator = '" +  userId + "' and parola ='" + "'";
        //  ArrayList rezultatCautare = dba.runSQL(querydb);
    }

    public void updateUser(Utilizatori user) {
        //String querydb = "select * from utilizatori where nume_utilizator = '" +  user.getNume() + "' and parola ='" + user.getParola() + "'";
        //ArrayList rezultatCautare = dba.runSQL(querydb);
    }

    public List<Utilizatori> getAllUsers() {
        List<Utilizatori> users = new ArrayList<>();
        String querydb = "select * from utilizatori ";
        ArrayList rezultatCautare = dba.runSQL(querydb);
        int i = 0;
        while (rezultatCautare.get(i) != "null") {
            i++;
        }

        return users;
    }

    public Utilizatori getUserById(int userId) {
        //Utilizatori user = new Utilizatori();

        return null;
        //return user;
    }
}
