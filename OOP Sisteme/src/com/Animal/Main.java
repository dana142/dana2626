package com.Animal;

public class Main {
    public static void main (String[] args){
        Animal dog = new Dog ("Mark", 3);
        Animal cat = new Cat ("Lia", 2);
        Animal bird = new Bird ("Rio",6);
        dog.displayInfo();
        dog.makeSound();
        ((Dog) dog).fetch();
        System.out.println();
        cat.displayInfo();
        cat.makeSound();
        ((Cat) cat).climb();
        System.out.println();
        bird.displayInfo();
        bird.makeSound();
        ((Bird) bird).fly();
        System.out.println();

    }
}
