package edu.mu.MediaSystem_v3;

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
	
		Playlist playlist = new Playlist("Road Trip", 5);

		playlist.add(new Song("Yellow", 260, "Coldplay"));
		playlist.add(new PodcastEpisode("Java Talk", 1800, "Alice"));

		playlist.playAll();
		
	}

}
