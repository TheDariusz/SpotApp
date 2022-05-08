package com.thedariusz.spotapp.spotify.api;

import com.thedariusz.spotapp.model.SearchArtistResponse;
import com.thedariusz.spotapp.model.SearchTrackResponse;
import com.thedariusz.spotapp.spotify.SpotifyClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/spotify/search")
public class SearchController {

    private final SpotifyClient spotifyClient;

    public SearchController(SpotifyClient spotifyClient) {
        this.spotifyClient = spotifyClient;
    }

    @GetMapping("/track")
    public SearchTrackResponse getSearchArtistAndTrack(@RequestParam(name = "title") String trackTitle,
                                                       @RequestParam(name = "artist") Optional<String> artistName) {
        return spotifyClient.searchArtistAndTrack(trackTitle, artistName);
    }

    @GetMapping("/artist")
    public SearchArtistResponse getSearchArtist(@RequestParam(name = "name") String artistName) {
        return spotifyClient.searchArtist(artistName);
    }

}
