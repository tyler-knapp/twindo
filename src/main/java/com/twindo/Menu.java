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
    }
    
    public String optionPageOne(){
        System.out.println("Please select an option below");
        System.out.println();
        System.out.println("(1) Display Catering Items");
        System.out.println("(2) Order");
        System.out.println("(3) Quit");
        return input.nextLine();
    }
    
    //How to get the current balance to show up here?
    public String optionPageTwo(){
        System.out.println("(1) Add Money");
        System.out.println("(2) Select Products");
        System.out.println("(3) Complete Transaction");
        System.out.println("current balance: ");
        return input.nextLine();
    }
    
    public String askForFile(){
        System.out.println("What is the path of your inventory file?");
        return input.nextLine();
    }
    
}
