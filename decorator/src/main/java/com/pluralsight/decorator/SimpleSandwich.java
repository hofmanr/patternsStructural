package com.pluralsight.decorator;

public class SimpleSandwich implements Sandwich {
    @Override
    public String ingredients() {
        return "Bread";
    }

    @Override
    public double price() {
        return 3;
    }
}
