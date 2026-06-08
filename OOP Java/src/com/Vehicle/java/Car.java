package com.Vehicle.java;

public class Car extends Vehicle {
    public Car (String registerNumber,double averageFuelConsumption){
        super (registerNumber, averageFuelConsumption);
    }
    public double calculateFuel (double kilometers){
        return kilometers * getAverageFuelConsumption() / 100;
    }

}

