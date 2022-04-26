package com.thedariusz.spotapp.spotify.api;

import com.thedariusz.spotapp.model.RecentlyPlayedResponse;
import com.thedariusz.spotapp.spotify.SpotifyClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/tracks")
public class TracksController {

    private final SpotifyClient spotifyClient;

    public TracksController(SpotifyClient spotifyClient) {
        this.spotifyClient = spotifyClient;
    }

    @GetMapping("/recently")
    public RecentlyPlayedResponse getRecentTracks() {
        return spotifyClient.fetchRecentTracks();
    }
}
