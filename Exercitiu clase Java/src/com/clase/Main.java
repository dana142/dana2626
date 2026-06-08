package com.clase;

public class Main {
    public static void main(String[]args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("After 4% annual interest:");
        System.out.printf("Saver1 balance: %2f%n" ,
                saver1.getSavingsBalance());
        System.out.printf("Saver2 balance: %.2f%n" ,
                saver2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("/ nAfter 5% annual interest:");
        System.out.printf("Saver1 balance: % 2f%n",
                saver1.getSavingsBalance());
        System.out.printf("Saver2 balance: % 2fn" ,
                saver2.getSavingsBalance());
    }
}
