package edu.mu.generics.interfaces;

public class Student {
    private int ID;
    private String name;
    private static int ID_counter = 0;

    public Student(String name) {
    	ID_counter ++;
    	this.ID = ID_counter;
        this.name = name;
    }

    public int getID() {
        return ID;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
    	return ID + " " + name;
    }
}
