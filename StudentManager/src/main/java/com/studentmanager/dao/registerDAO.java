/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanager.dao;

import com.studentmanager.database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.studentmanager.services.RegisterService;

/**
 *
 * @author s1gm9
 */
public class registerDAO {
    public static List<RegisterService> getAllregister(){
        List<RegisterService> registers=new ArrayList<>();
        try(
            Connection con = DatabaseConnection.getConnection();
            Statement ps=con.createStatement();
            ResultSet rs=ps.executeQuery("SELECT * FROM register")){
            while(rs.next()){
                registers.add(new RegisterService(rs.getInt("instructor_id"),rs.getString("fullname"),rs.getString("email"),rs.getString("password"),rs.getString("confirm_password")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return registers;
    }
    public static void registerUser(int instructor_id,String fullname,String email,String password,String confirm_password){
        try{
            Connection con = DatabaseConnection.getConnection();
            String sql="INSERT INTO register(instructor_id,fullname,email,password,confirm_password)values(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,instructor_id);
            ps.setString(2,fullname);
            ps.setString(3, email);
            ps.setString(4,password);
            ps.setString(5,confirm_password);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
