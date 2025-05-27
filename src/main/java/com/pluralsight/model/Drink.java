package com.pluralsight.model;

public class Drink {

    private String name;
    private String size;


    public Drink(String name, String size){
        this.name = name;
        this.size = size;
    }

    public double getCost(String size){

        if(size.equalsIgnoreCase("Medium")){
            return 2.50;
        } else if (size.equalsIgnoreCase("Large")) {
            return 3.00;
        } else{
            return 2.00;
        }
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }


}
