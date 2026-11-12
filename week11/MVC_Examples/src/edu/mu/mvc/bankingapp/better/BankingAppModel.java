package edu.mu.mvc.bankingapp.better;

public class BankingAppModel {
    
	private double balance = 100;

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        balance += amount;
    }
    
    public double getBalance() {
    	return balance;
    }
}
