package com.github.carloscontrerasruiz.learningkotlin.kotlin.interfaces

interface Booking {
    val version: String

    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerId: Long): Boolean

    fun systemStatus() = "All operations are functionals"
}

//Por defecto en Kotlin las clases son final
open class BasicBooking(authKey: String) : Booking {
    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true

    override fun reserveSeat(seat: Seat, customerId: Long) = false

    init {
        if (authKey != "12345") throw CustomException("Este es el mensaje")
    }
}

class AdvancedBooking(authKey: String) : BasicBooking(authKey) {
    override val version = "2.0"
    fun howManyBooking() = 10
}

class CustomException(override val message: String) : Throwable()

fun String.toSentenceCase(): String {
    return this[0].uppercase() + this.substring(1)
}


fun main() {
    val seatFree = AdvancedBooking("12345").isSeatFree(Seat("sdsds", 10))
    println(seatFree)

    val myList = mutableListOf<Int>()
    val greeting = "welcome"
    println(greeting.toSentenceCase())
}

data class Seat(val id: String, val price: Int)