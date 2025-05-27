package com.pluralsight.model;

import com.pluralsight.toppings.Topping;

import java.util.ArrayList;

public class Sandwich {

    private int size;
    private String bread;
    private ArrayList<Topping> toppings;
    private boolean extraCheese;
    private boolean extraMeat;


    public Sandwich(int size, String bread, ArrayList<Topping> toppings) {
        this.size = size;
        this.bread = bread;
        this.toppings = toppings;
    }

    //****************************//
    // Needs to be fixed //
    public double getCalculatPrice(){
        return 0.0;
    }

    public ArrayList<Topping> getToppings(){
        return toppings;
    }

      // Will Return String for the Get Details
    public void getDetails(){
        System.out.println("Bread: " + bread);
        System.out.println("Size: " + getSizeAsString());
        System.out.println("Toppings:");
        for (Topping t : toppings) {
            System.out.println(" - " + t.getName());
        }
        System.out.println("Extra Cheese: " + (extraCheese ? "Yes" : "No"));
        System.out.println("Extra Meat: " + (extraMeat ? "Yes" : "No"));
        System.out.println("Total Price: $" + getCalculatePrice());
    }

    public double getCalculatePrice(){
        double total = 0.0;

        for (Topping topping : toppings) {
            total += topping.getCost(getSizeAsString());
        }
        return total;
    }
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }


    private String getSizeAsString() {
        switch (size) {
            case 1:
                return "Small";
            case 2:
                return "Medium";
            case 3:
                return "Large";
            default:
                return "Unknown";
        }
    }

    public void setSize(int size) {
        this.size = size;
    }
}
