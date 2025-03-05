package com.studentmanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.studentmanager.database.DatabaseConnection;
import com.studentmanager.models.User;

public class UserDAO {
    private Connection con=null;

    public UserDAO() {
        this.con = DatabaseConnection.getConnection();
    }

    public User checkCredentials(String instructorID, String password) {
        String sql = "SELECT * FROM users WHERE user_id = ? AND password = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, instructorID);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String user_id=rs.getString("user_id");
                String username=rs.getString("username");
                String dbPassword=rs.getString("password");
                return new User(user_id,username,dbPassword);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}