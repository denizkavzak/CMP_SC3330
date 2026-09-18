package edu.mu.polymorphism.conditional_v2;

public class PaymentProcessor {

    public void processPayment(
            PaymentMethod method,
            double amount) {

        method.process(amount);
    }
}
