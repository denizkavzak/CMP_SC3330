package edu.mu.ie.task;

public class Task {
    private boolean completed;

    public boolean markComplete() {
        if (completed) {
            return false;
        }

        completed = true;
        return true;
    }
}
