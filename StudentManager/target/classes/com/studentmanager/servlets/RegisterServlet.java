package register.controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.util.*;
import register.DAO.registerDAO;
import register.register;

@WebServlet("/registers")

public class RegisterServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        String instructorId=request.getParameter("instructor_id");
        if(instructorId!=null && !instructorId.isEmpty()){
            try{
                int myInt=Integer.parseInt(instructorId);
                String fullname=request.getParameter("fullname");
                String email=request.getParameter("email");
                String password=request.getParameter("password");
                String confirmPass=request.getParameter("confirm_password");
                registerDAO.registerUser(myInt, fullname, email, password, confirmPass);
                response.sendRedirect("registers");
            }catch(NumberFormatException e){
                response.sendError(HttpServletResponse.SC_BAD_REQUEST,"invalid instructor id format");
               // log.error("Invalid instructorid format",e);
            }
        }else{
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,"Missing instructor id parameter");
        }  
    }
     protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        List<register> registerList=registerDAO.getAllregister();
        request.setAttribute("registerList",registerList);
        
        request.getRequestDispatcher("registerList.jsp").forward(request, response);
    }
}