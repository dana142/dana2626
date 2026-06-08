package com.Animal;

public class Bird extends Animal{
    public Bird (String name, int age){
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Tweet!");
    }
    public void fly(){
        System.out.println("Bird is flying.");
    }
}
