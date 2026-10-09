package edu.mu.testing.username.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.mu.testing.username.main.Username;

class UsernameTest {

	@Test
	void shouldRejectTwoCharacterUsername() {
	    assertThrows(
	        IllegalArgumentException.class, () -> new Username("ab"));
	}

	@Test
	void shouldAcceptThreeCharacterUsername() {
	    new Username("abc");
	}
}
