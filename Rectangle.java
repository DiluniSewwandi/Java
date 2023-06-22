/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nsbm.findarea;

/**
 *
 * @author dilus
 */
public class Rectangle implements Shape {
    
    private int height;
    private int width;
    
    public Rectangle(int height , int width)
    {
        this.height = height;
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }
    public int getWidth()
    {
        return width;
    }
    @Override
    public double calculateArea() {
         return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return (2*height + 2*width);
    }
    
}
