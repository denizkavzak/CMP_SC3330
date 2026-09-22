package edu.mu.polymorphism.interfaces_v2;

/***
 * Need capability-specific processing?
    → use Adoptable[] / ZooResident[]
 */

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Britton", "Deniz");
		Cat cat = new Cat("Peanut", "Deniz");
		Lion lion = new Lion("Simba","St. Louis Zoo");
		
		Animal[] animals = {dog, lion, cat};
		
		for(Animal animal : animals) {
			animal.speak();
		}	
		
		Adoptable[] adoptableAnimals = {dog,cat};
		
		for(Adoptable animal : adoptableAnimals) {
			System.out.println(" Adopted by: " + animal.getAdopterName());
		}

		ZooResident[] zooAnimals = {lion};
		
		for(ZooResident animal : zooAnimals) {
			System.out.println("Zoo : " + animal.getZooName());
		}
	}
	
	
//	public static void main(String[] args) {
//		Animal[] animals = new Animal[3];
//		
//		Animal dog = new Dog("Britton", "Deniz");
//   	Animal cat = new Cat("Peanut", "Deniz");
//		Animal lion = new Lion("Simba");
//		
//		((Lion)lion).setZooName("St. Louis Zoo");
//		
//		animals[0] = dog;
//		animals[1] = lion;
//		animals[2] = cat;
//		
//		for(Animal animal : animals) {
//			animal.speak();
//			if(animal instanceof Adoptable) {
//				System.out.println(" Adopted by: " + ((Adoptable)animal).getAdopterName());
//			}
//			else if (animal instanceof ZooResident) {
//				System.out.println("Zoo : " + ((ZooResident)animal).getZooName());
//			}
//		}	
//
//	}

}
