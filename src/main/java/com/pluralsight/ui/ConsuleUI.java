package com.pluralsight.ui;

import com.pluralsight.enums.CheeseType;
import com.pluralsight.enums.MeatType;
import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.Topping;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsuleUI {
    Scanner scanner;

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPress ENTER to continue...");
        scanner.nextLine();

        boolean running = true;

        while (running) {
            displayHomeScreen();

            System.out.println("Enter your choice: ");
            String input = scanner.nextLine();

            switch (input) {

                case "1":
                    displayOrderScreen();
                    break;
                case "2":
                    running = false;
                    break;


            }


        }

    }


    public void displayHomeScreen() {
        System.out.println("==== Home ====");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        System.out.print("Choose an option: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                displayOrderScreen();
                break;
            case 0:
                running = false;
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid option.");
        }

    }


    public void displayOrderScreen() {

        Order currentOrder = new Order();
        boolean ordering = true;

        while (ordering) {
            System.out.println("\n ******* Order Screen *******");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Sandwich sandwich = buildSandwich();
            }
        }
    }

    public Sandwich buildSandwich() {
        System.out.println(" Choose Bread: ");
        String bread = scanner.nextLine();


        System.out.println("Choose size (1=Small, 2=Medium, 3=Large): ");
        int size = Integer.parseInt(scanner.nextLine());

        ArrayList<Topping> toppings = new ArrayList<>();
// Meat
        System.out.println("Choose a meat:");
        MeatType[] meats = MeatType.values();
        for (int i = 0; i < meats.length; i++) {
            System.out.println((i + 1) + ") " + meats[i].getDisplayName());
        }
        int choice = Integer.parseInt(scanner.nextLine());
        MeatType selectedMeat = meats[choice - 1];

        boolean extraMeat = askExtra();
        toppings.add(new Meat(selectedMeat, extraMeat));
// Cheese

        System.out.println("Choose a cheese:");
        CheeseType[] cheeses = CheeseType.values();

    }


    private boolean askExtra() {

        System.out.print("Do you want extra? (yes/no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }


}

