package edu.mu.inputvalidation;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) {
	    if (age < 0) { // input validation
	        throw new IllegalArgumentException("In object: Age cannot be negative");
	    }

	    this.age = age;
	}

}
