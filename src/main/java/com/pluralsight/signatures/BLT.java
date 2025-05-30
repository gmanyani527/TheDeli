package com.pluralsight.signatures;

import com.pluralsight.enums.*;
import com.pluralsight.model.Sandwich;
import com.pluralsight.toppings.*;

import java.util.ArrayList;

public class BLT extends Sandwich {
    public BLT() {
        super(
                8, // size: 8"
                "White", // bread
                new ArrayList<>() {{
                    add(new Meat(MeatType.BACON, false));
                    add(new Cheese(CheeseType.CHEDDAR, false));
                    add(new RegularTopping(RegularToppingType.LETTUCE));
                    add(new RegularTopping(RegularToppingType.TOMATOES));
                    add(new Sauce(SauceType.RANCH));
                }}
        );
        setToasted(true);
    }
}
