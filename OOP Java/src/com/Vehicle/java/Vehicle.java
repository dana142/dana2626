package com.Vehicle.java;

public class Vehicle {
    private String registrationNumber;
    private double averageFuelConsumption;
    public Vehicle(String registrationNumber, double averageFuelConsumption){
        this.registrationNumber = registrationNumber;
        this.averageFuelConsumption = averageFuelConsumption;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public double getAverageFuelConsumption(){
        return averageFuelConsumption;
    }
}
