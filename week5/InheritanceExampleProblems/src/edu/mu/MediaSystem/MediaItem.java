package edu.mu.MediaSystem;

public abstract class MediaItem {
    private String title;
    private int duration;

    public MediaItem(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public abstract void play();
}
