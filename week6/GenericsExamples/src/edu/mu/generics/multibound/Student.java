package edu.mu.generics.multibound;

public class Student implements Comparable<Student>, Printable {

	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student other) {
		return Double.compare(this.gpa, other.gpa);
	}

	@Override
	public void print() {
		System.out.println(name + " - " + gpa);
	}
}