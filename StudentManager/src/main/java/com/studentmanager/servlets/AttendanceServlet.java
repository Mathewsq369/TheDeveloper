/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.studentmanager.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.util.*;
import com.studentmanager.dao.attendanceDAO;
import com.studentmanager.services.AttendanceService;


/**
 *
 * @author Ahmed
 */
@WebServlet(name="AttendanceServlet",urlPatterns="/AttendanceServlet")
public class AttendanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
            String studentId=request.getParameter("student_id");
            String attendanceDate=request.getParameter("date");
            String status=request.getParameter("status");
            AttendanceService attendanceService=new AttendanceService(studentId,attendanceDate,status);
             try{
            int rowsInserted=attendanceDAO.insertAttendance(attendanceService);
            if(rowsInserted>0){
                request.setAttribute("message","Attendance recorded successfully");
            }else{
                request.setAttribute("message","Failed to record attendance");
                }
            }catch(SQLException|ClassNotFoundException e){
                        e.printStackTrace();
                        request.setAttribute("message","Error");
                      }
                    request.getRequestDispatcher("attendanceResult.jsp").forward(request, response);
                }
}
