package com.train

fun main(args: Array<String>) {
//    val scanner = Scanner(System.`in`)
    var numTickets = 0
    while (numTickets != -1) {
        print("Please enter number of tickets: ")
        numTickets = readLine()!!.toInt()
//        numTickets = scanner.nextInt()
        if (numTickets != -1) {
            if (numTickets >= 0) {
                print("How many round-trip tickets: ")
                var roundTrip = readLine()!!.toInt()
//                var roundTrip = scanner.nextInt()
                if (roundTrip >= 0) {
                    if (roundTrip <= numTickets) {
                        val t = TicketKt(numTickets, roundTrip)
                        t.price();
                        println("Continue placing your order or enter -1 to end.");
                    } else {
                        println("Input error.  Please check your number of round-trip tickets.")
                    }
                } else {
                    println("Input error.  Please check your number of round-trip tickets.")
                }
            } else {
                println("Input error.  Please check your number of tickets.")
            }
        } else {
            println("Good bye.")
        }
    }
}

class TicketKt(var numTickets : Int, var roundTrip : Int) {
    fun price() {
        var total = (numTickets - roundTrip) * 1000 + (roundTrip * 2000 * 0.9)
        println("Total tickets: $numTickets")
        println("Round-trip: $roundTrip")
        println("Total: " + total.toInt())
    }

}