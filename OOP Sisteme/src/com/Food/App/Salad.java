package com.Food.App;

public class Salad extends Meal {
    public Salad (String name, double basePrice){
        super(name, basePrice);
    }
    public double calculatePrice(){
        return getBasePrice() + 1;
    }
    public void prepare(){
        System.out.println("Preparing customized salad.");
    }
}
