package edu.mu.composition3.converted;

public class TaskManager {

    private TaskList taskList;

    public TaskManager() {
        taskList = new TaskList();
    }

    public void addTask(String description) {
        taskList.addTask(description);
    }

    public void completeTask(int id) {

        Task task = taskList.getTaskById(id);

        if (task != null) {
            task.markCompleted();
        }
    }
}