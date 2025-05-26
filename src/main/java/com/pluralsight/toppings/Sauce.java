package com.pluralsight.toppings;

public class Sauce extends Topping {

    public Sauce(String name){
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public double getCost(String size) {
        return 0;
    }
}
