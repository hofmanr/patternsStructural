package com.pluralsight.decorator;

// Inheritence
public class DressingDecorator extends SandwichDecorator {

    // Composition (adding an instance)
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String ingredients() {
        return super.ingredients() + addDressing();
//        return customSandwich.make() + addDressing();
    }

    @Override
    public double price() {
        return super.price() + 1;
    }

    private String addDressing() {
        return " + mustard";
    }

}
