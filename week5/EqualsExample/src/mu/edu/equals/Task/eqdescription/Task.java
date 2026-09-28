package mu.edu.equals.Task.eqdescription;

public class Task {
 
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
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

        return description.equals(other.description);
    }

    /*
     * When we Override equals, we also need to 
     * Override the hashCode() consistently:
     */
//    @Override
//    public int hashCode() {
//        return description.hashCode();
//    }

    
}
