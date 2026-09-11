package edu.mu.composition3.converted;

public class Main {

	public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask("Walk the dog");
        manager.addTask("Buy groceries");

        manager.completeTask(1);
	}

}
