package com.ADAsig.controller;

import java.io.PrintWriter;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.resource.spi.work.SecurityContext;
import javax.security.auth.Subject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@DeclareRoles({"Member", "Dealer", "Admin"})
@RolesAllowed({"Member"})
@WebServlet(name = "Logout", urlPatterns = {"/Logout"})
public class LogoutController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try (PrintWriter out = response.getWriter()) {

            try {
                HttpSession session = request.getSession();
                
               
                System.out.println("Detalii sesiune " + session.getAttribute("utilizator") + "  " + session.getAttributeNames());
                session.invalidate();

                out.print("You are successfully logged out!");
                
                request.getRequestDispatcher("/login.jsp").forward(request, response);

                
            } catch (Exception e) {
                
                System.out.println("Sesiunea nu exista!");
            }

            out.close();
        } 
    }
}
