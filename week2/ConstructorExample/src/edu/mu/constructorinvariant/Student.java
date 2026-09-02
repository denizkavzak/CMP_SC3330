package edu.mu.constructorinvariant;

/**
 * Example with constructor enforcing invariants
 */
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                "Name cannot be empty"
            );
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException(
                "Invalid age"
            );
        }

        this.name = name;
        this.age = age;
    }
}
