package com.twindo;

import com.twindo.model.Item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CSVReader implements ICSVReader{
    
    @Override
    public void readFromFile(String file) {
    
        try {
            FileReader in = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(in);
            
            String s;
            while((s = bufferedReader.readLine()) != null){
                splitInventory(s);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void display(){
    }
    
    private void splitInventory(String s){
        String[] inventory = s.split("\\|");
        System.out.println(inventory[0] + " " + inventory[1] + " " + inventory[2] + " " + inventory[3]);
    }
    
    
}
