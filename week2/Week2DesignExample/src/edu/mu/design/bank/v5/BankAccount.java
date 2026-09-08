package edu.mu.design.bank.v5;

public class BankAccount {
	private String owner; 
	private double balance;
	
	public BankAccount(String owner, double openingBalance) { 
		if (owner == null || owner.isBlank()) { 
			throw new IllegalArgumentException( "Owner is required" ); 
		} 
		if (openingBalance < 0) { 
			throw new IllegalArgumentException( "Opening balance cannot be negative" ); 
		} 
		
		this.owner = owner; 
		this.balance = openingBalance; 
		
	}
	
	
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
