package edu.mu.generics.compare;

public class Task implements Comparable<Task> {

    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return description + " priority=" + priority;
    }
}
