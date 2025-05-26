
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
        double baseCost = 1.00;

        // Optional: vary cost by meat type


        // Optional: vary by sandwich size
        if (size.equalsIgnoreCase("Medium")) baseCost += 1.00;
        if (size.equalsIgnoreCase("Large")) baseCost += 2.00;

        return extra ? baseCost * 2 : baseCost;
    }
}