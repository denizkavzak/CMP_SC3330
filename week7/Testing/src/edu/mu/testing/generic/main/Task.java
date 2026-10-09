package edu.mu.testing.generic.main;

public class Task {

    private String description;
    private boolean completed;

    public Task(String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException();
        }

        this.description = description;
        this.completed = false;
    }

    public boolean markComplete() {
        if (completed) {
            return false;
        }

        completed = true;
        return true;
    }

    public boolean isCompleted() {
        return completed;
    }
}