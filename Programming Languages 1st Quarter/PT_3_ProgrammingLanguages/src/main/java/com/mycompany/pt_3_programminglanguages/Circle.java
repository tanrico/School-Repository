/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt_3_programminglanguages;

/**
 *
 * @author Student
 */
public class Circle extends DrawingObject{
    static double pi = 3.14;
    private double radius;
    
    public static void moveTo(int newx, int newy){ //Class method / does not override
        System.out.println("Circle MoveTo");
    }
    
    @Override
    public void resize(int p1, int p2){ //Instance method / override
        this.radius = p1;
        System.out.println("Circle Resize");
    }

    //Constructors
    public Circle(double radius, int locx, int locy) {
        super(locx, locy);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}
