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
public class SavingsAccount extends BankAccount{
    public float saving;
    
     public void calculateInterest()
    {
        saving = (float) (getAccBalance()* 0.12);
        System.out.println("Saving Interest is:"+saving);
    }
    
}
