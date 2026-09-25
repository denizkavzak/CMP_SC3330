package edu.mu.MediaSystem;

public class Song extends MediaItem {

    private String artist;

    public Song(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println(
            "Playing song: " + getTitle()
            + " by " + artist
        );
    }
}
