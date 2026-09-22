package edu.mu.polymorphism.interfaces_v3;

public abstract class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void speak();
	
	public abstract String getInfo();
}
