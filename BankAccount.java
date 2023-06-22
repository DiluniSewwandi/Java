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
public abstract class BankAccount {
    private int accNo;
    private float accBalance;
    
    public void setAccNo(int accNo)
    {
        this.accNo = accNo;
    }
    public void setAccBalance(float accBalance)
    {
        this.accBalance = accBalance;
    }
    public int getAccNo()
    {
        return accNo;
    }
    public float getAccBalance()
    {
        return accBalance;
    }
    
    public abstract void calculateInterest();
    
}
