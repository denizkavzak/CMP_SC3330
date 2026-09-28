package mu.edu.equals.Task;

//import java.util.HashSet;
//import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Task t1 = new Task("Study");
        Task t2 = new Task("Study");

        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        
//        Set<Task> tasks = new HashSet<>();
//        
//        tasks.add(new Task("Study"));
//        tasks.add(new Task("Study"));
//        
//        System.out.println(tasks.size());
        
    }
}
