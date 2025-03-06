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
    private int instructorID;
    private String fullname;
    private String email;
    private String password;
    private String confirmPassword;
    
    public RegisterService (int instructorID,String fullname,String email,String password,String confirmPassword){
        this.instructorID=instructorID;
        this.fullname=fullname;
        this.email=email;
        this.password=password;
        this.confirmPassword = confirmPassword;
    }
    public int getInstructorid(){return instructorID;}
    public String getFullname(){return fullname;}
    public String getEmail(){ return email;}
    public String getPassword(){return password;}
    public String getConfirmpassword(){return confirmPassword;}
}
