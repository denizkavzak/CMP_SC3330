package edu.mu.generics.wildcard.extend;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		List<Dog> dogs = new ArrayList<Dog>();
		List<Cat> cats = new ArrayList<Cat>();
		List<Object> objs = new ArrayList<Object>();
		
		printAnimals(animals);
		printAnimals(dogs);
		printAnimals(cats);
		
		animals.add(new Dog("Emma"));
				
		addDog(dogs, "Emma");
		addDog(animals, "Britton");
		addDog(objs, "Max");
		
		printAnimals(animals);
	}
	
	public static void printAnimals(List<? extends Animal> animals) {

	    for (Animal animal : animals) {
	        System.out.println(animal);
	    }
	}
	
	public static void addDog(List<? super Dog> animals, String name) {
	    animals.add(new Dog(name));
	}

}
