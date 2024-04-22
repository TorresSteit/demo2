package com.example.demo2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.HashMap;

public class SubmitAnswer extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static HashMap<String, Integer> statistics = new HashMap<>();

    public static HashMap<String, Integer> getStatistics() {
        return statistics;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Red = request.getParameter("Red");
        String Yellow = request.getParameter("Yellow");
        String Green = request.getParameter("Green");
        String Java=request.getParameter("Java");
        String C=request.getParameter("C");
        String PHP=request.getParameter("PHP");
        statistics.put(Red, statistics.getOrDefault(Red, 0) + 1);
        statistics.put(Yellow, statistics.getOrDefault(Red, 0) + 1);
        statistics.put(Green, statistics.getOrDefault(Green, 0) + 1);
        statistics.put(Java, statistics.getOrDefault(Java, 0) + 1);
        statistics.put(C, statistics.getOrDefault(C, 0) + 1);
        statistics.put(PHP, statistics.getOrDefault(PHP, 0) + 1);

        response.sendRedirect("index.jsp");
    }
}
