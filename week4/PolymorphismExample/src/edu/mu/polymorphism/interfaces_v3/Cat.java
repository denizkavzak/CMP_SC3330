package edu.mu.polymorphism.interfaces_v3;

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
	 public String getInfo() {
		 return getName() + " is adopted by " + adopterName;
	 }
	
	@Override
	public void adoptDog(String adopterName) {
		this.adopterName = adopterName;
	}
	
	@Override
	public String getAdopterName() {
		return adopterName;
	}

}
