package com.twindo;

import java.io.IOException;

public class TwindoApplication {
    
    private static final String MENU_OPTION_ONE = "1";
    private static final String MENU_OPTION_TWO = "2";
    private static final String MENU_OPTION_THREE = "3";
    
    private final Menu menu;
    private final CSVReader csvReader = new CSVReader();
    
    public TwindoApplication(Menu menu) {
        this.menu = menu;
    }
    
    public void run(){
        menu.welcomeMessage();
        controlFlow(menu.optionPageOne());
    }
    
    private void controlFlow(String option){
        if(option.equalsIgnoreCase(MENU_OPTION_ONE)){
            csvReader.readFromFile(menu.askForFile());
        }else if(option.equalsIgnoreCase(MENU_OPTION_TWO)){
            menuTwoControlFlow(menu.optionPageTwo());
        }else{
            //this is where you quit out of our application
        }
    }
    
    private void menuTwoControlFlow(String option){
        if(option.equalsIgnoreCase(MENU_OPTION_ONE)){
            Account account = new Account();
            account.addMoneyToAccount(menu.addMoneyOption());
        }else if(option.equalsIgnoreCase(MENU_OPTION_TWO)){
            //Select Products
        }else{
            //Confirm Selection
        }
    }
    
    public static void main(String[] args){
        Menu menu = new Menu();
        TwindoApplication app = new TwindoApplication(menu);
        app.run();
    }
}
