package com.pluralsight.signatures;

import com.pluralsight.enums.*;
import com.pluralsight.model.Sandwich;
import com.pluralsight.toppings.*;

import java.util.ArrayList;

public class PhillyCheeseSteak extends Sandwich {
    public PhillyCheeseSteak(int size) {
        super(
                size, // size
                "White", // bread
                new ArrayList<>() {{
                    add(new Meat(MeatType.STEAK, false));
                    add(new Cheese(CheeseType.AMERICAN, false));
                    add(new RegularTopping(RegularToppingType.PEPPERS));
                    add(new Sauce(SauceType.MAYO));
                }}
        );
        setToasted(true);
    }
}
