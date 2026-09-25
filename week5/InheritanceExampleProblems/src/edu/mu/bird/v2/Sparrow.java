package edu.mu.bird.v2;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }
}