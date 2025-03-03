package com.studentmanager.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static Connection con = null;

    // Database Credentials (Update if needed!)
    private static final String URL = "jdbc:mariadb://localhost:3306/student_manager";
    private static final String USER = "root";
    private static final String PASSWORD = "seth2019";

    public static Connection getConnection(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
