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
        String optionOneInput = menu.optionPageTwo();
        if(optionOneInput.equalsIgnoreCase("1")){
            
        
        }
    }
    
    public static void main(String[] args){
        Menu menu = new Menu();
        TwindoApplication app = new TwindoApplication(menu);
        app.run();
    }
}
