/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.studentmanager.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import com.studentmanager.services.RegisterService;
import com.studentmanager.dao.registerDAO;
/**
 *
 * @author s1gm9
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/registration"})
public class RegisterServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        String instructorID=request.getParameter("instructor_id");
        if(instructorID!=null && !instructorID.isEmpty()){
            try{
                int myInt=Integer.parseInt(instructorID);
                String fullname=request.getParameter("fullname");
                String email=request.getParameter("email");
                String password=request.getParameter("password");
                String confirmPass=request.getParameter("confirm_password");
                registerDAO.registerUser(myInt, fullname, email, password, confirmPass);
                doGet(request, response);
            }catch(NumberFormatException e){
                response.sendError(HttpServletResponse.SC_BAD_REQUEST,"invalid instructor id format");
               // log.error("Invalid instructorid format",e);
            }
        }else{
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,"Missing instructor id parameter");
        }  
    }
@Override
     protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        List<RegisterService> registerList=registerDAO.getAllregister();
        request.setAttribute("registerList",registerList);
        
        request.getRequestDispatcher("registerList.jsp").forward(request, response);
    }
}