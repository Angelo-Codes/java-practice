package functionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class cnsmer_biConsumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);

        greeCustomerConsumer.accept(maria);

        greeCustomerConsumerV2.accept(maria, true);
        
    }

    static BiConsumer<Customer, Boolean> greeCustomerConsumerV2 = (customer, showPhoneNumber) ->
    System.out.println("Hello" + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));


    static Consumer<Customer> greeCustomerConsumer = customer ->
    System.out.println("Hello" + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello" + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
    
}
