package edu.mu.inheritance.basic;

/***
 * Cat IS-A Animal
 */
public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
