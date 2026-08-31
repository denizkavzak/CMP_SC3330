package edu.mu.todolist.procedural;

public class Main {

	// program has parallel arrays
    static String[] descriptions = new String[5];
    static boolean[] completed = new boolean[5];
    static int[] taskIds = new int[5];

    static int idGenerator = 0;

    public static void main(String[] args) {

        System.out.println(addTask("Walk the dog"));
        System.out.println(addTask("Clean cat's litterbox"));
        System.out.println(addTask("Don't forget wife's birthday!"));
        System.out.println(addTask("Pick up kid from school"));
        System.out.println(addTask("Pick up groceries"));

        // Should fail because the list is full
        System.out.println(addTask("Take a bath"));

        System.out.println("\nIncomplete tasks:");
        viewIncompleteTasks();

        System.out.println("\nCompleting task 4:");
        System.out.println(completeTask(4));

        System.out.println("\nIncomplete tasks:");
        viewIncompleteTasks();

        System.out.println("\nRemoving task 1:");
        System.out.println(removeTask(1));

        System.out.println("\nIncomplete tasks:");
        viewIncompleteTasks();
    }

    public static boolean addTask(String description) {

        int availableIndex = findAvailableIndex();

        if (availableIndex == -1) {
            return false;
        }

        idGenerator++;

        descriptions[availableIndex] = description;
        completed[availableIndex] = false;
        taskIds[availableIndex] = idGenerator;

        return true;
    }

    public static int findAvailableIndex() {

        for (int i = 0; i < descriptions.length; i++) {

            if (descriptions[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public static int findTaskById(int taskID) {

        for (int i = 0; i < taskIds.length; i++) {

            if (descriptions[i] != null) {

                if (taskIds[i] == taskID) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static boolean completeTask(int taskID) {

        int taskIndex = findTaskById(taskID);

        if (taskIndex == -1) {
            return false;
        }

        if (completed[taskIndex]) {
            return false;
        }

        completed[taskIndex] = true;

        return true;
    }

    public static boolean removeTask(int taskID) {

        int taskIndex = findTaskById(taskID);

        if (taskIndex == -1) {
            return false;
        }

        descriptions[taskIndex] = null;
        completed[taskIndex] = false;
        taskIds[taskIndex] = 0;

        return true;
    }

    public static void viewIncompleteTasks() {

        for (int i = 0; i < descriptions.length; i++) {

            if (descriptions[i] != null && !completed[i]) {

                System.out.println(
                    "Task [description=" + descriptions[i]
                    + ", isCompleted=" + completed[i]
                    + ", taskID=" + taskIds[i] + "]"
                );
            }
        }
    }
}