package com.pluralsight.decorator;

// Decorator is an object!
public abstract class SandwichDecorator implements Sandwich {

    private Sandwich customSandwich; // private instead of protected

    // The argument can be the SimpleSandwich but also a decorator that implements the interface.
    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String ingredients() {
        return customSandwich.ingredients();
    }

    @Override
    public double price() {
        return customSandwich.price();
    }
}
