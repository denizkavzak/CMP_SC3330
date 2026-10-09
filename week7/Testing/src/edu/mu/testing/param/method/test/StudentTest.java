package edu.mu.testing.param.method.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import edu.mu.testing.param.method.main.Student;

class StudentTest {

	static Stream<Arguments> validStudents() {
	    return Stream.of(
	        Arguments.of("Alice", 20),
	        Arguments.of("Bob", 25),
	        Arguments.of("Charlie", 30)
	    );
	}

	@ParameterizedTest
	@MethodSource("validStudents")
	void shouldCreateStudent(String name, int age) {

	    Student student = new Student(name, age);

	    assertEquals(name, student.getName());
	    assertEquals(age, student.getAge());
	}

}
