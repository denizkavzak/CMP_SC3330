package mu.edu.equals.Task.eqID;

public class Task {
 
	int taskID;
	private String description;
//	static int ID = 0;

//    public Task(String description) {
//    	ID++;
//    	this.taskID = ID;
//        this.description = description;
//    }
    
    public Task(int ID, String description) {
    	this.taskID = ID;
        this.description = description;
    }
    
    public String getDescription() {
    	return description;
    }
    
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Task)) {
            return false;
        }

        Task other = (Task) obj;

        return (this.taskID == other.taskID);
    }
    
    /*
     * When we Override equals, we also need to 
     * Override the hashCode() consistently:
     */
//    @Override
//    public int hashCode() {
//    	return Integer.hashCode(taskID);
//    }
    
}
