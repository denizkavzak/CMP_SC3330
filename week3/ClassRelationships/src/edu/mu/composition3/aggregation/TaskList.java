package edu.mu.composition3.aggregation;

import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
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
