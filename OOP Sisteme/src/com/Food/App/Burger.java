package com.Food.App;

public class Burger extends Meal {
    public Burger(String name, double basePrice){
        super (name, basePrice);
    }
    public double calculatePrice(){
        return getBasePrice() + 2;
    }
    public void prepare(){
        System.out.println("Preparing upgraded burger.");
    }
}
