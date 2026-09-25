package edu.mu.MediaSystem_v3;

public class Song extends MediaItem implements Downloadable{

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

	@Override
	public void download() {
        System.out.println(
                "Downloading song: " + getTitle()
            );
	}
}
