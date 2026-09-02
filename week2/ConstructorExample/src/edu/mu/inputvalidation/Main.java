package edu.mu.inputvalidation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int age;

		while (true) {
		    System.out.print("Enter age: ");
		    age = input.nextInt();

		    // input validation at user input interface layer
		    if (age >= 0) {
		        break;
		    }

		    System.out.println("In user input layer: Age cannot be negative.");
		}
		
		input.close();
		
		Person person = new Person("Joe", age);
		person.setAge(-5); // input validation is done in setAge
		
		System.out.println("Done."); // will not be printed
	}

}
