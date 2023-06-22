/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nsbm.findarea;

/**
 *
 * @author dilus
 */
public class Triangle implements Shape {
    private int height;
    private int base;
    
    
    public Triangle(int height , int base)
    {
        this.height= height;
        this.base = base;
    }
    
    public int getHeight()
    {
        return height;
    }
    public int getBase()
    {
        return base;
    }

    @Override
    public double calculateArea() {
       return 0.5*base*height; 
    }

    @Override
    public double calculatePerimeter() {
        return 3*base;
    }
    
}
