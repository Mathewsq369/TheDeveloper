package com.studentmanager.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String JDBC_URL="jdbc:mariadb://localhost:3306/student_manager";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="seth2019";
    
    public static Connection getConnection(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}