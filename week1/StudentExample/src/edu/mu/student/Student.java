package edu.mu.student;

/**
 * Student class: blueprint
 */
public class Student {
	
	// Fields/instance variables: the data
	private int ID;
	private String name;
	
	public Student() {
		ID = 0;
		name = "";
	}
	
	// Constructor
	public Student(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	// method: behavior
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void introduce() {
		System.out.println("Hello! My ID is: " + ID + ", name is: " + name);
	}
	
	// overriding toString method
	@Override
	public String toString() {
		return "Student ID: " + ID + ", name: " + name;
	}
}
