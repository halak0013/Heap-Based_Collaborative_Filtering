package com.mycompany.heap.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csvRead {
    public static void readFile(String path) {

        String line = "";
        String csvDelimiter = ",";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvDelimiter);
                for (int i = 1; i < data.length; i++) {
                    
                }
                //System.out.println(data[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readFile("./data/target_user.csv");
    }
}
