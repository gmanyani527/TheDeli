package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

public class Order {



   private List<Sandwich> sandwiches;
   private List<Chips> chips;
   private List<Drink> drink;



    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chip chip) {
        chips.add(chip);
    }

    public double calculateTotal() {
        double total = 0.0;

        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getCalculatePrice();
        }

        for (Drink drink : drinks) {
            total += drink.getCost();
        }

        for (Chip chip : chips) {
            total += chip.getCost();
        }

        return total;
    }

    public void getOrderDetails() {
        System.out.println("----- Order Summary -----");

        for (int i = 0; i < sandwiches.size(); i++) {
            System.out.println("Sandwich #" + (i + 1) + ":");
            sandwiches.get(i).getDetails();
        }

        for (Drink drink : drinks) {
            System.out.println("Drink: " + drink.getType() + " ($" + drink.getCost() + ")");
        }

        for (Chip chip : chips) {
            System.out.println("Chips: " + chip.getType() + " ($" + chip.getCost() + ")");
        }

        System.out.printf("TOTAL: $%.2f\n", calculateTotal());
    }

    // Optional: getters if you need them
    public List<Sandwich> getSandwiches() { return sandwiches; }
    public List<Drink> getDrinks() { return drinks; }
    public List<Chip> getChips() { return chips; }
}
