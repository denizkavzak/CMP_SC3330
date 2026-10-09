package edu.mu.testing.grade.main;

public class Grade {

    private int score;

    public Grade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException();
        }

        this.score = score;
    }

    public boolean isPassing() {
        return score >= 60;
    }
}
