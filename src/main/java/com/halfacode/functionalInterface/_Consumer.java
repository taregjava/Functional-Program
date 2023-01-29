package com.halfacode.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
    Customer tareg= new Customer("tareg", "091111111");
        greetCustomer(tareg);
        greetCustomerV2(tareg, true);
        greetCustomerConsumer.accept(tareg);
        greetCustomerConsumerV2.accept(tareg, false);
    }

    static void greetCustomer(Customer customer){
        System.out.println("hello" +customer.customerName +
                ", thanks for register" + customer.customerPhoneNumber);
    }
    static void greetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("hello" +customer.customerName +
                ", thanks for register"
                + (showPhoneNumber ? customer.customerPhoneNumber :"*****"));
    }
    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer,showPhoneNumber) ->
            System.out.println("hello" +customer.customerName +
                    ", thanks for register"
                    + (showPhoneNumber ? customer.customerPhoneNumber :"*****"));
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("hello" +customer.customerName +
                    ", thanks for register" + customer.customerPhoneNumber);

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
