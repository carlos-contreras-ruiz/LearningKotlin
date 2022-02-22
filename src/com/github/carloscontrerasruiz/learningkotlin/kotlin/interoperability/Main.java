package com.github.carloscontrerasruiz.learningkotlin.kotlin.interoperability;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerInterOp phil = new CustomerInterOp("90", "JAVA");
        CustomerDb customerDb = new CustomerDb();
        List<CustomerInterOp> customers = customerDb.getCustomers();
        customers.forEach(item -> System.out.println(item.toString()));
        System.out.println("=======================================");
        customers.add(phil);
        customers.forEach(item -> System.out.println(item.toString()));

        CustomerDb.helloWorld();
        try {
            customerDb.addCustomer(phil);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
