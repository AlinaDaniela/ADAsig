package com.ADAsig.controller;

import com.ADAsig.dao.UtilizatoriDAO;
import com.ADAsig.model.ExceptieUtilizator;
import com.ADAsig.model.Utilizatori;
import com.ADAsig.util.ConnectionPool;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginController", urlPatterns = {"/Login"})
public class LoginController extends HttpServlet {

    Utilizatori utilizator;
    Map<String, Object> valoriCorecteLogin = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();     // request is an instance of type 
        //HttpServletRequest
        boolean foundCookie = false;

        for (int i = 0; i < cookies.length; i++) {
            Cookie c = cookies[i];
            if (c.getName().equals("emailUtilizator")) {
                String email = c.getValue();
                valoriCorecteLogin.put("email", email);
                System.out.println("Am gasit cookie-ul pt email " + email);
                request.setAttribute("valoriCorecteLogin", valoriCorecteLogin);
                foundCookie = true;
            }
        }

        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            // System.out.println("Role " + request.getUserPrincipal().getName());
            synchronized (getServletContext()) {

                ServletContext context = getServletContext();
                ConnectionPool cp = (ConnectionPool) context.getAttribute("CONNECTION_POOL");

                String email = "" + request.getParameter("email");
                String parola = "" + request.getParameter("parola");
                String rememberMe = "" + request.getParameter("remember");

                System.out.println("role " + request.isUserInRole("Administrator"));
                Connection con;
                try {
                    con = cp.getConnection();

                    System.out.println("S-a realziat conexiunea!");
                    try {
                        System.out.println("Incercam sa creeam un utilizator nou cu datele " + email + ", " + parola + ", " + rememberMe);
                        utilizator = new Utilizatori(email, parola);
                        System.out.println("Incercam sa creeam UtilizatoriDAO!");
                        UtilizatoriDAO udao = new UtilizatoriDAO(con);
                        System.out.println("Authenticate");
                        ArrayList dateUtilizator = udao.authenticate(email, parola);
                        System.out.println("dateUtilizator " + dateUtilizator.toString());
                        if (!dateUtilizator.isEmpty()) {
                            System.out.println("Date utilizator " + dateUtilizator.toString());
                            HashMap<String, String> dateUser = (HashMap<String, String>) dateUtilizator.get(0);

                            System.out.println("Parola " + dateUser.get("Parola"));
                            if (utilizator.validatePassword(parola, dateUser.get("Parola"))) {

                                HttpSession session;
                                session = request.getSession(false);
                                session.setAttribute("idUtilizator", dateUser.get("#P"));
                                session.setAttribute("utilizator", dateUser.get("Prenume") + " " + dateUser.get("Nume"));

                                System.out.println("Aici " + rememberMe);
                                if (rememberMe.equals("1")) {
                                    System.out.println("Creez cookie!");
                                    Cookie c = new Cookie("emailUtilizator", email);
                                    c.setMaxAge(24 * 60 * 60);
                                    response.addCookie(c);  // response is an instance of type HttpServletReponse
                                } else if (rememberMe.equals("0")) {
                                    System.out.println("Sterg cookie!");
                                    Cookie[] cookies = request.getCookies();
                                    for (int i = 0; i < cookies.length; i++) {
                                        Cookie c = cookies[i];
                                        if (c.getName().equals("emailUtilizator")) {
                                            cookies[i].setMaxAge(0);
                                            response.addCookie(cookies[i]);
                                        }
                                    }
                                }

                                String encodedURL = response.encodeRedirectURL("welcome.jsp");
                                System.out.println("Encoded URL " + encodedURL);
                                response.sendRedirect(encodedURL);
                                //request.getRequestDispatcher("/welcome.jsp").forward(request, response);

                            } else {

                                valoriCorecteLogin.put("email", email);
                                request.setAttribute("valoriCorecteLogin", valoriCorecteLogin);
                                request.setAttribute("eroareUtilizatorInexistent", "Parola gresita");
                                request.getRequestDispatcher("/login.jsp").forward(request, response);
                            }
                            // user.validatePassword(parola, parola);

                        } else {
                            System.out.println("Utilizatorul nu exista in baza de date!");
                            request.setAttribute("eroareUtilizatorInexistent", "Utilizatorul cu adresa de mail " + email + " nu exista in baza de date!");
                            request.setAttribute("display", "true");

                            request.getRequestDispatcher("/login.jsp").forward(request, response);
                        }

                    } catch (ExceptieUtilizator excpCl) {
                        request.setAttribute("eroriLogin", excpCl.getMesajHash());
                        request.setAttribute("valoriCorecteLogin", excpCl.getValoriCorecte());
                        request.setAttribute("tile", "Login");
                        request.getRequestDispatcher("/login.jsp").forward(request, response);
                    // response.sendRedirect("index_dashboard.jsp#Tile");
                        //request.getRequestDispatcher("/index_dashboard.jsp").forward(request, response);
                        System.out.println("erori " + excpCl.getMesaj());
                        System.out.println("valori corecte " + excpCl.getMesajValCorecte());
                    }

                } catch (Exception ex) {
                    System.out.println("Nu se poate realiza conexiunea!");
                    Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
                }
                out.close();
            }

        }
    }

}
