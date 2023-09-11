/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt_2_programming_languages;

/**
 *
 * @author Rico Tan
 */
public class Manager extends User{
   private String managerID;

    //constructors, getters, and setters
    public Manager(String adminID, String fName, String lName, String username, String password, String userType, String birthdate) {
        super(fName, lName, username, password, userType, birthdate);
        this.managerID = adminID;
    }

    public String getAdminID() {
        return managerID;
    }

    public void setAdminID(String adminID) {
        this.managerID = adminID;
    }
        
}
