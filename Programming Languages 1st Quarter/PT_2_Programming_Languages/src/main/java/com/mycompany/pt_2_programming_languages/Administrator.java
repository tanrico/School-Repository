/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt_2_programming_languages;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Rico Tan
 */
public class Administrator extends User{
    private String adminID;
    
    //LinkedList for users
    LinkedList<Manager> managerList = new LinkedList<>();
    LinkedList<OperationsStaff> osList = new LinkedList<>();
    LinkedList<Supervisor> supervisorList = new LinkedList<>();

    //Functionalities used outside of the class
    public void profileManagement(){
        Scanner scn = new Scanner(System.in);
        String input;
        boolean profile = true;
        
        do{
            System.out.println("""
                                ----- MANAGE USER PROFILE -----
                                [a] Add
                                [b] Edit
                                [c] Delete
                                [d] Exit
                                """);
            input = scn.nextLine();
            switch(input){
                case "a" -> addUser();
                case "b" -> editUser();
                case "c" -> deleteUser();
                case "d" -> profile = false;
                default -> System.out.println("Invalid option. Please input a letter within the specified choices.");
            }    
        }while(profile);
    }
    
    public void accessManagement(){
        Scanner scn = new Scanner(System.in);
        String input;
        boolean access = true;
        
        do{
            System.out.println("""
                                ----- MANAGE USER ACCESS -----
                                [a] Select User
                                [b] Exit
                                """);
            input = scn.nextLine();
            switch(input){
                case "a" -> editUserAccess();
                case "b" -> access = false;
                default -> System.out.println("Invalid option. Please input a letter within the specified choices.");
            }    
        }while(access);
    }
    
    //Adding, Editing, and Deleting users
    void addUser(){
        Scanner scn = new Scanner(System.in);
        boolean exit = false;
        String userTypeChoice;
        String userType = "";
        
        //Determining the User Type
        System.out.println("""
                           Please enter the type of user you are creating.
                           [a] Manager
                           [b] Operations Staff
                           [c] Supervisor
                           [e] Exit
                           """);
        
        userTypeChoice = scn.nextLine();
        switch(userTypeChoice){
            case "a" -> userType = "Manager";
            case "b" -> userType = "Operations_Staff";
            case "c" -> userType = "Supervisor";
            case "e" -> exit = true;
            default -> System.out.println("Invalid option. Please input a letter within the specified choices.");
        }
        
        //exiting the menu if exit is true
        if(exit){
            return;   
        }
        
        //Getting the other information for the user account
        System.out.print("First Name: ");
        String fname = scn.nextLine();
        System.out.print("Last Name: ");
        String lname = scn.nextLine();
        System.out.print("Birthdate (mm/dd/yyyy): ");
        String birthdate = scn.nextLine();
        System.out.print("Email: ");
        String email = scn.nextLine();
        System.out.print("Username: ");
        String username = scn.nextLine();
        System.out.print("Password: ");
        String password = scn.nextLine();
        
        //creation of user based on usertype
        switch(userType){
            case "Manager" -> {
                Manager m = new Manager("mID", fname, lname, username, password, userType, birthdate, email);
                managerList.add(m);
            }
            case "Operations_Staff" -> {
                OperationsStaff os = new OperationsStaff("osID", fname, lname, username, password, userType, birthdate, email);
                osList.add(os);
            }
            case "Supervisor" -> {
                Supervisor s = new Supervisor("sID", fname, lname, username, password, userType, birthdate, email);
                supervisorList.add(s);
            }
        }
    }
    
