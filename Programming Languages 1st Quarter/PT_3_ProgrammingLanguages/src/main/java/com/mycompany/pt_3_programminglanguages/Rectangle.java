/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt_3_programminglanguages;

/**
 *
 * @author Student
 */
public class Rectangle extends DrawingObject{
    private int width;
    private int height;

    public static void moveTo(int newx, int newy){ //Class method / does not override
        System.out.println("Rectangle MoveTo");
    }
    
    @Override
    public void resize(int p1,int p2){ //Instance method / override
        this.height = p1;
        this.width = p2;
        System.out.println("Rectangle Resize");
    }
    
    //constructor
    public Rectangle(int width, int height, int locx, int locy) {
        super(locx, locy);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}
