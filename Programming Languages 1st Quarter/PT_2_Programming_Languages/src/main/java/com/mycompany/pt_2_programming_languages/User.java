/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt_2_programming_languages;

/**
 *
 * @author Rico Tan
 */
public class User {
    private String fName;
    private String lName;
    private String username;
    private String password;
    private String userType;
    private String birthdate;
    private String email;

    //constructors, getters, and setters
    public User(String fName, String lName, String username, String password, String userType, String birthdate,String email) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.birthdate = birthdate;
        this.email = email;
    }

    User() { //default constructor
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
