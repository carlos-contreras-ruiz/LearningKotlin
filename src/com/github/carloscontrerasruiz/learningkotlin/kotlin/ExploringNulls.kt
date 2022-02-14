package com.github.carloscontrerasruiz.learningkotlin.kotlin

fun main() {
    //var name: String = null //Esto da error
    //por defecto una variable no puede ser inisializada en null
    var name : String? = null
    //name = "carlos"

    //1
    /*if (name != null){
        println(name.uppercase())
    }*/

    //2
    println(name?.uppercase()) //Si es nulo regresara nulo si no el valor

    val result = name!!.uppercase(); //Con esto le aseguramos aKotlin que no es null

    var address = null



}