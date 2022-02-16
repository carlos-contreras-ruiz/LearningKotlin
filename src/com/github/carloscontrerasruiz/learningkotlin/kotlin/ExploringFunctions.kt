package com.github.carloscontrerasruiz.learningkotlin.kotlin

//Las funciones en Kotlin fuera de una clase
//Son por default public and static

fun main() {
    printString("Hello world")
    addTwoNumbersShort(5.8, 6.0)
    namedParameters(two = 15.0, one = 10.0)
    defaultValue(one = 10.0)
    defaultValue(two = 10.0)
    defaultValue(15.0)
}

fun printString(value: String) {
    println(value)
}

fun addTwoNumbers(one: Double, two: Double): Double {
    return one + two
}

fun addTwoNumbersShort(one: Double, two: Double) = one + two

fun namedParameters(one: Double, two: Double) {
    println("$one + $two is ${one + two}")
    println("$one - $two is ${one - two}")
}

fun defaultValue(one: Double = 10.0, two: Double = 34.8) {
    println("$one + $two is ${one + two}")
    println("$one - $two is ${one - two}")
}

fun functionLambdaParameter(input: String, action: java.util.function.Function<String, Int>) {
    println(action.apply(input))
}

fun functionLambdaParameterKotlin(input: String, action: (String)->Int) {
    println(action(input))
}