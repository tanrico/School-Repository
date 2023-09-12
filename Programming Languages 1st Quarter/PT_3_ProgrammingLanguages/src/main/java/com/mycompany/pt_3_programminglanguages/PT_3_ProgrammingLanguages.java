/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pt_3_programminglanguages;

/**
 *
 * @author Student
 */
public class PT_3_ProgrammingLanguages {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12, 12, 10, 10);
        Circle c1 = new Circle(3, 5, 5);
        DrawingObject d1 = new DrawingObject(0, 0);
        
        //example of Hiding method
        r1.moveTo(10, 10); //Class method contained within Rectangle class
        d1.moveTo(0, 0); //Class method contained within DrawingObject class
        
        //example of overriding method
        d1.resize(0, 0); //Instance method within the DrawingObject class
        c1.resize(1, 0); //Instance method that overrides the one in DrawingObject class 
            
    }
}
