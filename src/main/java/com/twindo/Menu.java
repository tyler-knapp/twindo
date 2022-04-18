package com.twindo;

import java.util.Scanner;

public class Menu {
    
    Scanner input = new Scanner(System.in);
    
    public void welcomeMessage(){
        System.out.println("Welcome to Twindo, the one stop shop for all of your desires");
    }
    
    public void optionPageOne(){
        System.out.println("Please select an option below");
        System.out.println();
        System.out.println("(1) Display Catering Items");
        System.out.println("(2) Order");
        System.out.println("(3) Quit");
    }
    
    public String askForFile(){
        System.out.println("What is the path of your inventory file?");
        return input.nextLine();
    }
    
}
