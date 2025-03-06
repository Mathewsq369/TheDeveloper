<<<<<<< HEAD
<%@page import="java.util.List,register.register" %>
=======
<%@page import="java.util.List,com.studentmanager.services.RegisterService" %>
>>>>>>> 13fee2821379c44920a29f7273a9158b77aa3be5
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
<<<<<<< HEAD
            List<register> registers=(List<register>)request.getAttribute("registerList");
=======
            List<RegisterService> registers=(List<RegisterService>)request.getAttribute("registerList");
>>>>>>> 13fee2821379c44920a29f7273a9158b77aa3be5
            if(registers==null || registers.isEmpty()){
            %>
            <p>Registration list is empty</p>
            <%
            }else{
            %>
            <table border="1">
                <tr><td>InstructorId</td><td>FullName</td><td>Email</td><td>Password</td><td>Confirm_Pass</td></tr>
                <%
<<<<<<< HEAD
                    for(register register1:registers){%>
                    <tr>
                        <td><%=register1.getInstructorid()%></td>
=======
                    for(RegisterService register1:registers){%>
                    <tr>
                        <td><%=register1.getInstructorId()%></td>
>>>>>>> 13fee2821379c44920a29f7273a9158b77aa3be5
                        <td><%=register1.getFullname()%></td>
                        <td><%=register1.getEmail()%></td>
                        <td><%=register1.getPassword()%></td>
                        <td><%=register1.getConfirmpassword()%></td>
                    </tr>
                    <%}%>
            </table>
            <%}%>
            <br>
            <a href="registration.jsp">Go Back to registration</a>
    </body>
</html>
