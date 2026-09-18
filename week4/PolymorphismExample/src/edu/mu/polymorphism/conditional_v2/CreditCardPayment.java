package edu.mu.polymorphism.conditional_v2;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Processing credit card: " + amount);
    }
}
