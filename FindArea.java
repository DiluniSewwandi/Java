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
public class FindArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle a1 = new Circle() ;
            
        System.out.println("Circle Area:"+a1.calculateArea(2));
     
       
        
       Rectangle a2 = new Rectangle();
        System.out.println("Rectangle Area:"+a2.calculateArea(5,6));
    
}
}
