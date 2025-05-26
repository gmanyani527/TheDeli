package com.pluralsight.toppings;

public abstract class Topping {
    private String name;

    public Topping(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract double getCost(String size);



}
