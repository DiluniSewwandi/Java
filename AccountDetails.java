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
public class AccountDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SavingsAccount s1 = new SavingsAccount();
        s1.setAccBalance(1000000);
        s1.calculateInterest();
        
        CheckingAccount s2 = new CheckingAccount();
        s2.setAccBalance(20000000);
        s2.calculateInterest();
    }
    
}
