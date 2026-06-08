package com.Ticket.Java;

public class Main {
    public static void main (String[] args){
        Ticket standard = new Ticket ("Avatar",10);
        Ticket vip = new VipTicket ("Avatar",25);
        Ticket student = new StudentTicked("Avatar",26,15);
        standard.displayInfo();
        System.out.println();
        vip.displayInfo();
        System.out.println();
        student.displayInfo();
    }
}
