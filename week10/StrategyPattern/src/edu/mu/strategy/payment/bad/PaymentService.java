package edu.mu.strategy.payment.bad;

public class PaymentService {

    void pay(String type, double amount) {

        if (type.equals("credit")) {
            // credit card payment
        }
        else if (type.equals("paypal")) {
            // PayPal payment
        }
        else if (type.equals("crypto")) {
            // crypto payment
        }
    }
}