/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanager.dao;
import java.sql.*;
import com.studentmanager.database.DatabaseConnection;
import com.studentmanager.services.AttendanceService;
import java.util.*;

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
    public static List<AttendanceService> getAllAttendance(){
        List<AttendanceService> attendance=new ArrayList<>();
        try(
            Connection con=DatabaseConnection.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM attendance")){
            while(rs.next()){
                attendance.add(new AttendanceService(rs.getString("student_id"),rs.getString("date"),rs.getString("status")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return attendance;
    }
}
