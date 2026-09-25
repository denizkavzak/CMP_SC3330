package edu.mu.MediaSystem_v3;

public class Playlist {

    private String name;
    private MediaItem[] items;
    private int count;

    public Playlist(String name, int capacity) {
        this.name = name;
        this.items = new MediaItem[capacity];
    }

    public boolean add(MediaItem item) {
        if (count >= items.length) {
            return false;
        }

        items[count++] = item;
        return true;
    }

    public void playAll() {
        for (int i = 0; i < count; i++) {
            items[i].play();
        }
    }
}
