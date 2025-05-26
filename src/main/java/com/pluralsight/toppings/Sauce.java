package com.pluralsight.toppings;

import com.pluralsight.enums.SauceType;
public class Sauce extends Topping {
    private SauceType type;

    public Sauce(SauceType type){
        super(type.name());
        this.type = type;

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
