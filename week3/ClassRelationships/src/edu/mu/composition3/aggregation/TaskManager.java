package edu.mu.composition3.aggregation;

public class TaskManager {

    private TaskList taskList;

    public TaskManager() {
        taskList = new TaskList();
    }

    public void completeTask(int id) {

        Task task = taskList.getTaskById(id); // delegation to TaskList

        if (task != null) {
            task.markCompleted(); // delegation to Task
        }
    }

    public void addTask(Task task) {
        taskList.addTask(task);
    }
}
