package com.github.carloscontrerasruiz.learningkotlin.kotlin

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.util.*
import kotlin.test.assertEquals

class AgeCalculation() {
    fun getAge(dob: Calendar): Int {
        val today = Calendar.getInstance()
        if (dob.timeInMillis > today.timeInMillis) throw IllegalArgumentException()
        val years = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR)
        return if (dob.get(Calendar.DAY_OF_YEAR) > today.get(Calendar.DAY_OF_YEAR))
            years - 1
        else years
    }

}

class AgeCalculationTest() {

    val ageCalculation = AgeCalculation()

    @Test
    fun checkBornToday() {
        val age = ageCalculation.getAge(Calendar.getInstance())
        assertEquals(0, age)
    }

    @Test
    fun checkAge1000Ago() {
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, -1000)
        val age = ageCalculation.getAge(calendar)
        assertEquals(2, age)
    }

    @Test
    fun checkAgeException() {
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, 10)
        assertThrows<IllegalArgumentException> {
            val age = ageCalculation.getAge(calendar)
        }
    }
}