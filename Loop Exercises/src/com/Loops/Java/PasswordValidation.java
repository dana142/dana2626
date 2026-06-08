package com.Loops.Java;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String correctPassword = "2023";
               int attempts = 0;
               while (attempts < 3) {
                   System.out.println("Enter password: ");
                   String password = sc.nextLine();
                   if (password.equals(correctPassword)) {
                       System.out.println("Authentication successful");
                       break;
                   } else {
                       attempts++;
                       System.out.println("Wrong password");

                   }
               }
               if (attempts == 3) {
                   System.out.println("Access blocked");
               }

    }
}
