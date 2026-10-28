package edu.mu.scoreboard;

public class Main {

	public static void main(String[] args) {
		Scoreboard.getInstance().addPoint();

		System.out.println(
		    Scoreboard.getInstance().getScore()
		);
	}

}
