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
@WebServlet(name = "Asigurare", urlPatterns = {"/Asigurare"})
public class AsigurareController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();
        ConnectionPool cp = (ConnectionPool) context.getAttribute("CONNECTION_POOL");
        Connection con;

        Map<String, String> aniPermis = new LinkedHashMap<String, String>();
        for (int i = Calendar.getInstance().get(Calendar.YEAR); i >= 1930; i--) {
            String keyValue = Integer.toString(i);
            aniPermis.put(keyValue, keyValue);
        }

        String aniPermisJSON = new Gson().toJson(aniPermis);

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

        Map<String, String> allJudeteMap = new LinkedHashMap<String, String>();
        for (int i = 0; i < allJudete.size(); i++) {
            HashMap<String, String> hm = (HashMap<String, String>) allJudete.get(i);
            judeteDenumire.add(hm.get("Denumire"));
            allJudeteMap.put(Integer.toString(i + 1), hm.get("Denumire"));
            judeteID.add(hm.get("#J"));
        }

        String judeteJSON = new Gson().toJson(allJudeteMap);

        String judet = request.getParameter("judetDenumire");
        System.out.println("judet got from jsp " + judet);
        String judetID = "";
        System.out.println("judeteDenumire size " + judeteDenumire.size());
        for (int i = 0; i < judeteDenumire.size(); i++) {
            System.out.println("judeteDenumire=" + judeteDenumire.get(i) + ";judeteID=" + judeteID.get(i));
            if (judeteDenumire.get(i).toString().equals(judet)) {
                System.out.println("judetDenumire[" + i + "]= " + judeteDenumire.get(i));
                judetID = (String) judeteID.get(i);
                System.out.println("judetID[" + i + "]= " + judeteID.get(i));
            }
        }

        System.out.println("judetID " + judetID);

        Map<String, String> allLocalitatiMap = new LinkedHashMap<String, String>();
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

        for (int i = 0; i < allLocalitati.size(); i++) {
            HashMap<String, String> hm = (HashMap<String, String>) allLocalitati.get(i);
            allLocalitatiMap.put(Integer.toString(i), hm.get("Denumire"));
        }

        System.out.println("allLocalitati " + allLocalitati.toString());
        String localitatiJSON = new Gson().toJson(allLocalitatiMap);

        String allJSON = "[" + aniPermisJSON + "," + judeteJSON + "," + localitatiJSON + "]"; //Put both objects in an array of 2 elements

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(allJSON);

        PrintWriter out = response.getWriter();
        System.out.println("json " + allJSON);
        // out.print(json);  
        //out.flush();
        //
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
