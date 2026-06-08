package com.Employee.java;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int workedHours;
    private String department;
    public PartTimeEmployee(String name, double baseSalary, double hourlyRate, int workedHours, String department){
        super(name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
        this.department = department;
    }
    public double calculateSalary() {
        return hourlyRate * workedHours;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Ore lucrate: " + workedHours);
        System.out.println("Departament: " + department);
        System.out.println("Salariu calculat: " + calculateSalary());
    }
}
