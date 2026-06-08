package com.Ticket.Java;

public class VipTicket extends Ticket {
    public VipTicket(String movieName, int seatNumber){
        super(movieName, seatNumber);
    }
    public double calculatePrice(){
        return 20;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Free snacks included!");
    }
}
