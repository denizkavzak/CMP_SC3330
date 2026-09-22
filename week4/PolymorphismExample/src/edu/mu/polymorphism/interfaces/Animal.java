package edu.mu.polymorphism.interfaces;

public class Animal {

	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("Animal speaks");
	}
	
}
