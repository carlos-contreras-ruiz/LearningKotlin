package com.github.carloscontrerasruiz.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    println("Hello worlds")
    var name = "Carlos" //variable
    val surname: String = "CC"//Final

    name = "Francisco"
    //name = 12

    //println("Hello "+name + surname)
    //Template string
    println("Hello $name $surname !!!!!")
    println("Your first name has ${name.length} characters")
    println("Hello ${name.uppercase()} ${surname.uppercase()} !!!!!")

    val story = """It was a dark
        |night
        |booo""".trimMargin("|")
    println(story)

    numbers()
}

fun numbers() {
    val myDouble = 21.4
    println("============Numbers==========")
    println(myDouble is Double)
    println(myDouble::class.qualifiedName)
    println("Double java class ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
    println(myInteger::class.qualifiedName)

    val myFloat: Float = 13.4f
    val myInt: Int = 12
    //val myLong: Long = 123
    //Kotlin remove new keyword
    //val bigDecimal: BigDecimal = new BigDecimal(17)
    val bigDecimal: BigDecimal = BigDecimal(17)
}
