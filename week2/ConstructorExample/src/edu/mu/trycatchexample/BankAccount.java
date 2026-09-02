package edu.mu.trycatchexample;

public class BankAccount {
	private double balance;
	
	public BankAccount(){
		this.balance = 0;
	}
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
	    if (amount <= 0) {
	        throw new IllegalArgumentException("Amount must be positive");
	    }

	    balance += amount;
	}
	
}
