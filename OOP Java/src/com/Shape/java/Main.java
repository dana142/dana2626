package com.Shape.java;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle (5);
        Rectangle rectangle = new Rectangle (4, 6);
        Triangle triangle = new Triangle (8, 3);
        System.out.println("Aria cercului: " + circle.calculateArea());
        System.out.println("Aria dreptunghiului:" + rectangle.calculateArea());
        System.out.println("Aria triunghiului:" + triangle.calculateArea());
    }
}
