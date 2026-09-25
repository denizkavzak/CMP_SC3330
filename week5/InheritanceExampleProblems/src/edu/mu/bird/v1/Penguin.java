package edu.mu.bird.v1;

public class Penguin extends Bird{
    @Override
	public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}
