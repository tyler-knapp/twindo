package com.twindo;

public class Account {
    
    private static final double MAXIMUM_AMOUNT = 5000;
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
        if( this.balance + amountToAdd >= MAXIMUM_AMOUNT){
            System.out.println("Sorry. You cannot have a balance above $5000");
        } else if(amountToAdd < 0) {
            System.out.println("Sorry. You cannot insert a negative amount");
        } else {
            this.balance += amountToAdd;
        }
    }
    
    public void withdrawMoneyFromAccount(int amountToWithdraw){
        this.balance -= amountToWithdraw;
    }
    
}
