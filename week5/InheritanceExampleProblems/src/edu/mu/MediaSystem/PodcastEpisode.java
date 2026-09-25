package edu.mu.MediaSystem;

public class PodcastEpisode extends MediaItem {

    private String host;

    public PodcastEpisode(
            String title,
            int duration,
            String host) {

        super(title, duration);
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println(
            "Playing podcast: " + getTitle()
            + " hosted by " + host
        );
    }
}
