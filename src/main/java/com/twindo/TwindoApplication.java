package com.twindo;

public class TwindoApplication {
    
    private static final String MENU_OPTION_ONE = "1";
    private static final String MENU_OPTION_TWO = "2";
    private static final String MENU_OPTION_THREE = "3";
    
    private final Menu menu;
    private final Account account = new Account();
    private final CSVReader csvReader = new CSVReader();
    
    public TwindoApplication(Menu menu) {
        this.menu = menu;
    }
    
    public void run(){
        menu.welcomeMessage();
        String csvFile = menu.askForFile();
        //find a better while loop condition
        while(true){
            controlFlow(menu.optionPageOne());
        }
    }
    
    private void controlFlow(String option){
        while (!option.equalsIgnoreCase(MENU_OPTION_THREE)) {
            if(option.equalsIgnoreCase(MENU_OPTION_ONE)){
                csvReader.readFromFile(menu.askForFile());
                break;
            }else if(option.equalsIgnoreCase(MENU_OPTION_TWO)){
                menuTwoControlFlow(menu.optionPageTwo(account));
            }else{
                break;
            }
        }
    }
    
    private void menuTwoControlFlow(String option){
        while(!option.equalsIgnoreCase(MENU_OPTION_THREE)){
            if(option.equalsIgnoreCase(MENU_OPTION_ONE)){
                account.addMoneyToAccount(menu.addMoneyOption());
                break;
            }else if(option.equalsIgnoreCase(MENU_OPTION_TWO)){
                //Select Products
            }else{
                break;
            }
        }
    }
    
    public static void main(String[] args){
        Menu menu = new Menu();
        TwindoApplication app = new TwindoApplication(menu);
        app.run();
    }
}
