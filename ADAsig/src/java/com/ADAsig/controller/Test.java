package com.ADAsig.controller;

import com.ADAsig.util.DBAccessController;
import com.ADAsig.util.ConnectionPool;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
/**
 *
 * @author student
 */
@WebServlet(urlPatterns = {"/Test"})
public class Test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        out.print("Lalala basma");
    }
    
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String name = ""+ request.getParameter("name");
            String group = "" +request.getParameter("group");
            String password = "" +request.getParameter("pass");
            
            String htmlResponse = "";
            
            PrintWriter writer = response.getWriter();
            ServletContext context = getServletContext();
            
            
            boolean wrongUser = false, wrongPass = false;
            if(name.equals(""))
            {
                request.setAttribute("erori", "Nu ai introdus numele");
                context.getRequestDispatcher("/index.jsp").forward(request, response);
        
                htmlResponse += "Nu ati introdus un nume! <br/>";
                wrongUser = true;
            }
            if(password.equals(""))
            {
                htmlResponse += "Nu ati introdus o parola! <br/>";
                wrongPass = true;
            }
            
            if(!wrongUser && !wrongPass)
            {
                
                //DBAccessController dba = new DBAccessController("jdbc:odbc:utilizatori","","", true);
                context = getServletContext();
                ConnectionPool cp=(ConnectionPool) context.getAttribute("CONNECTION_POOL");
                
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(password.getBytes());

                byte byteData[] = md.digest();

                //convert the byte to hex format method 1
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < byteData.length; i++) {
                 sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
                }

                System.out.println("Digest(in hex format):: " + sb.toString());

                //convert the byte to hex format method 2
                StringBuffer hexString = new StringBuffer();
                for (int i=0;i<byteData.length;i++) {
                        String hex=Integer.toHexString(0xff & byteData[i]);
                        if(hex.length()==1) hexString.append('0');
                        hexString.append(hex);
                }
                
        
                DBAccessController dba = new DBAccessController((Connection) cp.getConnection());
                String querydb = "select * from utilizatori where nume_utilizator = '" + name + "' and parola ='" + hexString.toString() + "'";

                
                //System.out.println(querydb);
                ArrayList rezultatCautare = dba.runSQL(querydb);
                
               // out.println("Nu va puteti conecta " + name + "<br>"  + " " + hexString.toString() + "  " + rezultatCautare  + " " + querydb );
              //  System.out.println(rezultatCautare);
                
                if(rezultatCautare.isEmpty() != true)
                {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("utilizator", name);
                   // session.setAttribute("parola", password);
                    
                    htmlResponse += "<h1>Bine ati venit " + name + "<br>"  + " Continuati in aplicatie " + "<a href = 'LoggedIn'>Continua </a> </h1>";
                    
                }
                else {
                out.println("Nu va puteti conecta cu numele de utilizator " + name + " deoarece acesta nu exista in baza de date. Este nevoie sa va inregistrati! <a href = 'Register'>Register </a> <br>"   );
                }
                    
                dba.stop();
            }
            writer.println(htmlResponse);
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
 
  }
  
    
}