    void editUser(){
        Scanner scn = new Scanner(System.in);
        boolean exit = false;
        String userTypeChoice;
        String userType = "";
        int userIndex = 0;

        //getting the usertype of the edited account
        System.out.println("""
                           Please enter the type of user you are creating.
                           [a] Manager
                           [b] Operations Staff
                           [c] Supervisor
                           [e] Exit
                           """);
        
        userTypeChoice = scn.nextLine();
        switch(userTypeChoice){
            case "a" -> userType = "Manager";
            case "b" -> userType = "Operations_Staff";
            case "c" -> userType = "Supervisor";
            case "e" -> exit = true;
            default -> System.out.println("Invalid option. Please input a letter within the specified choices.");
        }
        
        //exiting the menu if exit is true
        if(exit){
            return;
        }
        
        //getting the index of the item.
        boolean gettingIndex = true;
        do{
            System.out.println("Please input the INDEX of the user within the list.");
            try {
               userIndex = Integer.parseInt(scn.nextLine()); 
            } catch(NumberFormatException ex){
                System.out.println("Invalid index. Please try again.");
            }
            
            //checking if the index is within the list.
            switch(userType){
                case "Manager" -> {
                    try{
                        managerList.get(userIndex);
                        gettingIndex = false;
                    }catch(IndexOutOfBoundsException ex){
                        System.out.println("Cannot find the account. Try a different index.");
                    }
                    
                }
                case "Operations_Staff" -> {
                    try{
                        osList.get(userIndex);
                        gettingIndex = false;
                    }catch(IndexOutOfBoundsException ex){
                        System.out.println("Cannot find the account. Try a different index.");
                    }
                }
                case "Supervisor" -> {
                    try{
                        supervisorList.get(userIndex);
                        gettingIndex = false;
                    }catch(IndexOutOfBoundsException ex){
                        System.out.println("Cannot find the account. Try a different index.");
                    }
                }
            }

        }while(gettingIndex);
        
        //Getting the other information for the user account
        System.out.print("EDITING INFORMATION \nFirst Name: ");
        String fname = scn.nextLine();
        System.out.print("Last Name: ");
        String lname = scn.nextLine();
        System.out.print("Birthdate (mm/dd/yyyy): ");
        String birthdate = scn.nextLine();
        System.out.print("Email: ");
        String email = scn.nextLine();
        System.out.print("Username: ");
        String username = scn.nextLine();
        System.out.print("Password: ");
        String password = scn.nextLine();
        
        //editing of user based on usertype
        switch(userType){
                case "Manager" -> {
                    Manager m = managerList.get(userIndex);
                    m.setfName(fname);
                    m.setlName(lname);
                    m.setBirthdate(birthdate);
                    m.setEmail(email);
                    m.setUsername(username);
                    m.setPassword(password);
                    System.out.print("Account Updated Successfully.");
                }
                case "Operations_Staff" -> {
                    OperationsStaff os = osList.get(userIndex);
                    os.setfName(fname);
                    os.setlName(lname);
                    os.setBirthdate(birthdate);
                    os.setEmail(email);
                    os.setUsername(username);
                    os.setPassword(password);
                    System.out.print("Account Updated Successfully.");
                }
                case "Supervisor" -> {
                    Supervisor s = supervisorList.get(userIndex);
                    s.setfName(fname);
                    s.setlName(lname);
                    s.setBirthdate(birthdate);
                    s.setEmail(email);
                    s.setUsername(username);
                    s.setPassword(password);
                    System.out.print("Account Updated Successfully.");
                }
            }
        
    }
    
