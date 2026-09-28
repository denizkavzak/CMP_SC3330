package mu.edu.equals.Task.eqhash;

import java.util.Objects;

public class TaksDetailed {
	private int id;
	private String description;
	private boolean completed;

    public TaksDetailed(int ID, String description) {
    	this.id = ID;
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

        TaksDetailed other = (TaksDetailed) obj;

        return id == other.id
            && completed == other.completed
            && Objects.equals(description, other.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, completed);
    }

    /*
     * When we Override equals, we also need to 
     * Override the hashCode() consistently:
     */
//    @Override
//    public int hashCode() {
//        // return Objects.hash(description);
//    	return description.hashCode();
//    	// can throw a NullPointerException if description is null.
//    }

    /***
     * Objects.equals(null, null)        // true
	 * Objects.equals("A", null)         // false
	 * Objects.equals("A", "A")          // true
     */
}
