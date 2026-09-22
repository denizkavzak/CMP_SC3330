package edu.mu.polymorphism.interfaces_v3;

/***
 * Need one common operation for all animals?
    → put that polymorphic behavior in Animal
 */
public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Britton", "Deniz");
		Cat cat = new Cat("Peanut", "Deniz");
		Lion lion = new Lion("Simba", "St. Louis Zoo");
		
		Animal[] animals = {dog, lion, cat};
		
		for(Animal animal : animals) {
			animal.speak();
			System.out.println(animal.getInfo());
		}	
	}

}
