package edu.mu.immutableexample;

/* final class: there cannot be subclasses for this class
 * immutability is easier to guarantee, another subclass 
 * could introduce mutable behavior
*/
public final class Person {
	// final field: cannot be reassigned later inside the class
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}