package com.Loops.Java;

public class CelsiusToFahrenheit {
    public static void main (String[] args){
        System.out.println("Celsius/tFahrenheit");
        for (int c = 0; c<= 100; c = c+ 10){
            int f = (c * 9/ 5) +32;
            System.out.println(c + "/t/t" + f);
        }
    }
}
