package com.perficient.funtionalprogramming.funtionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    //psvm
    public static void main(String[] args) {

        // Normal Java Function
        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);

        // Consumer Functional interface
        greetCustomerConsumer.accept(maria);

        greetCustomerConsumer2.accept(maria, false);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.custumerName
                + ", thanks for register the number "
                + (customer.customeraPhoneNumber));
    }
    static Consumer<Customer> greetCustomerConsumer = customer
            -> System.out.println("Hello " + customer.custumerName
                    + ", thanks for register the number "
                    + customer.customeraPhoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerConsumer2 = (customer, showByNumber)
            -> System.out.println("Hello " + customer.custumerName
                    + ", thanks for register the number "
                    + (showByNumber ? customer.customeraPhoneNumber : "**********"));

    static class Customer {

        private final String custumerName;
        private final String customeraPhoneNumber;

        public Customer(String custumerName, String customeraPhoneNumber) {
            this.custumerName = custumerName;
            this.customeraPhoneNumber = customeraPhoneNumber;
        }

    }

}
