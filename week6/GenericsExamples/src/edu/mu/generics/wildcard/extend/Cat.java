package edu.mu.generics.wildcard.extend;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void speak() {
		System.out.println("Meow");
	}
	
	@Override
	public String toString() {
		return super.getName() + " says meow";
	}
}
