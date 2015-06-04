package com.ADAsig.controller;


import com.ADAsig.util.ConnectionPool;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;


public class ConnectionPoolServlet extends HttpServlet {
    //Initialize global variables
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        // Instantiate the ConnectionPool
        ConnectionPool pool = new ConnectionPool();
        try {
             // Set the JDBC Driver
            
            pool.setDriver("com.mysql.jdbc.Driver");
            // Set the URL to the Datasource
            //jdbc:mysql://yourserver:3306/yourdatabase?zeroDateTimeBehavior=convertToNull
            pool.setURL("jdbc:mysql://localhost:3306/adasig?zeroDateTimeBehavior=convertToNull");
            // Set the initial size of the Connection Pool
            pool.setSize(10);
            //Set the Username
            pool.setUsername("root");
            //Set the Password
            pool.setPassword("");
            //Initialize the pool
            pool.initializePool();

            //Once the pool is Initialized, add it to the
            //Global ServletContext. This makes it available
            //To other servlets using the same ServletContext.
            ServletContext context = getServletContext();
            context.setAttribute("CONNECTION_POOL", pool);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Set the response content-type
        response.setContentType("text/html");
        //get the Writer object
        PrintWriter out = response.getWriter();
        out.println("This Servlet does not service requests!");
        out.close();
    }

    public void destroy() {
        //Access the ServletContext using the getAttribute()
        //method, which returns a reference to the ConnectionPool.
        ServletContext context = getServletContext();
        ConnectionPool pool = (ConnectionPool) context.getAttribute("CONNECTION_POOL");
        if (pool != null) {
            // empty the pool
            pool.emptyPool();
            // Remove the Attribute from the ServletContext
            context.removeAttribute("CONNECTION_POOL");
        } else {
            System.err.println("Could not get a reference to Pool!");
        }
    }
    
    //Get Servlet information
    public String getServletInfo() {
        return "ConnectionPoolServlet Information";
    }
}
