package com.pluralsight.ui;

import com.pluralsight.model.Sandwich;

import java.util.Scanner;

public class ConsuleUI {
    Scanner scanner;

    public void display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPress ENTER to continue...");
        scanner.nextLine();

        boolean running = true;

        while(running){
            displayHomeScreen();

            System.out.println("Enter your choice: ");
            String input = scanner.nextLine();

            switch(input){

                case "1":
                    displayOrderScreen();
                    break;
                case "2":
                    running = false;
                    break;



            }



        }

    }


    public void displayHomeScreen(){
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


    public void displayOrderScreen(){

        Order currentOrder = new Order();
        boolean orderng = true;

        while(ordering) {
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

    public void




}
