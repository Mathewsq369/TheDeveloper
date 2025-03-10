<%@page import="java.util.List,com.studentmanager.services.RegisterService" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RegisterList</title>
    </head>
    <body>
        <h1>Registration List</h1>
        <% 
            List<RegisterService> registers=(List<RegisterService>)request.getAttribute("registerList");
            if(registers==null || registers.isEmpty()){
            %>
            <p>Registration list is empty</p>
            <%
            }else{
            %>
            <table border="1">
                <tr><td>InstructorId</td><td>FullName</td><td>Email</td><td>Password</td><td>Confirm_Pass</td></tr>
                <%
                    for(RegisterService register1:registers){%>
                    <tr>
                        <td><%=register1.getInstructorId()%></td>
                        <td><%=register1.getFullname()%></td>
                        <td><%=register1.getEmail()%></td>
                        <td><%=register1.getPassword()%></td>
                        <td><%=register1.getConfirmpassword()%></td>
                    </tr>
                    <%}%>
            </table>
            <%}%>
            <br>
            <a href="registration.jsp">Go back to registration</a>
    </body>
</html>
