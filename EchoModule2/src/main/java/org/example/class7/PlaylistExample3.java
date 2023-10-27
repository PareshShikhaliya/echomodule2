package org.example.class7;

import java.util.ArrayList;
import java.util.List;

class Media {}

class Song extends Media {
    // Song-specific properties and methods
}

class Video extends Media {
    // Video-specific properties and methods
}

public class PlaylistExample3
{
    public static void main(String[] args) {
        List<Media> playlist = new ArrayList<>();
        playlist.add(new Song());
        playlist.add(new Video());
        playlist.add(new Song());

        for (Media media : playlist)
        {
            if (media instanceof Song)
            {
                System.out.println("Playing a song");
            } else if (media instanceof Video)
            {
                System.out.println("Playing a video");
            }
        }
    }
}
