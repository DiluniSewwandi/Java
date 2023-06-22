/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findarea;

/**
 *
 * @author Lab User
 */
 public class Rectangle extends Shape {
    private int width,height;
   
    
    /*public void setValues(int width,int height)
    {
        this.width = width;
        this.height =height;
    }*/
    public float calculateArea(int width,int height)
    {
       
     return (float)width * height;
    }

    @Override
    public float calculateArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
