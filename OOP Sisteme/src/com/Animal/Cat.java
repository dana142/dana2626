package com.Animal;

public class Cat extends Animal implements Vaccinable {
    public Cat(String name, int age){
        super (name, age);
    }
    public void makeSound(){
        System.out.println("Meow!");
    }
    public void climb (){
        System.out.println("Cat climbs a tree.");
    }
    public void vaccinate(){
        System.out.println("Cat vaccinated.");
    }
}
