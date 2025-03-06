package com.studentmanager.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
<<<<<<< HEAD
    private static Connection con = null;

    private static final String URL = "jdbc:mariadb://localhost:3306/StudentManager";
    private static final String USER = "root";
    private static final String PASSWORD = "m9r19db";

=======
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/student_db";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="Shamha@2002";
    
>>>>>>> 13fee2821379c44920a29f7273a9158b77aa3be5
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
