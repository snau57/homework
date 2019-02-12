package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var numTickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTrip = scanner.nextInt();
    val t = TicketKt(numTickets, roundTrip)
    t.price();
}

class TicketKt(var numTickets : Int, var roundTrip : Int) {
    fun price() {
        var total = (numTickets - roundTrip) * 1000 + (roundTrip * 2000 * 0.9)
        println("Total tickets: $numTickets")
        println("Round-trip: $roundTrip")
        println("Total: " + total.toInt())
    }

}