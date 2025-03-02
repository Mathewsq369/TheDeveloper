package register.DAO;

import register.DAO.DButil;
import register.register;
import java.util.*;
import java.sql.*;


public class registerDAO {
    public static List<register> getAllregister(){
        List<register> registers=new ArrayList<>();
        try(
            Connection con=DButil.getConnection();
            Statement ps=con.createStatement();
            ResultSet rs=ps.executeQuery("SELECT * FROM register")){
            while(rs.next()){
                registers.add(new register(rs.getInt("instructor_id"),rs.getString("fullname"),rs.getString("email"),rs.getString("password"),rs.getString("confirm_password")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return registers;
    }
    public static void registerUser(int instructor_id,String fullname,String email,String password,String confirm_password){
        try{
            Connection con=DButil.getConnection();
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
