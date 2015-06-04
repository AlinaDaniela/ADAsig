package com.ADAsig.controller;

import com.ADAsig.dao.UtilizatoriDAO;
import com.ADAsig.model.ExceptieUtilizator;
import com.ADAsig.model.Utilizatori;
import com.ADAsig.util.ConnectionPool;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.security.DeclareRoles;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@DeclareRoles({"Guest"})
@WebServlet(name = "RegisterController", urlPatterns = {"/Register"})
public class RegisterController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            synchronized (getServletContext()) {
                ServletContext context = getServletContext();
                ConnectionPool cp = (ConnectionPool) context.getAttribute("CONNECTION_POOL");

                String nume = "" + request.getParameter("nume");
                String prenume = "" + request.getParameter("prenume");
                String email = "" + request.getParameter("email");
                String telefon = "" + request.getParameter("telefon");
                String parola = "" + request.getParameter("parola");
                String reParola = "" + request.getParameter("reParola");
                
                System.out.println("ce am preluat: " + nume + ", " + prenume + ", " + email + ", " + telefon + ", " + parola + ", " + reParola);
                Utilizatori utilizator;
                UtilizatoriDAO udao;
                try {

                    utilizator = new Utilizatori(nume, prenume, "regular", email, telefon, parola, reParola, 1);

                    Connection con;
                    try {
                        con = cp.getConnection();
                        udao = new UtilizatoriDAO(con);
                        String idUtilizator = udao.addUser(utilizator);

                        if (idUtilizator != null) {
                            HttpSession session;
                            session = request.getSession(false);
                            session.setAttribute("utilizator", utilizator.getPersoana().getPrenume() + " " + utilizator.getPersoana().getNume());
                            session.setAttribute("idUtilizator", idUtilizator);

                            out.println("Sunteti inregistrat");
                               
                            
                            String encodedURL = response.encodeRedirectURL("welcome.jsp");
                            System.out.println("encodedURL " + encodedURL);
                            response.sendRedirect(encodedURL);
                            //request.getRequestDispatcher("/welcome.jsp").forward(request, response);
                        } else {
                            System.out.println("Email-ul este deja inregistrat in baza de date!");
                            request.setAttribute("emailDuplicat", "Adresa de mail " + email + " este deja inregistrata in baza de date!");
                            request.getRequestDispatcher("/register.jsp").forward(request, response);
                        }

                    } catch (Exception ex) {
                        System.out.println("Nu se poate realiza conexiunea!");
                        Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    out.close();

                } catch (ExceptieUtilizator excpCl) {
                    request.setAttribute("eroriClient", excpCl.getMesajHash());
                    request.setAttribute("valoriCorecteClient", excpCl.getValoriCorecte());
                    request.getRequestDispatcher("/register.jsp").forward(request, response);
                    System.out.println("eorori " + excpCl.getMesaj());
                    System.out.println("valori corecte " + excpCl.getMesajValCorecte());
                    //out.println("Exista erori in completarea formularului " + "<a href = 'Register'>Continua </a>");
                }
            }
        }
    }

}
