package com.Animal;

public abstract class Animal {
    private String name;
    private int age;
    public Animal (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName () {
        return name;
    }
    public int age(){
        return age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
    }
    public abstract void makeSound();
}
