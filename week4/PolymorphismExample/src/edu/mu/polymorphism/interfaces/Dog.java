package edu.mu.polymorphism.interfaces;

public class Dog extends Animal{
	
	String adopterName;
	
	public Dog(String name, String adopterName) {
		super(name);
		this.adopterName = adopterName;
	}

	public void speak() {
		System.out.println("Woof");
	}
	
	public void adoptDog(String adopterName) {
		this.adopterName = adopterName;
	}
	
	public String getAdopterName() {
		return adopterName;
	}
}
