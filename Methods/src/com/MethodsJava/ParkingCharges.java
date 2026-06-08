package com.MethodsJava;

import java.util.Scanner;

public class ParkingCharges {
    public static double calculateCharges(double hours) {
        if (hours > 24){
            return -1;
        }
        double charge = 2.0;
        if (hours > 3){
            charge =charge + (hours - 3) * 0.5;
        }
        if (charge > 10){
            charge = 10;
        }
        return charge;
    }
    public static void main(String []args ){
        Scanner input = new Scanner (System.in);
        ParkingCharges parking = new ParkingCharges();
        double totalReceipts = 0;
        System.out.println("How many customers? ");
        int customers= input.nextInt();
        for (int i = 1; i <= customers; i++){
            System.out.println("Enter hours parked for customer " + i + ":");
            double hours = input.nextDouble();
            double fee = calculateCharges(hours);
            if (fee == -1) {
                System.out.println("Parking time cannot exceed 24 hours. ");
            } else {
                System.out.println("Customer" + i + " charge: $" + fee);
                totalReceipts += fee;
            }
        }
        System.out.println("Total receipts: $" + totalReceipts);
        input.close();

    }
}
