package com.pluralsight.model;

public class Chips {
    String flavor;
    Double price;


    public Chips(String flavor){
        this.flavor = flavor;
        price = 1.50;
    }

    public String getFlavor() {
        return flavor;
    }

    public Double getPrice() {
        return price;
    }

}