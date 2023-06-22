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
public class Circle extends Shape{
    private int r;
   
   
   /* public void setValues(int r)
    {
        this.r = r;
    }*/
   

    public float calculateArea(int r) 
    {
       
        return (float)3.14*r*r;
        
    }

    @Override
    public float calculateArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
