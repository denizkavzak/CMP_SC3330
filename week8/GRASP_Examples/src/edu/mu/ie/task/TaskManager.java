package edu.mu.ie.task;

public class TaskManager {
    public void complete(Task task) {
    	task.markComplete();
        //task.setCompleted(true); // bad
    }
}
