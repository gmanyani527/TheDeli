package com.pluralsight.ui;

import com.pluralsight.enums.CheeseType;
import com.pluralsight.enums.MeatType;
import com.pluralsight.enums.RegularToppingType;
import com.pluralsight.enums.SauceType;
import com.pluralsight.model.Chips;
import com.pluralsight.model.Drink;
import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;
import com.pluralsight.toppings.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsuleUI {
    Scanner scanner = new Scanner(System.in);
    private List<Sandwich> sandwich;
    private List<Chips> chips;
    private List<Drink> drinks;


    Order currentOrder = new Order(sandwich, chips, drinks);
    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPress ENTER to continue...");
        scanner.nextLine();

        boolean running = true;

        while (running) {
            displayHomeScreen();

            System.out.println("Enter your choice: ");
            String input = scanner.nextLine();


        }


    }


    public void displayHomeScreen() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
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
                System.out.println("Goodbye!");
                running = false;
                break;
            default:
                System.out.println("Invalid option.");
        }

    }


    public void displayOrderScreen() {


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
                    break;
                case 2:
                    Drink drink = chooseDrink();
                    break;
                case 3:
                    Chips chip = chooseChips();
                    break;
                case 4:
                    displayCheckout();
                    break;

            }
        }
    }

    public Sandwich buildSandwich() {
        List<Sandwich> sandwiches = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // Choose Bread
        System.out.println("Choose Bread: ");
        System.out.println("┌────────────────────────┐");
        System.out.println("│ 1) White Bread         │");
        System.out.println("│ 2) Wheat Bread         │");
        System.out.println("│ 3) Rye Bread           │");
        System.out.println("│ 4) Wrap                │");
        System.out.println("└────────────────────────┘");
        System.out.print("Enter your choice (1-4): ");

        int breadChoice = Integer.parseInt(scanner.nextLine());
        String bread = "";

        switch (breadChoice) {
            case 1:
                bread = "White";
                break;
            case 2:
                bread = "Wheat";
                break;
            case 3:
                bread = "Rye";
                break;
            case 4:
                bread = "Wrap";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to White Bread.");
                bread = "White";
        }

// Choose Size
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
        for (int i = 0; i < cheeses.length; i++) {
            System.out.println((i + 1) + ")" + cheeses[i].getDisplayName());
        }
        int choice1 = Integer.parseInt(scanner.nextLine());
        CheeseType selectedCheese = cheeses[choice - 1];
        boolean extraCheese = askExtra();
        toppings.add(new Cheese(selectedCheese, extraCheese));

//  Regular Topping
        boolean stillAdding = true;
        System.out.println("Choose the regular toppings:");
        while (stillAdding) {
            RegularToppingType[] regularToppings = RegularToppingType.values();
            for (int i = 0; i < regularToppings.length; i++) {
                System.out.println((i + 1) + ")" + regularToppings[i].getDisplayName());
            }
            int choice2 = Integer.parseInt(scanner.nextLine());
            RegularToppingType selectedTopping = regularToppings[choice - 1];
            toppings.add(new RegularTopping(selectedTopping));

            System.out.println("Any other topping? ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("no")) {
                stillAdding = false;
            }
        }
// Sauces
        System.out.println("Choose a Sauce");
        SauceType[] sauces = SauceType.values();
        for (int i = 0; i < sauces.length; i++) {
            System.out.println((i + 1) + ")" + sauces[i].getDisplayName());
        }
        int choice3 = Integer.parseInt(scanner.nextLine());
        SauceType selctedSauce = sauces[choice - 1];
        toppings.add(new Sauce(selctedSauce));


        Sandwich sandwich = new Sandwich(size, bread, toppings);
        currentOrder.addSandwich(sandwich);
        return sandwich;
    }


    private boolean askExtra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want extra? (yes/no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }


    public Drink chooseDrink(){
        Scanner scanner = new Scanner(System.in);
        // Choose Bread
        System.out.println("Choose Drink: ");
        System.out.println("┌────────────────────────┐");
        System.out.println("│ 1) Coco-cola           │");
        System.out.println("│ 2) Pepsi               │");
        System.out.println("│ 3) Fanta               │");
        System.out.println("│ 4) Root Beer           │");
        System.out.println("└────────────────────────┘");
        System.out.print("Enter your choice (1-4): ");

        int drinkChoice = Integer.parseInt(scanner.nextLine());
        String drinks = "";

        System.out.println("Choose size (1=Small, 2=Medium, 3=Large): ");
        String size = scanner.nextLine();

        switch (drinkChoice) {
            case 1:
                drinks = "Coco-cola";
                break;
            case 2:
                drinks = "Pepsi";
                break;
            case 3:
                drinks = "Fanta";
                break;
            case 4:
                drinks = "Root Beer";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to water.");
                drinks = "Water";
        }

        Drink drink = new Drink(drinks, size);
        currentOrder.addDrink(drink);
    return drink;
    }

    public Chips chooseChips(){
        Scanner scanner = new Scanner(System.in);
        // Choose Bread
        System.out.println("Choose Drink: ");
        System.out.println("┌────────────────────────┐");
        System.out.println("│ 1) Potato Chips        │");
        System.out.println("│ 2) Sun Chips           │");
        System.out.println("│ 3) Doritos             │");
        System.out.println("│ 4) Cheetos             │");
        System.out.println("└────────────────────────┘");
        System.out.print("Enter your choice (1-4): ");

        int chipChoice = Integer.parseInt(scanner.nextLine());
        String chips = "";

        switch (chipChoice) {
            case 1:
                chips = "Potato Chips";
                break;
            case 2:
                chips = "Sun Chips";
                break;
            case 3:
                chips = "Doritos";
                break;
            case 4:
                chips = "Cheetos";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Nacho Chips.");
                chips = "Nacho Chips";
        }

        Chips chip = new Chips(chips);
        currentOrder.addChips(chip);
        return chip;

    }

    public void displayCheckout(){
        currentOrder.getOrderDetails();

    }

}




