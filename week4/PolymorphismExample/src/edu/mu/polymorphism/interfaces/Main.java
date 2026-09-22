package edu.mu.polymorphism.interfaces;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[2];
		
		Animal dog = new Dog("Britton", "Deniz");
		Animal lion = new Lion("Simba","St. Louis Zoo");
		
		animals[0] = dog;
		animals[1] = lion;
		
		for(Animal animal : animals) {
			animal.speak();
			if(animal instanceof Dog) {
				System.out.println("Dog is adopted by: " + ((Dog)animal).getAdopterName());
			}
			else if (animal instanceof Lion) {
				System.out.println("Lion is in: " + ((Lion)animal).getZooName());
			}
		}	
	}

}
