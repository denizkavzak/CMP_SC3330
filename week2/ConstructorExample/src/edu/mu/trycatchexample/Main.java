package edu.mu.trycatchexample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000);
		
		try {
		    account.deposit(-50);
		} catch (IllegalArgumentException e) {
		    System.out.println("Could not deposit: " + e.getMessage());
		}

		System.out.println("Program continues...");

		Scanner input = new Scanner(System.in);
		// We can ask the user again
		while (true) {
		    try {
		        System.out.print("Enter deposit amount: ");
		        double amount = input.nextDouble();

		        account.deposit(amount);

		        break; // success, leave the loop

		    } catch (IllegalArgumentException e) {
		        System.out.println(e.getMessage());
		        System.out.println("Please try again.");
		    } finally {
	            System.out.println("This always runs.");
		    } 
		}

		input.close();
		System.out.println("Deposit program ended");
	
	}

}
