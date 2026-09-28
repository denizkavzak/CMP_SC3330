package mu.edu.equals.Task.eqhash;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Task t1 = new Task("Study");
		Task t2 = new Task("Study");

		System.out.println(t1.equals(t2));
		
		HashSet<Task> tasks = new HashSet<>();
		tasks.add(t1);
		tasks.add(t2);
		
		System.out.println(tasks.size());
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		// HashSet shouldn't have duplicates!
		// Override hashCode() to fix this
		for(Task task : tasks) {
			System.out.println(task.getDescription());
		}
		
	}

}
