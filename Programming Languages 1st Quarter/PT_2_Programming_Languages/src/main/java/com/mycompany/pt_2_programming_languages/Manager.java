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
    public Manager(String managerID, String fName, String lName, String username, String password, String userType, String birthdate, String email) {
        super(fName, lName, username, password, userType, birthdate, email);
        this.managerID = managerID;
    }

    public String getAdminID() {
        return managerID;
    }

    public void setAdminID(String adminID) {
        this.managerID = adminID;
    }
        
}
