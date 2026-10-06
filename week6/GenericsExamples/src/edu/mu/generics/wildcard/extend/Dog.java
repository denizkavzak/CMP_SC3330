package edu.mu.generics.wildcard.extend;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("Woof");
	}
	
	@Override
	public String toString() {
		return super.getName() + " says woof";
	}
}
