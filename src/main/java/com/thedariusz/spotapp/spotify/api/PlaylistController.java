package com.thedariusz.spotapp.spotify.api;

import com.thedariusz.spotapp.model.Playlist;
import com.thedariusz.spotapp.spotify.SpotifyClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spotify/playlist")
public class PlaylistController {
    private final SpotifyClient spotifyClient;

    public PlaylistController(SpotifyClient spotifyClient) {
        this.spotifyClient = spotifyClient;
    }

    @RequestMapping("/{userId}")
    public List<Playlist> getPlaylist(@PathVariable("userId") String userId) {
        return spotifyClient.fetchPlaylists(userId);
    }
}
