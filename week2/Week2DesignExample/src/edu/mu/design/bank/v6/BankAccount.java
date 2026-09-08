package edu.mu.design.bank.v6;

public class BankAccount {
	private final String owner; // final fields
	private final double balance;
	
	public BankAccount(String owner, double balance) { 
		if (owner == null || owner.isBlank()) { 
			throw new IllegalArgumentException( "Owner is required" ); 
		} 
		if (balance < 0) { 
			throw new IllegalArgumentException( "Opening balance cannot be negative" ); 
		} 
		
		this.owner = owner; 
		this.balance = balance; 
		
	}
	
	
	public String getOwner() {
		return owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public BankAccount deposit(double amount) {
		if (amount <= 0) { 
			throw new IllegalArgumentException( "Deposit must be positive" ); 
		}
		
		return new BankAccount(owner, balance + amount);
	}
	
	public BankAccount withdraw(double amount) {
		if (amount <= 0) { 
			throw new IllegalArgumentException( "Withdrawal must be positive" ); 
		} 
		
		if (amount > balance) { 
			throw new IllegalArgumentException( "Insufficient funds" ); 
		}
		
		return new BankAccount(owner, balance - amount);
	}
}
