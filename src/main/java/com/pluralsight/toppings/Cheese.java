package com.pluralsight.toppings;

import com.pluralsight.enums.CheeseType;

public class Cheese extends Topping {
    private boolean extra;
    private CheeseType type;

    public Cheese(CheeseType type, boolean extra){
        super(type.name());
        this.type = type;
        this.extra = extra;
    }

    public double getCost(String size){
        double baseCost = 0;

        // Optionally vary by size
        if (size.equalsIgnoreCase("Medium")) {
            baseCost += 0.25;
        }
        if (size.equalsIgnoreCase("Large")) {
            baseCost += 0.50;
        }
        return extra ? baseCost * 2 : baseCost;

    }

}
