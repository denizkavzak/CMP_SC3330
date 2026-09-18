package edu.mu.polymorphism.conditional;

public class PaymentProcessor {
    public void process(String type, double amount) {

        if (type.equals("CREDIT")) {
            System.out.println("Processing credit card: " + amount);
        }
        else if (type.equals("PAYPAL")) {
            System.out.println("Processing PayPal: " + amount);
        }
        else if (type.equals("CASH")) {
            System.out.println("Processing cash: " + amount);
        }
    }
}
