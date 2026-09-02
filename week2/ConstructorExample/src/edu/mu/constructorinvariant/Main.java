package edu.mu.constructorinvariant;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Alice", 20); // valid

		Student s2 = new Student("", 20);      // exception
		Student s3 = new Student("Bob", -5);   // exception
	}

}
