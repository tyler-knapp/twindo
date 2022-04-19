package com.twindo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    
    Scanner input = new Scanner(System.in);
    
    public void welcomeMessage(){
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("Welcome to Twindo, the one stop shop for all of your desires");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println();
        System.out.println();
    }
    
    //How to handle unexpected input?
    public String optionPageOne(){
        System.out.println("Please select an option below");
        System.out.println();
        System.out.println("(1) Display Catering Items");
        System.out.println("(2) Order");
        System.out.println("(3) Quit");
        return getUserInput();
    }
    
    //How to get the current balance to show up here?
    public String optionPageTwo(Account account){
        System.out.println("(1) Add Money");
        System.out.println("(2) Select Products");
        System.out.println("(3) Complete Transaction");
        System.out.println("current balance " + account.getBalance());
        return getUserInput();
    }
    
    public String getUserInput(){
        return input.nextLine();
    }
    
    public int addMoneyOption(){
        System.out.println("How much money would you like to add to your account?");
        return Integer.parseInt(input.nextLine());
    }
    
    public String askForFile(){
        System.out.println("What is the path of your inventory file?");
        return getUserInput();
    }
    
}
