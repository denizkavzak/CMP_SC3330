package edu.mu.inheritance.basic;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Luna");

        System.out.println(dog.getName());
        dog.speak();

        System.out.println(cat.getName());
        cat.speak();
	}

}
