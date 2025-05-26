package com.pluralsight.toppings;

public class RegularTopping extends Topping{

    public RegularTopping(String name){
        super(name);
    }

    @Override
    public double getCost(String size) {
        return 0;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
