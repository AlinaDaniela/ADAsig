/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "SaveData", urlPatterns = {"/SaveData"})
public class SaveData extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String country;
        try {
            PrintWriter out = res.getWriter();
            out.print("Data saved successfully....!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
