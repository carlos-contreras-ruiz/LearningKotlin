package com.github.carloscontrerasruiz.learningkotlin.kotlin

fun main() {
    val colors = listOf("RED", "blue", "GreeN")

    colors
        .map { it.lowercase() }
        .map { it.replaceFirst(it.first(), it.first().uppercaseChar()) }
        .forEach { println(it) }

    colors
        .map { it.lowercase() }
        .filter { it.contains("r") }
        .map { it.replaceFirst(it.first(), it.first().uppercaseChar()) }
        .forEach { println(it) }
    
}