package edu.mu.todolist.oop;

public class Task {
	
	private String description;
	private boolean isCompleted;
	private static int idGenerator = 0;
	private int taskID = 0;
	
	
	public Task(String description) {
		this.description = description;
		this.isCompleted = false;
		idGenerator++;
		this.taskID = idGenerator;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isCompleted() {
		return isCompleted;
	}


	public boolean markComplete() {
		if(this.isCompleted) { // if already completed, return false
			return false;
		}
		this.isCompleted = true;
		return true;
	}


	public int getTaskId() {
		return taskID;
	}


	@Override
	public String toString() {
		return "Task [description=" + description + ", isCompleted=" + isCompleted + ", taskID=" + taskID + "]";
	}
	
}
