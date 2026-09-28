package mu.edu.equals.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
//		Student s1 = new Student(1, "Alex");
//		Student s2 = new Student(2, "Alex");
//		
//		System.out.println(s1.equals(s2));
		
		Map<Student, String> grades = new HashMap<>();
		
		Student s1 = new Student(1, "Alice");

		grades.put(s1, "A");
		
		Student s2 = new Student(1, "Alice");

		System.out.println(grades.get(s2));
		
	}

}
