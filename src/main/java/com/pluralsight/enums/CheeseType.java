package com.pluralsight.enums;

public enum CheeseType{
    CHEDDAR ("Cheddar"),
    SWISS ("Swiss"),
    MOZZARELLA ("Mozzarella"),
    PROVOLONE ("Provolone"),
    AMERICAN ("American");

    private final String displayName;

   CheeseType(String displayName){
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }




}
