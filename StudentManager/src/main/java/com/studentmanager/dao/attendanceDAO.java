/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanager.dao;
import java.sql.*;
import com.studentmanager.database.DatabaseConnection;
import com.studentmanager.services.AttendanceService;

/**
 *
 * @author Ahmed
 */
public class attendanceDAO {
    public static int insertAttendance(AttendanceService attendanceService)throws SQLException,ClassNotFoundException{
        Connection con=DatabaseConnection.getConnection();
        String sql="INSERT INTO attendance(student_id,date,status) values(?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, attendanceService.getStudentId());
        ps.setString(2,attendanceService.getAttendanceDate());
        ps.setString(3,attendanceService.getStatus());
        
        int rowsInserted=ps.executeUpdate();
        ps.close();
        con.close();
        return rowsInserted;
    }
    
}
