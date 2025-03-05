package com.studentmanager.models;

public class User {
    private String user_id;
    private String username;
    private String password;

    //Constructor
    public User(String user_id,String username,String password){
        this.user_id=user_id;
        this.username=username;
        this.password=password;
    }

    //setters
    public void setUserid(String userid){this.user_id=userid;}
    public void setUsername(String Username){this.username=Username;}
    public void setPassword(String Password){this.password=Password;}
    //getters
    public String getUserid(){return user_id;}
    public String getUsername(){return username;}
    public String getPassword(){return password;}
}
