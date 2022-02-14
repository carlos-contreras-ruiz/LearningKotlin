package com.github.carloscontrerasruiz.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.random.Random

fun main() {
    var result: Any

    val randomNumber: Int = Random(3).nextInt()

    if (randomNumber == 1){
        result = BigDecimal(30)
    }else{
        result = "Hello"
    }

    println("Result is currently $result")

    if (result is BigDecimal) {
        result = result.add(BigDecimal(10))
    }else{
        result = result as String
    }

    println("Result is currently $result")
    println("Result is currently ${result::class.qualifiedName}")
}