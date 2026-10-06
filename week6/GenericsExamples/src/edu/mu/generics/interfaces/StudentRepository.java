package edu.mu.generics.interfaces;

import java.util.ArrayList;

public class StudentRepository implements Repository<Student>{

	ArrayList<Student> students = new ArrayList<>();
	
	@Override
	public void add(Student item) {
		students.add(item);
	}

	@Override
	public Student findByID(int id) {
		// TODO Auto-generated method stub
		for(Student s : students) {
			if(s.getID() == id) {
				return s;
			}
		}
		return null;
	}
	
	

}
