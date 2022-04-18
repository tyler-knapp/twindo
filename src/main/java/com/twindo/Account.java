package com.twindo;

public class Account {
    
    private double balance = 0.00;
    
    public Account(){
    }
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void addMoneyToAccount(int amountToAdd){
        
        if( this.balance + amountToAdd >= 5000){
            System.out.println("Sorry. You cannot have a balance above $5000");
        } else{
            this.balance += amountToAdd;
        }
        
    }
    
    
    
}
