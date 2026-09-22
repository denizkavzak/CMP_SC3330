package edu.mu.polymorphism.interfaces;

public class Lion extends Animal{
	
	String zooName;
	
	public Lion(String name, String zooName) {
		super(name);
		this.zooName = zooName;
	}

	public void speak() {
		System.out.println("Roar");
	}
	
	public void setZooName(String zooName) {
		this.zooName = zooName;
	}
	
	public String getZooName() {
		return zooName;
	}
}
