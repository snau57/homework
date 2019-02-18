package com.train;

public class Ticket {
    int numTickets;
    int roundTrip;

    public Ticket(int numTickets, int roundTrip) {
        this.numTickets = numTickets;
        this.roundTrip = roundTrip;
    }


    public void price() {
        int total = (numTickets - roundTrip) * 1000 + (int) (roundTrip * 2000 * 0.9);
        System.out.println("Total tickets: " + numTickets);
        System.out.println("Round-trip: " + roundTrip);
        System.out.println("Total: " + total);
    }
}
