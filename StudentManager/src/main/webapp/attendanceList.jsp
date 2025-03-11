<%-- 
    Document   : attendanceList
    Created on : 11 Mar 2025, 12:37:20
    Author     : Ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List,com.studentmanager.services.AttendanceService" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance List</title>
    </head>
    <body>
         <h1>Attendance List</h1>
        <% 
            List<AttendanceService> attendance=(List<AttendanceService>)request.getAttribute("attendance");
            if(attendance==null || attendance.isEmpty()){
            %>
            <p>Attendance List is Empty</p>
            <%
            }else{
            %>
            <table border="1">
                <tr><td>StudentId</td><td>Date</td><td>Status</td></tr>
                <%
                    for(AttendanceService attendance1:attendance){%>
                    <tr>
                        <td><%=attendance1.getStudentId()%></td>
                        <td><%=attendance1.getAttendanceDate()%></td>
                        <td><%=attendance1.getStatus()%></td>
                    </tr>
                    <%}%>
            </table>
            <%}%>
            <br>
    </body>
</html>
