/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountdetails;

/**
 *
 * @author Lab User
 */
public class CheckingAccount extends BankAccount {
    private float checking;
    
   
    public void calculateInterest()
    {
        checking = (float) (getAccBalance() * 0.02);
        System.out.println("Checking Interest is:"+checking);
       
    }
    
}
