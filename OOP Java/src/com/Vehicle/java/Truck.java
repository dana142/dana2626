package com.Vehicle.java;

public class Truck extends Vehicle  {
    public Truck (String registrationNumber, double averageFuelConsumption){
        super(registrationNumber, averageFuelConsumption);
    }
    public double calculateFuel(double kilometers, double cargoWeight){
        return kilometers * (getAverageFuelConsumption() + cargoWeight * 0.1) / 100;
    }
}
