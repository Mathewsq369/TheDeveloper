/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanager.services;

/**
 *
 * @author Ahmed
 */
public class AttendanceService {
    private String studentId;
    private String attendanceDate;
    private String status;
    
    
    public AttendanceService(String studentId,String attendanceDate,String status){
        this.studentId=studentId;
        this.attendanceDate=attendanceDate;
        this.status=status;
    }
    public String getStudentId(){return studentId;}
    public void setStudentId(String studentId){this.studentId=studentId;}
    public String getAttendanceDate(){return attendanceDate;}
    public void setAttendanceDate(String attendanceDate){this.attendanceDate=attendanceDate;}
    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}
}
