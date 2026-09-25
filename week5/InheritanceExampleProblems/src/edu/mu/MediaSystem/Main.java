package edu.mu.MediaSystem;

public class Main {

	public static void main(String[] args) {
		
		MediaItem[] library = {
			    new Song("Yellow", 260, "Coldplay"),
			    new PodcastEpisode("Java Talk", 1800, "Alice"),
			    new Movie("Interstellar", 10140, "Christopher Nolan")
			};

			for (MediaItem item : library) {
			    item.play();
			}
	}

}
