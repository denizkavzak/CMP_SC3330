package edu.mu.constructorexample;

/**
 * Constructor chaining and copy constructor example
 */
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this(name, 18);
    }

    public Student() {
        this("Unknown", 18);
    }
    
    public Student(Student other) {
        this(other.name, other.age);
    }
    
    @Override
    public String toString() {
    	return "Name: " + name + ", age: " + age;
    }
}