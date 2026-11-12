package edu.mu.mvc.bankingapp.bad;

public class BankingApp {

    private double balance = 100;

    public void depositButtonClicked(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        balance += amount;

        System.out.println(
                "New balance: " + balance);
    }
}