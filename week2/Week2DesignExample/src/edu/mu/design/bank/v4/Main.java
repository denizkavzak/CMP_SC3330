package edu.mu.design.bank.v4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		account.deposit(500);
		account.withdraw(200);
		
		// no exception handling
		account.deposit(-100);
		account.withdraw(-200);
		account.withdraw(700);
		
		// exception handling
		try {
			account.deposit(-100);
			account.withdraw(-200);
			account.withdraw(700);		
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("done");
		
	}

}
