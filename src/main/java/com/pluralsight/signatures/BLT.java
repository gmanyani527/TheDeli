package com.pluralsight.signatures;

import com.pluralsight.enums.CheeseType;
import com.pluralsight.enums.MeatType;
import com.pluralsight.enums.RegularToppingType;
import com.pluralsight.enums.SauceType;
import com.pluralsight.model.Sandwich;
import com.pluralsight.toppings.*;

import java.util.ArrayList;

public class BLT extends Sandwich {
    public BLT(int size) {
        super(size, "White", new ArrayList<>()); // Medium = 8 inch

        // Add toppings
        addTopping(new Meat(MeatType.BACON, false));
        addTopping(new Cheese(CheeseType.CHEDDAR, false));
        addTopping(new RegularTopping(RegularToppingType.LETTUCE));
        addTopping(new RegularTopping(RegularToppingType.TOMATOES));
        addTopping(new Sauce(SauceType.RANCH));

        // Toasted
        setToasted(true);
    }
}
