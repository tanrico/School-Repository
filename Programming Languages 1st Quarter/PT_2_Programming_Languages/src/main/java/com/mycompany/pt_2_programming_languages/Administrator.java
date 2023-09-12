/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt_2_programming_languages;

/**
 *
 * @author Rico Tan
 */
public class Administrator extends User{
    private String adminID;

    //constructors, getters, and setters
    public Administrator(String adminID, String fName, String lName, String username, String password, String userType, String birthdate, String email) {
        super(fName, lName, username, password, userType, birthdate, email);
        this.adminID = adminID;
    }
    

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
    
}
