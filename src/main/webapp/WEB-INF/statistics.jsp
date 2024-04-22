<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Statistics</title>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h1>Statistics</h1>
<table>
    <tr>
        <th>Option</th>
        <th>Count</th>
    </tr>
    <%
        HashMap<String, Integer> statistics = (HashMap<String, Integer>) request.getAttribute("statistics");
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
    %>
    <tr>
        <td><%= entry.getKey() %></td>
        <td><%= entry.getValue() %></td>
    </tr>
    <% } %>
</table>
</body>
</html>

