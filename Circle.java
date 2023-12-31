/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nsbm.findarea;

/**
 *
 * @author dilus
 */
public class Circle implements Shape{
    
    private int radius;
    private double area;
    
    public Circle(int radius)
    {
        this.radius = radius;
    }
    public int getRadius()
    {
        return radius;
    }

    @Override
    public double calculateArea() {
        area =(double)(3.14*radius * radius);
        return area;
       
        
    }

    @Override
    public double calculatePerimeter() {
       return (double)(2 *3.14*radius) ; 
    }
    
}
