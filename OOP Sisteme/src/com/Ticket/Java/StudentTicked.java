package com.Ticket.Java;

public class StudentTicked extends Ticket {
    int age;
    public StudentTicked (String movieName, int seatNumber, int age){
        super (movieName, seatNumber);
        this.age = age;
    }
    public double calculatePrice(){
        if (age < 18){
            return 5;
        } else {
            return 7;
        }
    }
}
