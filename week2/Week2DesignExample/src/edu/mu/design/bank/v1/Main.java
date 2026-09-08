package edu.mu.design.bank.v1;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(); 
		account.owner = "Alice"; 
		account.balance = 1000; 
		account.balance = account.balance + 500; 
		account.balance = account.balance - 200; 
		account.balance = -10000; // nothing prevents this 
		System.out.println(account.balance);

	}

}
