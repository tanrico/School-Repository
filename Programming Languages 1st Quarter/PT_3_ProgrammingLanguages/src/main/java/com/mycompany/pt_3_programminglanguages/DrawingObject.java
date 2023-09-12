/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt_3_programminglanguages;

/**
 *
 * @author Student
 */
public class DrawingObject {
    private static int locx;
    private static int locy;

    public void resize(int p1, int p2){ //Instance method
        System.out.println("Drawing Resize");
    }
    
    public static void moveTo(int newx, int newy){ //Class method
        locx = newx;
        locy = newy;
        System.out.println("Drawing MoveTo");
    }

    //constructors, getters, and setters
    public DrawingObject(int locx, int locy) {
        this.locx = locx;
        this.locy = locy;
    }

    public int getLocx() {
        return locx;
    }

    public void setLocx(int locx) {
        this.locx = locx;
    }

    public int getLocy() {
        return locy;
    }

    public void setLocy(int locy) {
        this.locy = locy;
    }
    
    
}
