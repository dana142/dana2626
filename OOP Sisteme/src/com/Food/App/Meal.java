package com.Food.App;

public abstract class Meal {
    private String name;
    private double basePrice;
    public Meal (String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }
    public String getName() {
        return name;
    }
    public double getBasePrice(){
        return basePrice;
    }
    public abstract double calculatePrice();
    public abstract void prepare();
}
