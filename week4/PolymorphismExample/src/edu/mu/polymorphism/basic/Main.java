package edu.mu.polymorphism.basic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Luna");

        /*
         * Which speak() gets called?
         * the method belonging to the actual runtime object.
         * Dynamic dispatch
         */
        a1.speak(); 
        a2.speak();
        
        Animal[] animals = {
        	    new Dog("Buddy"),
        	    new Cat("Luna"),
        	    new Dog("Max")
        	};

        for (Animal animal : animals) {
            animal.speak();
        }
	}

}
