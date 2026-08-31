package edu.mu.student;

public class Main {

	public static void main(String[] args) {
		
		// an object of the class Student
		Student s1 = new Student();
		
		System.out.println(s1.getID()); // should be 0
		System.out.println(s1.getName()); // should be empty string ""
		
		Student s2 = new Student(2, "Ekin");
		
		System.out.println(s2.getID());
		System.out.println(s2.getName());
		
		s1.setID(1);
		s1.setName("Deniz");
		
		System.out.println(s1.getID());
		System.out.println(s1.getName());
		
		s1.introduce();
		s2.introduce();
				
		System.out.println(s1); // uses toString implementation in Student class
		System.out.println(s2); // uses toString implementation in Student class
	}

}
