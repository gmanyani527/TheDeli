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





}
