package mu.edu.equals.contains;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Task t = new Task("Clean");
		Student s = new Student(1, "Deniz");
		
		t.equals(s);
		
		List<Task> tasks = new ArrayList<>();

		tasks.add(new Task("Study"));

		Task t2 = new Task("Study");
		
		System.out.println(tasks.contains(t2));
		
		boolean found = false;
		for(Task task : tasks) {
			if (task.equals(t2)) {
				found = true;
				break;
			}
		}
		if(found == true) {
			System.out.println("Found");
		}else {
			System.out.println("Not found");
		}
		
		tasks.indexOf(new Task("Study"));
		tasks.lastIndexOf(new Task("Study"));
		tasks.remove(new Task("Study"));
		
		
		List<Task> tasks2 = new ArrayList<>();

		tasks2.add(new Task("Study"));
		tasks2.add(new Task("Exercise"));

		System.out.println(
		    tasks2.contains(new Task("Study"))
		); // true

		System.out.println(
		    tasks2.indexOf(new Task("Exercise"))
		); // 1

		tasks2.remove(new Task("Study"));
		
	}

}
