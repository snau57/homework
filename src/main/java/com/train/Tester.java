package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTickets = 0;
        while (numTickets != -1) {
            System.out.print("Please enter number of tickets: ");
            numTickets = scanner.nextInt();
            if (numTickets != -1) {
                if (numTickets >= 0) {
                    System.out.print("How many round-trip tickets: ");
                    int roundTrip = scanner.nextInt();
                    if (roundTrip >= 0) {
                        if (roundTrip <= numTickets) {
                            Ticket t = new Ticket(numTickets, roundTrip);
                            t.price();
                            System.out.println("Continue placing your order or enter -1 to end.");
                        } else {
                            System.out.println("Input error.  Please check your number of round-trip tickets.");
                        }
                    } else {
                        System.out.println("Input error.  Please check your number of round-trip tickets.");
                    }
                } else {
                    System.out.println("Input error.  Please check your number of tickets.");
                }
            } else {
                System.out.println("Good bye.");
            }
        }
    }
}
