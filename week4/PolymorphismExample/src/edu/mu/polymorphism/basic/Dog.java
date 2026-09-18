package edu.mu.polymorphism.basic;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

    @Override
    public void speak() {
        System.out.println("Woof");
    }
}