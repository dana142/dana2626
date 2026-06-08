package com.Animal;

public class Dog extends Animal implements Vaccinable, Trainable {
    public Dog(String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Woof!");
    }
    public void fetch(){
        System.out.println("Dog fetches the ball");
    }
    public void vaccinate(){
        System.out.println("Dog vaccinated");
    }
    public void train(){
        System.out.println("Dog Training.");
    }
}
