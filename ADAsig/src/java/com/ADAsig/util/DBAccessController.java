package com.ADAsig.util;

import static java.lang.System.out;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class DBAccessController {

    private Connection connection = null;

    public DBAccessController(String url, String userId, String password, boolean typereadonly) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            connection = DriverManager.getConnection(url, userId, password);
            connection.setReadOnly(typereadonly);
        } catch (java.lang.ClassNotFoundException exceptionClassNotFound) {
        } catch (java.lang.InstantiationException instantException) {
        } catch (java.lang.IllegalAccessException illegalAccess) {
        } catch (java.sql.SQLException sqle) {
        }

    }

    public DBAccessController(Connection con) {

        if (con != null) {
            this.connection = con;
        }

    }

    /* public final synchronized ArrayList runSQL(String queryString) {
     try {
     Statement statement = connection.createStatement();
     connection.setAutoCommit(true);
     boolean flag = statement.execute(queryString);

     out.println("query " + queryString);
     if (flag) {

     System.out.println("Am intrat in if cu flag " + flag);
     ResultSet res = statement.getResultSet();
     ResultSetMetaData rsmd = res.getMetaData();
     int numberOfColumns = rsmd.getColumnCount();
     System.out.println("numberOfColumns " + numberOfColumns);
     System.out.println("rsmd " + rsmd);
     ArrayList<HashMap<String, String>> rezultate = new ArrayList<HashMap<String, String>>();
     ArrayList general = new ArrayList();

     int nrlinii = 0;
     //out.println(res.getNCharacterStream(1));
     while (res.next()) {
     ArrayList vect = new ArrayList(numberOfColumns);
     HashMap<String, String> hm = new HashMap<String, String>();
     for (int i = 1; i <= numberOfColumns; i++) {
     Object o = res.getObject(i);
     vect.add(o);
     //out.println("obiectul " + o.toString());
     if (o != null) {
     hm.put(rsmd.getColumnName(i), o.toString());
     }
     //out.println("metode res " + "1. " + " 2. " + " 3. " + res.toString());
     }
     nrlinii++;
     general.add(vect);
     //  rezultate.add(hm);
     }
     System.out.println("general return");
     return general;

     } else {
     System.out.println("return null1");
     return null;
     }
     } catch (java.sql.SQLException sqle) {
     System.out.println("return null2 " + sqle.getMessage().toString());
     return null;
     }
     }
     */
    public final synchronized ArrayList runSQL(String queryString) {
        try {
            Statement statement = connection.createStatement();
            connection.setAutoCommit(true);
            boolean flag = statement.execute(queryString, Statement.RETURN_GENERATED_KEYS);

            System.out.println("Statement: " + statement + " flag: " + flag);

            ArrayList<HashMap<String, String>> rezultate = new ArrayList<>();
            ResultSet keyset = statement.getGeneratedKeys();

            while (keyset != null && keyset.next()) {

                HashMap<String, String> keysHM = new HashMap<>();
                // Retrieve the auto generated key(s).
                int key = keyset.getInt(1);
                keysHM.put("cheia", Integer.toString(key));
                rezultate.add(keysHM);
                
                System.out.println("Cheile " + keyset.toString());
                
            }
            
            System.out.println("Cheile " + keyset.toString());
            if (flag) {
                ResultSet res = statement.getResultSet();
                ResultSetMetaData rsmd = res.getMetaData();
                int numberOfColumns = rsmd.getColumnCount();

                System.out.println("res: " + res + " rsmd: " + rsmd + " numberOfColumns: " + numberOfColumns);

                while (res.next()) {

                    HashMap<String, String> hm = new HashMap<>();
                    System.out.println("Res to string " + res.toString());
                    for (int i = 1; i <= numberOfColumns; i++) {
                        System.out.println("obiectul " + i + " res.getObject(i) " + res.getObject(i));

                        Object o = res.getObject(i);
                        System.out.println("rsmd.getColumnName(i) " + rsmd.getColumnName(i));

                        if (o != null) {
                            hm.put(rsmd.getColumnName(i), o.toString());
                        }
                    }

                    rezultate.add(hm);
                }

                System.out.println("Return rezultate");
                return rezultate;

            } else {
                System.out.println("Return null 1");
                if(keyset!=null)
                    return rezultate;
                else
                    return null;
            }
        } catch (java.sql.SQLException sqle) {
            System.out.println("Return null 2" + sqle.getMessage());
            return null;
        }
    }

    public final void stop() {

        try {
            connection.close();
        } catch (java.sql.SQLException e) {
        }
    }

}
