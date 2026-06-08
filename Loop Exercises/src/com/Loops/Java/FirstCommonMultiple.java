package com.Loops.Java;

public class FirstCommonMultiple {
    public static void main(String[]args ) {
        int number = 101;
        while (true) {
            if(number % 7== 0 && number % 9 ==0) {
                System.out.println("First number divisible by 7 and 9: " + number);
                break;
            }
            number++;
        }
    }
}
