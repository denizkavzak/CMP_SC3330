package edu.mu.polymorphism.conditional_v2;

public class PayPalPayment implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal: " + amount);
    }
}