package edu.mu.design.bank.v4;

public class BankAccount {
	private String owner; 
	private double balance;
	
	public String getOwner() {
		return owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if (amount <= 0) { 
			throw new IllegalArgumentException( "Deposit must be positive" ); 
		}
		
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) { 
			throw new IllegalArgumentException( "Withdrawal must be positive" ); 
		} 
		
		if (amount > balance) { 
			throw new IllegalArgumentException( "Insufficient funds" ); 
		}
		
		balance -= amount;
	}
}
