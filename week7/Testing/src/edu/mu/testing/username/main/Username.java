package edu.mu.testing.username.main;

public class Username {

    private String value;

    public Username(String value) {
        if (value.length() < 3 || value.length() > 20) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }
}
