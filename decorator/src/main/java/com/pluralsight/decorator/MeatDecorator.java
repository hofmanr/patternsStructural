package com.pluralsight.decorator;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String ingredients() {
        return super.ingredients() + addMeat();
//        return customSandwich.make() + addMeat();
    }

    @Override
    public double price() {
        return super.price() + 2;
    }

    private String addMeat() {
        return " + turkey";
    }
}
