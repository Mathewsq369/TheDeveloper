package com.studentmanager.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static Connection con = null;

    private static final String URL = "jdbc:mariadb://localhost:3306student_manager";
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
