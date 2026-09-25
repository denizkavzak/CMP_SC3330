package edu.mu.MediaSystem;

public class Movie extends MediaItem {

    private String director;

    public Movie(
            String title,
            int duration,
            String director) {

        super(title, duration);
        this.director = director;
    }

    @Override
    public void play() {
        System.out.println(
        		"Playing movie: " + getTitle() + " directed by " + director
        );
    }
}