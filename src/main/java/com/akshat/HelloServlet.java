package com.akshat;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service");
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<b>Akshat</>");
    }


}