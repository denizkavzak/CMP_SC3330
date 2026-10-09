package edu.mu.testing.generic.compare.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.mu.testing.generic.compare.main.ContainerList;
import edu.mu.testing.generic.compare.main.Student;

class ContainerListTest {

	@Test
	void shouldFindMinimumInteger() {

	    ContainerList<Integer> list =
	        new ContainerList<>();

	    list.addItem(10);
	    list.addItem(5);
	    list.addItem(20);

	    assertEquals(5, list.getMin());
	}

	@Test
	void shouldFindStudentWithLowestGpa() {

	    ContainerList<Student> students =
	        new ContainerList<>();

	    students.addItem(
	        new Student(1, "Alice", 3.7)
	    );

	    students.addItem(
	        new Student(2, "Bob", 2.8)
	    );

	    students.addItem(
	        new Student(3, "Charlie", 3.4)
	    );

	    assertEquals(
	        "Bob",
	        students.getMin().getName()
	    );
	}
	
}
