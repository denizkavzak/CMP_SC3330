package edu.mu.generics.box;

public class StudentBox {
    private Student value;

    public StudentBox(Student value) {
        this.value = value;
    }

    public Student getValue() {
        return value;
    }
}
