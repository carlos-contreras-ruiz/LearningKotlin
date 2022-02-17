package com.github.carloscontrerasruiz.learningkotlin.kotlin

fun main() {
    val employees = ArrayList<EmployeeDtoIf>()
    employees.add(EmployeeDtoIf(10, "123", 21))
    employees.add(EmployeeDtoIf(100, "1234", 22))
    employees.add(EmployeeDtoIf(1000, "12345", 23))

    for (employee in employees) {
        val (salary, id) = employee
        println("Empleado con id $id y salario $salary")
    }

    for ((salary, id) in employees) {
        println("Empleado con id $id y salario $salary")
    }

    val employeesHash = HashMap<Int, EmployeeDtoIf>()
    employeesHash[1] = EmployeeDtoIf(10, "123", 21)
    employeesHash.put(2, EmployeeDtoIf(100, "1234", 22))
    employeesHash.put(3, EmployeeDtoIf(1000, "12345", 23))
    for ((key, value) in employeesHash) {
        println("key $key value $value")
    }

    val myRange = 0..9
    for (i in myRange) {
        println(i)
    }
}