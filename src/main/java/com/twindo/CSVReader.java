package com.twindo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CSVReader implements ICSVReader{
    
    @Override
    public void readFromFile(String file) {
    
        try {
            FileReader in = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(in);
            
            String s;
            while((s=bufferedReader.readLine()) != null){
                System.out.println(s);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
