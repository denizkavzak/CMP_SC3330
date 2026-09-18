package edu.mu.inheritance.basic;

/***
 * Dog IS-A Animal
 * Inheritance syntax, constructor chaining, overriding, polymorphic references
 */
public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
		System.out.println("Animal Constructor");
	}

    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
