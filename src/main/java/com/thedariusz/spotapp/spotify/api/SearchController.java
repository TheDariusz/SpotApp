package com.thedariusz.spotapp.spotify.api;

import com.thedariusz.spotapp.model.SearchResponse;
import com.thedariusz.spotapp.spotify.SpotifyClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/search")
public class SearchController {

    private final SpotifyClient spotifyClient;

    public SearchController(SpotifyClient spotifyClient) {
        this.spotifyClient = spotifyClient;
    }

    @GetMapping("/track/{trackTitle}/artist/{artistName}")
    public SearchResponse getSearchTrack(@PathVariable("trackTitle") String trackTitle, @PathVariable("artistName") String artistName) {
       return spotifyClient.searchTrack(trackTitle, artistName);
    }

}
