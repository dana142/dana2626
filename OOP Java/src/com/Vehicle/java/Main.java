package com.Vehicle.java;

public class Main {
    public static void main (String[] args){
        Car car = new Car ("MD345ABC", 7);
        Truck truck = new Truck ("MD567GNB", 15);
        System.out.println("Consum masina:" + car.calculateFuel(200)+ "litre");
        System.out.println("Consum camion" + truck.calculateFuel(200,5) + "litre");
    }
}
