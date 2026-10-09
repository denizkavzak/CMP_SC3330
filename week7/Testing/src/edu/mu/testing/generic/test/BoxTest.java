package edu.mu.testing.generic.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import edu.mu.testing.generic.main.Box;
import edu.mu.testing.generic.main.Task;

class BoxTest {

	@Test
	void boxShouldStoreTask() {
		Box<Task> box = new Box<>();
		
		Task task = new Task("Study");
		
		box.set(task);
		
		assertEquals(task, box.get());
	}

	@Test
	void boxShouldStoreString() {
		Box<String> box = new Box<>();

		box.set("Hello");
		
		assertEquals("Hello", box.get());
		
	}
	
}
