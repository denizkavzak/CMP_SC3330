package edu.mu.studentgrades;

public class Student {
	static final int NUM_OF_EXAMS = 3;
	private int ID;
	private String name;
	private float[] grades;
	
	public Student(int ID, String name, int numOfExams) {
		this.ID = ID;
		this.name = name;
		this.grades = new float[numOfExams];
	}
	
	public Student(int ID, String name) {
		this.ID = ID;
		this.name = name;
		this.grades = new float[NUM_OF_EXAMS]; // uses default numOfExams value
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float[] getGrades() {
		return grades;
	}
	public void setGrades(float[] grades) {
		this.grades = grades;
	}
	public int getNumOfExams() {
		return grades.length;
	}
	
	public float getExamAverage() {
		float average = 0;
		for (int i = 0; i < grades.length; i++) {
			average += grades[i];
		}
		return average/grades.length;
	}
}
