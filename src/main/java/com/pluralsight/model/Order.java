package com.pluralsight.model;

import com.pluralsight.data.OrderFileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {



    private List<Sandwich> sandwiches;
    private List<Chips> chips;
    private List<Drink> drinks;
    private Scanner scanner = new Scanner(System.in);


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

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public double calculateTotal() {
        double total = 0.0;

        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getCalculatePrice();
        }

        for (Drink drink : drinks) {
            total += drink.getCost(drink.getName());
        }

        for (Chips chip : chips) {
            total += chip.getPrice();
        }

        return total;
    }

    public void getOrderDetails() {
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│         Order Summary        │");
        System.out.println("└──────────────────────────────┘");

        for (int i = 0; i < sandwiches.size(); i++) {
            System.out.println("Sandwich #" + (i + 1) + ":");
            sandwiches.get(i).getDetails();
        }

        for (Drink drink : drinks) {
            System.out.println("Drink: " + drink.getName() + " ($" + drink.getCost(drink.getSize()) + ")");
        }

        for (Chips chip : chips) {
            System.out.println("Chips: " + chip.getFlavor() + " ($" + chip.getPrice() + ")");
        }

        System.out.printf("TOTAL: $%.2f\n", calculateTotal());
        System.out.print("Confirm order? (yes/no): ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes")) {
           OrderFileManager.generateReceipt(this); // ✅ Save to file
            System.out.println("Order completed. Returning to Home.");
        } else {
            System.out.println("Order canceled.");
        }
    }

    // Optional: getters if you need them
    public List<Sandwich> getSandwiches() { return sandwiches; }
    public List<Drink> getDrinks() { return drinks; }
    public List<Chips> getChips() { return chips; }
}