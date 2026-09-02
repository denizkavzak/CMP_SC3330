package edu.mu.constructorexample;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Alice", 20);
		Student s2 = new Student("Bob");
		Student s3 = new Student();
		Student s4 = new Student(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
