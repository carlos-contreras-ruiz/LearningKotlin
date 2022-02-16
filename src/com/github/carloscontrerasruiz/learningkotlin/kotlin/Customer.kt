package com.github.carloscontrerasruiz.learningkotlin.kotlin

//class Customer {
//    val name: String
//    val addres: String
//    var age: Int
//
//    constructor(name: String, address: String, age: Int) {
//        this.name = name
//        this.addres = address
//        this.age = age
//    }
//}

open class Customer(
    val name: String,
    val address: String,
    var age: Int,
) {
    //constructor(name: String, age: Int) : this(name, "", age)
    constructor(name: String, age: Int) : this(name, "", age) {
        println("Secondary constructor called")
    }

    init {
        println("Init block")
    }
}

class AlternativeCustomer(val name: String, var age: Int) {
    var address: String = ""

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }
}

class MinimalCustomer(
    val name: String,
    val address: String = "Default adrees",
    var age: Int,
)

class MinimalCustomerSetters(
    val name: String,
    val address: String = "Default adrees",
    var age: Int,
) {
    var approved: Boolean = false
        set(value) {
            if (age >= 21) {
                field = value
            } else {
                println("Under 21")
            }

        }

    val nextAge
        get() = age + 1

    fun uppercaseName() = name.uppercase()

    override fun toString(): String {
        return "$name, $address, $age"
    }

    //static method
    companion object {
        fun getInstance() = MinimalCustomerSetters(name = "Carlos", age = 5)
    }
}

class Employee(
    val salary: Int,
    name: String,
    age: Int,
) : Customer(name, age)

data class EmployeeDto(
    val salary: Int,
    val id: String
)

fun main() {
    val customer = Customer(
        name = "carlos", address = "algo",
        age = 20
    )

    val customer2 = Customer("Secondary", 10)
    customer.age = 30
//    println(customer.name)
//    println(customer.age)
//    println(customer.address)

    val customer3 = MinimalCustomerSetters(name = "Carlos", age = 90)
    println(customer3.name)
    println(customer3.uppercaseName())
    println(customer3.age)
    println(customer3.address)
    println(customer3.nextAge)
    println(customer3.toString())
    println(MinimalCustomerSetters.getInstance().toString())

    //inherited class
    val employee = Employee(1000, "Employee1", 30)
    println(employee)
    println(employee.name)

    //data class
    val employeeDto = EmployeeDto(1000, "sdfghjklkid")
    println(employeeDto)
    val employeeDto2 = employeeDto.copy()
    println(employeeDto2)
    val employeeDto3 = employeeDto.copy(salary = 200)
    println(employeeDto3)
    //Es por posision
    val (salarySome, id) = employeeDto3
    println(salarySome)
    println(id)
}