package com.github.carloscontrerasruiz.learningkotlin.kotlin

fun main() {

    try {
        println(7 / 0)
    } catch (e: ArithmeticException) {
        println("Caught")
    }

    var result = try {
        println(throwMethod(7, 0))
    } catch (e: Exception) {
        println("DESDE AQUI")
        0
    }

    println(result)
}

@Throws(ArithmeticException::class)
fun throwMethod(a: Int, b: Int): Int {
    return a / b
}