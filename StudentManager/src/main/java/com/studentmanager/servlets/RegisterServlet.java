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
<<<<<<< HEAD
import com.studentmanager.dao.registerDAO;
=======
import jakarta.servlet.http.HttpSession;

>>>>>>> 6ced0640e2eeb73f4572c94d50c13537ab5bc663
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
<<<<<<< HEAD
                doGet(request, response);
=======
                response.sendRedirect("registration");
                HttpSession session=request.getSession();
                session.setAttribute("fullname", fullname);
        
>>>>>>> 6ced0640e2eeb73f4572c94d50c13537ab5bc663
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