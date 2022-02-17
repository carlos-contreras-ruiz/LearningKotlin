package com.github.carloscontrerasruiz.learningkotlin.kotlin

data class EmployeeDtoIf(
    val salary: Int,
    val id: String,
    val age: Int,
) {
    override fun toString() = "Employee override $id , $salary, $age"

    val mountAccepted: Int?
        get() = validateRequest(salary, age)

    var favoriteColor: String? = null

    private fun getUppercaseColor(): String {
        //return if (favoriteColor == null)"" else favoriteColor.uppercase()
        return favoriteColor?.uppercase() ?: ""
    }

    fun getLastLetter(a: String) = a.takeLast(1)

    fun getLastLetterColor(): String {
        return favoriteColor?.let { getLastLetter(it) } ?: ""
    }

    fun getColorType(): String {
        return when (getUppercaseColor()) {
            "" -> "empty"
            "RED", "GREEN" -> "rgb"
            else -> "other"
        }
    }

    companion object {
        fun validateRequest(salary: Int, age: Int): Int? {
            return if (age >= 21 && salary > 1000) age * salary else null
        }
    }
}

fun main() {
    val accepted = if (30 > 40) "Treintas" else "Cuarentas"
    println(accepted)

    val employee = EmployeeDtoIf(1020, "fdfdsds", 20)
    println(employee.mountAccepted)
    println(employee.getColorType())
    employee.favoriteColor = "RED"
    println(employee.getColorType())

    //Elvis operator
    //Si la primera expression no es null regresa la propia expresion
    //de lo contrario regresa lo de la derecha
    val accepted2 = employee.mountAccepted ?: -5
    println(accepted2)
}