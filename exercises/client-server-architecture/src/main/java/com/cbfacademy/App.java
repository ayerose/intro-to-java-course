package com.cbfacademy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        String urlString = "https://codingblackfemales.com/";

        try {

            URL url = new URL(urlString);

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;


                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (Exception e) {
                System.out.println("Error reading from the website: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}