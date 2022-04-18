package com.twindo;

import java.io.IOException;

public class TwindoApplication {
    
    private final Menu menu;
    //private final Account account;
    private final CSVReader csvReader = new CSVReader();
    
    public TwindoApplication(Menu menu) {
        this.menu = menu;
    }
    
    public void run(){
        menu.welcomeMessage();
        csvReader.readFromFile(menu.askForFile());
        controlFlow(menu.optionPageOne());
    }
    
    private void controlFlow(String option){
        if(option.equalsIgnoreCase("1")){
            //display items
        }else if(option.equalsIgnoreCase("2")){
            String optionTwoInput = menu.optionPageTwo();
        }else{
            //this is how you quit out of our application
        }
    }
    
    
    
    public static void main(String[] args){
        Menu menu = new Menu();
        TwindoApplication app = new TwindoApplication(menu);
        app.run();
    }
}
