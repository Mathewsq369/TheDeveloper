/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanager.services;

/**
 *
 * @author s1gm9
 */
public class RegisterService {
    private int instructor_id;
    private String fullname;
    private String email;
    private String password;
    private String confirm_password;
    
    public RegisterService (int instructorID,String fullname,String email,String password,String confirmPassword){
        this.instructor_id=instructorID;
        this.fullname=fullname;
        this.email=email;
        this.password=password;
        this.confirm_password = confirm_password;
    }
    public int getInstructorId(){return instructor_id;}
    public String getFullname(){return fullname;}
    public String getEmail(){ return email;}
    public String getPassword(){return password;}
    public String getConfirmpassword(){return confirm_password;}
}
