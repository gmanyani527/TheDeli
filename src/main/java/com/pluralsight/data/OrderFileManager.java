package com.pluralsight.data;


import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;
import com.pluralsight.model.Drink;
import com.pluralsight.model.Chips;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class OrderFileManager {

public static void createReceiptsFolder(){

    File receiptFolder = new File("receipts");

    if (!receiptFolder.exists()) {
        boolean created = receiptFolder.mkdir();
        if (created) {
            System.out.println(" Receipts folder created.");
        } else {
            System.out.println(" Failed to create 'receipts' folder.");
        }
    } else {
        System.out.println(" Receipts folder already exists.");
    }

}

public static void generateReceipt(Order order){
    createReceiptsFolder();
    String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
    String fileName = "receipts/" + timestamp + ".txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        writer.write("===== DELIcious Receipt =====\n\n");

        int i = 1;
        for (Sandwich sandwich : order.getSandwiches()) {
            writer.write("Sandwich " + i++ + ":\n");
            writer.write(sandwich.getDetails() + "\n"); // assumes getDetails() is implemented
        }

        for (Drink drink : order.getDrinks()) {
            writer.write("Drink: " + drink.getSize() + " - " + drink.getName() + "\n");
        }

        for (Chips chip : order.getChips()) {
            writer.write("Chip: " + chip.getFlavor() + "\n");
        }

        writer.write("\nTotal Price: $" + String.format("%.2f", order.calculateTotal()) + "\n");
        writer.write("Thank you for choosing DELIcious!\n");

        System.out.println(" Receipt saved to: " + fileName);

    } catch (IOException e) {
        System.out.println(" Error writing receipt: " + e.getMessage());
    }

}







}
