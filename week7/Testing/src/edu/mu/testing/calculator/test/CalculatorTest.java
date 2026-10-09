package edu.mu.testing.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.mu.testing.calculator.main.Calculator;

class CalculatorTest {
	
	@Test
	void shouldAddTwoNumbers() {
	    Calculator calculator = new Calculator(); // arrange

	    int result = calculator.add(2, 3); // act

	    assertEquals(5, result); // assert
	}

}
