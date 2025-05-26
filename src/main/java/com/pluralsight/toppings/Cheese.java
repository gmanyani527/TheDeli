package com.pluralsight.toppings;

public class Cheese extends Topping {
    private boolean extra;

    public Cheese(String name, boolean extra){
        super(name);
        this.extra = extra;
    }

    public double getCost(String size){
        double baseCost = .50;
        return extra ? baseCost * 2 : baseCost;
    }

}
