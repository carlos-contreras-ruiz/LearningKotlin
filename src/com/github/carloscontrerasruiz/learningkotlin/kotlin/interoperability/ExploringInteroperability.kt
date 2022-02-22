package com.github.carloscontrerasruiz.learningkotlin.kotlin.interoperability

data class CustomerInterOp(val id: String, var name: String)

class CustomerDb() {
    val customers = mutableListOf(
        CustomerInterOp("1", "Cc"),
        CustomerInterOp("2", "Cd"),
        CustomerInterOp("3", "Cf"),
        CustomerInterOp("4", "Cg"),
        CustomerInterOp("5", "Ch"),
    )

    @Throws(IllegalAccessException::class)
    fun addCustomer(c: CustomerInterOp) {
        throw IllegalAccessException("No se puede")
    }

    companion object {
        @JvmStatic
        fun helloWorld() = println("Hello world")
    }
}
