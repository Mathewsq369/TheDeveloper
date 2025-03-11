package com.studentmanager.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
<<<<<<< HEAD
    private static Connection con = null;

    private static final String URL = "jdbc:mariadb://localhost:3306/StudentManager";
    private static final String USER = "root";
    private static final String PASSWORD = "m9r19db";

    public static Connection getConnection(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection(URL,USER,PASSWORD);
=======
    private static final String JDBC_URL="jdbc:mariadb://localhost:3306/student_manager";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="seth2019";
    
    public static Connection getConnection(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
>>>>>>> 09c130532efc3e46faa4a21989f470a7f636fb21
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}