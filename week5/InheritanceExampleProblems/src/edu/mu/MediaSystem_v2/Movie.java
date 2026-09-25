package edu.mu.MediaSystem_v2;

public class Movie extends MediaItem implements Downloadable, Captioned{

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

	@Override
	public void download() {
        System.out.println(
                "Downloading movie: " + getTitle()
            );
	}

	@Override
	public void showCaptions() {
		System.out.println("Captions on");
	}
}