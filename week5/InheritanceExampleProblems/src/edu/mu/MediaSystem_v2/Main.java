package edu.mu.MediaSystem_v2;

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
		
		Downloadable[] downloads = {new Song("Yellow", 260, "Coldplay"),
			    new Movie("Interstellar", 10140, "Christopher Nolan")
			    };
		
		for(Downloadable item: downloads) {
			item.download();
		}
	
	}

}
