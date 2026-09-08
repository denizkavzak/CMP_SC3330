package edu.mu.design.bank.v3;

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
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}
