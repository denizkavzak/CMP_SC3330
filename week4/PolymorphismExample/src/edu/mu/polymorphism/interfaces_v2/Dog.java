package edu.mu.polymorphism.interfaces_v2;

public class Dog extends Animal implements Adoptable{
	
	private String adopterName;
	
	public Dog(String name, String adopterName) {
		super(name);
		this.adopterName = adopterName;
	}

	@Override
	public void speak() {
		System.out.println("Woof");
	}
	
	@Override
	public void adopt(String adopterName) {
		this.adopterName = adopterName;
	}
	
	@Override
	public String getAdopterName() {
		return adopterName;
	}

}
