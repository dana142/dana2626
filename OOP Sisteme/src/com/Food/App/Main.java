package com.Food.App;

public class Main {
    public static void main(String[] args){
        Meal pizza = new Pizza ("Pepperoni", 8);
        Meal burger = new Burger ("Cheese Burger", 7);
        Meal salad = new Salad ("Greek Salad", 5);
        pizza.prepare();
        System.out.println(pizza.calculatePrice());
        burger.prepare();
        System.out.println(burger.calculatePrice());
        salad.prepare();
        System.out.println(salad.calculatePrice());
    }
}
