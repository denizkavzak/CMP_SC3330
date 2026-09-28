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
		
	}

}
