package edu.mu.polymorphism.interfaces_v3;

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
