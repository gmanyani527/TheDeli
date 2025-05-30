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

        // Set base cheese cost by size
        if (size.equalsIgnoreCase("Small")) {
            baseCost = 0.75;
            if (extra) baseCost += 0.30;
        } else if (size.equalsIgnoreCase("Medium")) {
            baseCost = 1.50;
            if (extra) baseCost += 0.60;
        } else if (size.equalsIgnoreCase("Large")) {
            baseCost = 2.25;
            if (extra) baseCost += 0.90;
        }

        return baseCost;

    }

}
