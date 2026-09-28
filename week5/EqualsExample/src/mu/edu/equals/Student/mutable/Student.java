package mu.edu.equals.Student.mutable;

public class Student {

    private int id;
    private String name;
    private static int ID_count = 0;

    public Student(String name) {
        ID_count ++;
    	this.id = ID_count;
        this.name = name;
    }
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}