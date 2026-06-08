package com.Employee.java;

public class Main {
    public static void main (String[] args){
        FullTimeEmployee emp1 = new FullTimeEmployee("Dana", 15000, 10, 25);
        PartTimeEmployee emp2 = new PartTimeEmployee("Ion", 0, 100,40, "IT");

        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();
    }
}
