package com.pluralsight.toppings;

public class Cheese extends Topping {
    private boolean extra;

    public Cheese(String name, boolean extra){
        super(name);
        this.extra = extra;
    }

    public double getCost(String size){
        double baseCost;
        switch (size.toLowerCase()) {
            case "small":
                baseCost = 0.50;
                break;
            case "medium":
                baseCost = 0.75;
                break;
            case "large":
                baseCost = 1.00;
                break;
            default:
                baseCost = 0.50; // fallback
        }
        return extra ? baseCost * 2 : baseCost;
    }

}
