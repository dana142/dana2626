package com.MethodsJava;
import java.util.Scanner;

public class RestaurantSystem {
    public static void displayMenu(){
        System.out.println("------MENU------");
        System.out.println("1. Burger - $5");
        System.out.println("2. Pizza - $8");
        System.out.println("3. Juice - $2");
    }
    public static double calculatePrice(int product, int quantity){
        double price = 0;
        switch (product){
            case 1:
                price = 5;
                break;
            case 2:
                price = 8;
                break;
            case 3:
                price = 2;
                break;
            default:
                System.out.println("Invalid product!");
        }
        return price * quantity;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        displayMenu();
        System.out.println("Choose product(1-3):");
        int product = input.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();
        double total = calculatePrice(product, quantity);
        System.out.println("/n------RECEIPT------");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: $" + total);
        input.close();
    }
}
