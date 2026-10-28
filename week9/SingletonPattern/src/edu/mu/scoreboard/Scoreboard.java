package edu.mu.scoreboard;

public class Scoreboard {

    private static final Scoreboard INSTANCE =
            new Scoreboard();

    private int score;

    private Scoreboard() {
        score = 0;
    }

    public static Scoreboard getInstance() {
        return INSTANCE;
    }

    public void addPoint() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
