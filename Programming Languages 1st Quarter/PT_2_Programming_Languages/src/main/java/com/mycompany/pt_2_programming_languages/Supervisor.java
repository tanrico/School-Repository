/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt_2_programming_languages;

/**
 *
 * @author Rico Tan
 */
public class Supervisor extends User{
    private String supervisorID;

    //constructors, getters, and setters
    public Supervisor(String supervisorID, String fName, String lName, String username, String password, String userType, String birthdate, String email) {
        super(fName, lName, username, password, userType, birthdate, email);
        this.supervisorID = supervisorID;
    }

    public String getAdminID() {
        return supervisorID;
    }

    public void setAdminID(String adminID) {
        this.supervisorID = adminID;
    }    
}
