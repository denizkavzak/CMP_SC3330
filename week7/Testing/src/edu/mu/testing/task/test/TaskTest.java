package edu.mu.testing.task.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import edu.mu.testing.task.main.Task;

class TaskTest {

    private Task task;
    
    @BeforeEach
    void setup() {
        task = new Task("Study");
    }
	
	// happy path
	@Test
	void shouldCreateIncompleteTask() {
	    //Task task = new Task("Study");

	    assertFalse(task.isCompleted());
	}

	// behavior
	@Test
	void shouldCompleteTask() {
	    //Task task = new Task("Study");

	    boolean result = task.markComplete();

	    assertTrue(result);
	    assertTrue(task.isCompleted());
	}
	
	// failure behavior
	@Test
	void shouldNotCompleteTaskTwice() {
	    //Task task = new Task("Study");

	    task.markComplete();
	    boolean result = task.markComplete();

	    assertFalse(result);
	}
	
	@Test
	void shouldRejectBlankDescription() {

	    assertThrows(IllegalArgumentException.class, () -> new Task(""));
	}
	
	@Test
	void shouldRejectNullDescription() {

	    assertThrows(IllegalArgumentException.class, () -> new Task(null));
	}

	@ParameterizedTest
	@ValueSource(strings = {"", " ", "   "})
	void shouldRejectBlankDescriptions(String value) {

	    assertThrows(IllegalArgumentException.class,
	        () -> new Task(value));
	}

	@ParameterizedTest
	@ValueSource(strings = {"A", "Task", "Study"})
	void shouldCreateTaskWithValidDescriptions(String input) {

	    Task task = new Task(input);
	    
	    assertNotNull(task);
	}
	
	public static Stream<Arguments> taskCases(){
		return Stream.of(
				Arguments.of(new Task("Study"),true),
				Arguments.of(new Task("Sleep"),true)
				);
	}
	
	@ParameterizedTest
	@MethodSource("taskCases")
	public void shouldCompleteTask(Task task, boolean expected) {
		task.markComplete();
		assertEquals(expected, task.isCompleted());
	}
	
}
