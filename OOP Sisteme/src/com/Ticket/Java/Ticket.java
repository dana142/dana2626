package com.Ticket.Java;

public class Ticket {
    private String movieName;
    private int seatNumber;
    public Ticket (String movieName, int seatNumber){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
    }
    public String getMovieName(){
        return movieName;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public double calculatePrice(){
        return 10;
    }
    public void displayInfo(){
        System.out.println("Movie:" + movieName);
        System.out.println("Seat:"+ seatNumber);
        System.out.println("Price: $" + calculatePrice());
    }
}
