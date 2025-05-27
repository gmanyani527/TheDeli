package com.pluralsight.enums;

public enum MeatType {
    STEAK("Steak"),
    HAM ("Swiss"),
    SALAMI ("Salami"),
    ROAST_BEEF ("Roast Beef"),
    CHICKEN ("Chicken"),
    BACON ("Bacon");


    private final String displayName;

    MeatType(String displayName){
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }
}
