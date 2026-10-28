package edu.mu.lsp.bird;

public class Main {

	public static void makeBirdFly(Bird bird) {
	    bird.fly();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeBirdFly(new Penguin());
	}

}
