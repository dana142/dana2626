package com.Employee.java;

public class FullTimeEmployee extends Employee{
    private double bonusPercent;
    private int vacationDays;
    public FullTimeEmployee(String name, double baseSalary, double bonusPercent, int vacationDays){
        super(name,baseSalary);
        this.bonusPercent = bonusPercent;
        this.vacationDays = vacationDays;
    }
    public double calculateBonus(){
        return baseSalary * bonusPercent / 100;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: "+ calculateBonus());
        System.out.println("Zile concediu:" + vacationDays);
    }
}
