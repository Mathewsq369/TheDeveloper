/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.studentmanager.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.util.*;
import com.studentmanager.dao.attendanceDAO;
import com.studentmanager.services.AttendanceService;

@WebServlet(name="AttendanceListServlet",urlPatterns="/AttendanceListServlet")
public class AttendanceListServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        List<AttendanceService> attendance=attendanceDAO.getAllAttendance();
        request.setAttribute("attendance",attendance);
        request.getRequestDispatcher("attendanceList.jsp").forward(request, response);
    }
}
