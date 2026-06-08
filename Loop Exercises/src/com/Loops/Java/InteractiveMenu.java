package com.Loops.Java;
import java.util.Scanner;

public class InteractiveMenu {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println ("/nMENU");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println ("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Choose an option");
            option = sc.nextInt();
            if (option >= 1 && option <= 4) {
                System.out.println("Enter first number: ");
                double a = sc.nextDouble();
                System.out.println ("Enter second number: ");
                double b = sc.nextDouble();
                switch (option) {
                    case 1:
                        System.out.println("Result:" +(a+b));
                        break;
                    case 2:
                        System.out.println("Result:" + (a - b));
                        break;
                    case 3:
                        System.out.println("Result:"+ (a*b));
                        break;
                    case 4:
                        if (b != 0){
                        System.out.println("Result:" + (a / b));
                    }
                        else {
                            System.out.println("Division by zero is not allowed");
                        }
                        break;
                    default:
                        System.out.println("Invalid option");


                }

            }else if (option== 5) {
                System.out.println("Program ended");
            }
            else {
                System.out.println("Invalid option");
            }

        }
        while (option !=5);
        sc.close();
    }
}
