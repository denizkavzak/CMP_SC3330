package edu.mu.design.bank.v6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount("Alice", 1000); 
		BankAccount account2 = account1.deposit(500); 
		System.out.println(account1.getBalance()); // 1000 
		System.out.println(account2.getBalance()); // 1500
	}

}
