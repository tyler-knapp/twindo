package com.twindo;

public class TwindoApplication {
    
    private final Menu menu;
    
    public TwindoApplication(Menu menu) {
        this.menu = menu;
    }
    
    public void run(){
        menu.welcomeMessage();
    }
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        TwindoApplication app = new TwindoApplication(menu);
        app.run();
    }
}