    void deleteUser(){
        Scanner scn = new Scanner(System.in);
        boolean exit = false;
        String userTypeChoice;
        String userType = "";
        int userIndex = 0;

        //getting the usertype of the edited account
        System.out.println("""
                           Please enter the type of user you are creating.
                           [a] Manager
                           [b] Operations Staff
                           [c] Supervisor
                           [e] Exit
                           """);
        
        userTypeChoice = scn.nextLine();
        switch(userTypeChoice){
            case "a" -> userType = "Manager";
            case "b" -> userType = "Operations_Staff";
            case "c" -> userType = "Supervisor";
            case "e" -> exit = true;
            default -> System.out.println("Invalid option. Please input a letter within the specified choices.");
        }
        
        //exiting the menu if exit is true
        if(exit){
            return;
        }
        
        //getting the index of the item.
        boolean gettingIndex = true;
        do{
            System.out.println("Please input the INDEX of the user within the list.");
            try {
               userIndex = Integer.parseInt(scn.nextLine()); 
            } catch(NumberFormatException ex){
                System.out.println("Invalid index. Please try again.");
            }
            
            //checking if the index is within the list.
            switch(userType){
                case "Manager" -> {
                    try{
                        managerList.get(userIndex);
                        gettingIndex = false;
                    }catch(IndexOutOfBoundsException ex){
                        System.out.println("Cannot find the account. Try a different index.");
                    }
                }
                case "Operations_Staff" -> {
                    try{
                        osList.get(userIndex);
                        gettingIndex = false;
                    }catch(IndexOutOfBoundsException ex){
                        System.out.println("Cannot find the account. Try a different index.");
                    }
                }
                case "Supervisor" -> {
                    try{
                        supervisorList.get(userIndex);
                        gettingIndex = false;
                    }catch(IndexOutOfBoundsException ex){
                        System.out.println("Cannot find the account. Try a different index.");
                    }
                }
            }

        }while(gettingIndex);
        
        //confirming to delete and deleting the account
        String deleteConfirm = "";
        boolean deleteProcess = true;
        
        switch(userType){
                case "Manager" -> {
                    do{
                        System.out.println("Do you confirm to delete the following account? [y/n]");
                        System.out.println(managerList.get(userIndex).getUsername() + "from Manager List.");
                        deleteConfirm = scn.nextLine();

                        if(null == deleteConfirm){
                            System.out.println("Invalid option. Please choose 'y' or 'n'.");
                        }else switch (deleteConfirm) {
                            case "y" -> {
                                managerList.remove(userIndex);
                                System.out.println("Deleted successfully.");
                                deleteProcess = false;
                            }
                            case "n" -> {
                                System.out.println("Cancelled delete.");
                                deleteProcess = false;
                            }
                            default -> System.out.println("Invalid option. Please choose 'y' or 'n'.");
                        }    
                    }while(deleteProcess);
                }
                case "Operations_Staff" -> {
                    do{
                        System.out.println("Do you confirm to delete the following account? [y/n]");
                        System.out.println(osList.get(userIndex).getUsername() + "from Operations Staff List.");
                        deleteConfirm = scn.nextLine();

                        if(null == deleteConfirm){
                            System.out.println("Invalid option. Please choose 'y' or 'n'.");
                        }else switch (deleteConfirm) {
                            case "y" -> {
                                osList.remove(userIndex);
                                System.out.println("Deleted successfully.");
                                deleteProcess = false;
                            }
                            case "n" -> {
                                System.out.println("Cancelled delete.");
                                deleteProcess = false;
                            }
                            default -> System.out.println("Invalid option. Please choose 'y' or 'n'.");
                        }    
                    }while(deleteProcess);
                }
                case "Supervisor" -> {
                    do{
                        System.out.println("Do you confirm to delete the following account? [y/n]");
                        System.out.println(supervisorList.get(userIndex).getUsername() + "from Supervisor List.");
                        deleteConfirm = scn.nextLine();

                        if(null == deleteConfirm){
                            System.out.println("Invalid option. Please choose 'y' or 'n'.");
                        }else switch (deleteConfirm) {
                            case "y" -> {
                                supervisorList.remove(userIndex);
                                System.out.println("Deleted successfully.");
                                deleteProcess = false;
                            }
                            case "n" -> {
                                System.out.println("Cancelled delete.");
                                deleteProcess = false;
                            }
                            default -> System.out.println("Invalid option. Please choose 'y' or 'n'.");
                        }    
                    }while(deleteProcess);
                }
            }
    }
    
    //Changing User Access
    void editUserAccess(){
        System.out.println("Work In Progress");
    }
    
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
