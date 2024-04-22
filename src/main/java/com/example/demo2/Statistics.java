package com.example.demo2;

import java.util.Map;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.HashMap;

public class Statistics extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Statistics</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Statistics</h1>");
        HashMap<String, Integer> statistics = SubmitAnswer.getStatistics();
        for (String option : statistics.keySet()) {
            out.println(option + ": " + statistics.get(option) + "<br>");
        }
        out.println("<br><a href=\"index.jsp\">Back</a>");
        out.println("</body>");
        out.println("</html>");
    }
}


