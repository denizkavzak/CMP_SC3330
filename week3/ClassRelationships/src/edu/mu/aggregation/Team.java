package edu.mu.aggregation;

public class Team {
	private String name;
    private Player[] players;
    private int playerCount;

    public Team(String name) {
        this.name = name;
        this.players = new Player[5];
        this.playerCount = 0;
    }

    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
        }
    }

    public void showPlayers() {
        System.out.println("Team: " + name);

        for (int i = 0; i < playerCount; i++) {
            System.out.println(players[i].getName());
        }
    }
}
