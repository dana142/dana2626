package com.Employee.java;

public class Employee {
    protected String name;
    protected double baseSalary;
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary= baseSalary;
    }
    public void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println ("Salary:" + baseSalary);
    }
}
