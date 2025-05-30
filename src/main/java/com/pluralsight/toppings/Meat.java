
package com.pluralsight.toppings;

import com.pluralsight.enums.MeatType;

public class Meat extends Topping {
    private MeatType type;
    private boolean extra;

    public Meat(MeatType type, boolean extra) {
        super(type.name());  // Passes the enum name (e.g., "TURKEY") to the Topping constructor
        this.type = type;
        this.extra = extra;
    }

    public MeatType getType() {
        return type;
    }

    public boolean isExtra() {
        return extra;
    }

    @Override
    public double getCost(String size) {
        double baseCost = 0;

        // Set base cheese cost by size
        if (size.equalsIgnoreCase("Small")) {
            baseCost = 1.00;
            if (extra) baseCost += 0.50;
        } else if (size.equalsIgnoreCase("Medium")) {
            baseCost = 2.00;
            if (extra) baseCost += 1.00;
        } else if (size.equalsIgnoreCase("Large")) {
            baseCost = 3.00;
            if (extra) baseCost += 1.50;
        }

        return baseCost;
    }
}