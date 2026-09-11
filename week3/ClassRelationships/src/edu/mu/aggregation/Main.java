package edu.mu.aggregation;

public class Main {

	public static void main(String[] args) {
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");

        Team team = new Team("Tigers");

        // player objects already exist
        team.addPlayer(p1);
        team.addPlayer(p2);

        team.showPlayers();
	}

}
