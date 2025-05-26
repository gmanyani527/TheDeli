package com.pluralsight.toppings;


import com.pluralsight.enums.RegularToppingType;

public class RegularTopping extends Topping{
    private RegularToppingType type;

    public RegularTopping(RegularToppingType type){
        super(type.name());
        this.type = type;

    }

    public RegularToppingType getType() {
        return type;
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
