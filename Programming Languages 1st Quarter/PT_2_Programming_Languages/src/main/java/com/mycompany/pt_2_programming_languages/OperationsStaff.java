/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt_2_programming_languages;

/**
 *
 * @author Rico Tan
 */
public class OperationsStaff extends User{
    private String osID;

    //constructors, getters, and setters
    public OperationsStaff(String adminID, String fName, String lName, String username, String password, String userType, String birthdate) {
        super(fName, lName, username, password, userType, birthdate);
        this.osID = adminID;
    }

    public String getAdminID() {
        return osID;
    }

    public void setAdminID(String adminID) {
        this.osID = adminID;
    }    
}
