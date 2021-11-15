package com.pluralsight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {
    public static void main(String args[]) throws Exception {

        // The URL-class makes the interface easier:
        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

        // This is the usage of a decorator:
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
