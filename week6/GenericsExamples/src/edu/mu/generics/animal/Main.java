package edu.mu.generics.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Max");
		Animal animal = dog;   // allowed
		
		List<Dog> dogs = new ArrayList<>();
		List<Animal> animals = dogs;   // NOT allowed
		
		/*
		 * WHY?
		 * animals.add(new Cat());
		 * dogs shouldn't contain a Cat object
		 */
		
	}

}
