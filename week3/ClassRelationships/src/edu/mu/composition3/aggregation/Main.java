package edu.mu.composition3.aggregation;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        // Aggregation
        Task task1 = new Task(1, "Walk the dog");
        Task task2 = new Task(2, "Buy groceries");

        manager.addTask(task1);
        manager.addTask(task2);

        manager.completeTask(1); // delegation to TaskManager

        System.out.println(task1.isCompleted()); // true
        System.out.println(task2.isCompleted()); // false
    }
}