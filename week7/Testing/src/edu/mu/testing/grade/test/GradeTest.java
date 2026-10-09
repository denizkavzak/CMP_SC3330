package edu.mu.testing.grade.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import edu.mu.testing.grade.main.Grade;

class GradeTest {

	@ParameterizedTest
	@ValueSource(ints = {-1, 101})
	void shouldRejectInvalidScores(int score) {

	    assertThrows(
	        IllegalArgumentException.class,
	        () -> new Grade(score)
	    );
	}

	@ParameterizedTest
	@ValueSource(ints = {60, 61, 100})
	void shouldPassValidPassingGrades(int score) {

	    Grade grade = new Grade(score);

	    assertTrue(grade.isPassing());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0, 59})
	void shouldFailNonPassingGrades(int score) {

	    Grade grade = new Grade(score);

	    assertFalse(grade.isPassing());
	}
	
}
