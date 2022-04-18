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
    
    public void addMoneyToAccount(double amountToAdd){
        this.balance += amountToAdd;
    }
    
    
    
}
