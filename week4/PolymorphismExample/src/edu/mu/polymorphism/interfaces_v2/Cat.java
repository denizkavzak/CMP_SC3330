package edu.mu.polymorphism.interfaces_v2;

public class Cat extends Animal implements Adoptable{

	private String adopterName;
	
	public Cat(String name, String adopterName) {
		super(name);
		this.adopterName = adopterName;
	}
	
	@Override
	public void speak() {
		System.out.println("meow");
	}

	@Override
	public String getAdopterName() {
		// TODO Auto-generated method stub
		return adopterName;
	}

	@Override
	public void adopt(String adopterName) {
		this.adopterName = adopterName;
		
	}

}
