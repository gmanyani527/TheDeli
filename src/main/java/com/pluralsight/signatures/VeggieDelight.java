package com.pluralsight.signatures;

import com.pluralsight.enums.*;
import com.pluralsight.model.Sandwich;
import com.pluralsight.toppings.*;

import java.util.ArrayList;

public class VeggieDelight extends Sandwich {
    public VeggieDelight(int size) {
        super(
                size, // 8-inch sandwich
                "Wheat", // bread
                new ArrayList<>() {{
                    add(new RegularTopping(RegularToppingType.LETTUCE));
                    add(new RegularTopping(RegularToppingType.TOMATOES));
                    add(new RegularTopping(RegularToppingType.CUCUMBERS));
                    add(new RegularTopping(RegularToppingType.PEPPERS));
                    add(new RegularTopping(RegularToppingType.PICKLES));
                    add(new Sauce(SauceType.RANCH));
                }}
        );
        setToasted(false);
    }
}
