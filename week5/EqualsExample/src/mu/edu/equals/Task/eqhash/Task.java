package mu.edu.equals.Task.eqhash;

import java.util.Objects;

public class Task {
 
	int taskID;
	private String description;
	static int ID = 0;

    public Task(String description) {
    	ID++;
    	this.taskID = ID;
        this.description = description;
    }
    
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

        return Objects.equals(description,other.description);
        //return description.equals(other.description);
        // can throw a NullPointerException if description is null.
    }

    /*
     * When we Override equals, we also need to 
     * Override the hashCode() consistently:
     */
    @Override
    public int hashCode() {
        return Objects.hash(description);
    	//return description.hashCode();
    	// can throw a NullPointerException if description is null.
    }

    /***
     * Objects.equals(null, null)        // true
	 * Objects.equals("A", null)         // false
	 * Objects.equals("A", "A")          // true
     */
    
}
