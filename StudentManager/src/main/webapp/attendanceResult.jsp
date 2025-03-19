<%-- 
    Document   : attendanceResult
    Created on : 10 Mar 2025, 10:40:33
    Author     : Ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance Result</title>
    </head>
    <body>
        <h1>Attendance Result</h1>
<p>
    <% 
    String studentId = request.getParameter("student_id");
    String message = (String) request.getAttribute("message");

    if ("Error".equals(message)) {
    %>
        An error occurred: Student ID: <%= studentId %> not available
    <%
    } else {
    %>
        <%= message %>
    <%
    } 
    %>
</p>

        <a href="attendance.jsp">Go back to attendance</a>
    </body>
</html>
