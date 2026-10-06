package edu.mu.generics.multibound;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Alice", 3.8);
		Student s2 = new Student("Carol", 3.5);

		Utility.process(s1);
		Utility.process(s2);
		
		Utility.smallerAndPrint(s1, s2);
	}

}
