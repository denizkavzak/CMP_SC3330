package edu.mu.bird.v2;

public class Eagle extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Eagle flying");
    }
}
