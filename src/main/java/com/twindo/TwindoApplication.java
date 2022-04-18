package com.twindo;

import java.io.IOException;

public class TwindoApplication {
    
    private final Menu menu;
    private final CSVReader csvReader = new CSVReader();
    
    public TwindoApplication(Menu menu) {
        this.menu = menu;
    }
    
    public void run(){
        menu.welcomeMessage();
        csvReader.readFromFile(menu.askForFile());
    }
    
    public static void main(String[] args){
        Menu menu = new Menu();
        TwindoApplication app = new TwindoApplication(menu);
        app.run();
    }
}
