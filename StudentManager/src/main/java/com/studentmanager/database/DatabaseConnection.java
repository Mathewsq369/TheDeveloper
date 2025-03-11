package com.studentmanager.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static Connection con = null;

    private static final String URL = "jdbc:mysql://localhost:3306/student_manager";
    private static final String USER = "root";
    private static final String PASSWORD = "!Magwach_Sql 254";

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}