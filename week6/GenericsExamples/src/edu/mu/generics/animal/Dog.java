package edu.mu.generics.animal;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("Woof");
	}
	
}
