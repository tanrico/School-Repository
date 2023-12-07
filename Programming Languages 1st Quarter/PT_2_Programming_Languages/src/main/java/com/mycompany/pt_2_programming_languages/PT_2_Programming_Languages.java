/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pt_2_programming_languages;

import java.util.Scanner;

/**
 *
 * @author Rico Tan
 */
public class PT_2_Programming_Languages {
    public static void main(String[] args) {
        String menuChoice;
        Scanner scn = new Scanner(System.in);
        boolean program = true;
        
        do{
            System.out.println("""
                               ----- MAIN MENU -----
                               [a] Log In
                               [b] Exit Program
                               """);
            menuChoice = scn.nextLine();
            switch(menuChoice){
                case "a" -> {
                    adminSystem();
                }
                case "b" -> program = false;
                default -> System.out.println("Invalid option. Please input a letter within the specified choices.");
            }            
        } while(program);

    }
    
    static void adminSystem(){
        Scanner scn = new Scanner(System.in);
        String menuChoice;
        boolean loggedIn = true;
        
        //Creating an admin instance
        Administrator admin = new Administrator("A01", "Place", "Holder", "Admin", "12345", "Admin", "01/01/2001", "admin@gmail.com");
        
        do{
            System.out.println("----- ADMIN SYSTEM ----- \nWelcome " + admin.getUsername() + "\n [a] Profile Management \n [b] Access Management \n [c] Log Out");
            menuChoice = scn.nextLine();
            switch(menuChoice){
                case "a" :
                    admin.profileManagement();
                    break;
                case "b" :
                    admin.accessManagement();
                    break;
                case "c" :
                    loggedIn = false;
                    break;
            }    
        }while(loggedIn); 
    }
   
}