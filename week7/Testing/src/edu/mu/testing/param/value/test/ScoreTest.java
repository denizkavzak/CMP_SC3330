package edu.mu.testing.param.value.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import edu.mu.testing.param.value.main.Score;

class ScoreTest {

	@Test
	void shouldRejectZero() {
	    assertThrows(
	        IllegalArgumentException.class,
	        () -> new Score(0)
	    );
	}

	@Test
	void shouldRejectNegativeOne() {
	    assertThrows(
	        IllegalArgumentException.class,
	        () -> new Score(-1)
	    );
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0, -1, -10})
	void shouldRejectInvalidScores(int score) {

	    assertThrows(
	        IllegalArgumentException.class,
	        () -> new Score(score)
	    );
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 10, 100})
	void shouldAcceptValidScores(int score) {

		assertTrue(score >= 0);
	}
	

}
