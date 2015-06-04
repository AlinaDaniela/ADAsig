/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ADAsig.controller;

import com.ADAsig.dao.JudeteDAO;
import com.ADAsig.dao.LocalitatiDAO;
import com.ADAsig.dao.UtilizatoriDAO;
import com.ADAsig.model.Judete;
import com.ADAsig.util.ConnectionPool;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(name = "AsigurareOld", urlPatterns = {"/AsigurareOld"})
public class AsigurareOld extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();
        ConnectionPool cp = (ConnectionPool) context.getAttribute("CONNECTION_POOL");
        Connection con;
        
        ArrayList aniPermis = new ArrayList();

        for (int i = Calendar.getInstance().get(Calendar.YEAR); i >= 1930; i--) {
            aniPermis.add(i);
        }

        //request.setAttribute("aniPermis", aniPermis);

        List allJudete = null;
        
        try {
            con = cp.getConnection();
            JudeteDAO judetDao = new JudeteDAO(con);
            allJudete = judetDao.getAllJudete();
        } catch (Exception ex) {
            System.out.println("Nu se poate realiza conexiunea!");
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList judeteDenumire = new ArrayList();
        ArrayList judeteID = new ArrayList();

        for (int i = 0; i < allJudete.size(); i++) {
            HashMap<String, String> hm = (HashMap<String, String>) allJudete.get(i);
            judeteDenumire.add(hm.get("Denumire"));
            judeteID.add(hm.get("#J"));
        }

        //response.setContentType("application/json");
        //response.setCharacterEncoding("UTF-8");
        //response.getWriter().write(new Gson().toJson(allJudete));
        //String gsonJudete = new Gson().toJson(allJudete);
        //System.out.println("allJudete " + allJudete.toString() + "  " + allJudete.size());
        //System.out.println("gson " + gsonJudete);

        //out.println(gsonJudete);
        //request.setAttribute("judete", judeteDenumire);
       // request.getRequestDispatcher("/asigurare.jsp").forward(request, response);
        
        String judet = request.getParameter("judetDenumire");
        System.out.println("judet got from jsp " + judet);
        String judetID = "";
        System.out.println("judeteDenumire size " + judeteDenumire.size());
        for (int i = 0; i < judeteDenumire.size(); i++) {
            System.out.println("judeteDenumire=" + judeteDenumire.get(i) + ";judeteID=" + judeteID.get(i));
            if (judeteDenumire.get(i).toString().equals(judet)){
                System.out.println("judetDenumire[" + i + "]= " + judeteDenumire.get(i));
                judetID = (String) judeteID.get(i);
                System.out.println("judetID[" + i + "]= " + judeteID.get(i));
            }
        }

        System.out.println("judetID " + judetID);

        List allLocalitati = null;
        judetID = "1";
        try {
            con = cp.getConnection();
            LocalitatiDAO localitatiDao = new LocalitatiDAO(con);
            allLocalitati = localitatiDao.getAllLocalitatiDenumireForJudet(judetID);
        } catch (Exception ex) {
            System.out.println("Nu se poate realiza conexiunea!");
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Map<String, String> reset = new LinkedHashMap<>();
        reset.put("1", "Select Judet");

        System.out.println("allLocalitati " + allLocalitati.toString());
        String json = null;
        json = new Gson().toJson(allLocalitati);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
        PrintWriter out = response.getWriter();
        System.out.println("json " + json);
       // out.print(json);  
        //out.flush();
        //
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
