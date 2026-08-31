package edu.mu.studentgrades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1,"Deniz",3);
		float[] grades = new float[s.getNumOfExams()];
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Enter a grade: ");
			float grade = input.nextInt();
			grades[i] = grade;
		}
		input.close();
		
		s.setGrades(grades);
		
		System.out.println(s.getExamAverage());
		
	}

}
