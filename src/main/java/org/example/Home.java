package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Home {
    public void showHome(){
        String show1="showHome.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(show1))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}