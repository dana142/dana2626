package com.Food.App;

public class Pizza extends Meal {
    public Pizza (String name, double basePrice){
        super(name, basePrice);
    }
    public double calculatePrice(){
        return getBasePrice() + 3;
    }
    public void prepare(){
        System.out.println("Preparing pizza extra toppings");
    }
}
