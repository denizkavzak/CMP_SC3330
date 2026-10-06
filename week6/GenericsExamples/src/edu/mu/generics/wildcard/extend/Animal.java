package edu.mu.generics.wildcard.extend;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("Animal speaks");
	}

	public String getName() {
		return name;
	}
}
