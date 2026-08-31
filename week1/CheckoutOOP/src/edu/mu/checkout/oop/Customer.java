package edu.mu.checkout.oop;

public class Customer {
    private boolean premium;

    public Customer(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
}