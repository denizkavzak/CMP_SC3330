package edu.mu.composition3.converted;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> tasks;
    private int nextId;

    public TaskList() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String description) { // composition
        Task task = new Task(nextId, description); // task created here
        tasks.add(task);
        nextId++;
    }

    public Task getTaskById(int id) {

        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }

        return null;
    }
}
