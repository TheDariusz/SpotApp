package com.thedariusz.spotapp.spotify;

import com.thedariusz.spotapp.model.*;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SpotifyClient {

    private final WebClient webClient;

    public SpotifyClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Playlist> fetchPlaylists(String userId) {
        String uri = "https://api.spotify.com/v1/users/" + userId + "/playlists";

        PlaylistsResponse response = webClient
                .method(HttpMethod.GET)
                .uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(PlaylistsResponse.class)
                .block();
        return response != null ? response.items() : Collections.emptyList();
    }


    public RecentlyPlayedResponse fetchRecentTracks() {
        String uri = "https://api.spotify.com/v1/me/player/recently-played";

        return webClient
                .method(HttpMethod.GET)
                .uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(RecentlyPlayedResponse.class)
                .block();
    }

    public SearchTrackResponse searchArtistAndTrack(String trackTitle, Optional<String> artistName) {
        String uri = "https://api.spotify.com/v1/search?type=track&q=track:" + trackTitle;
        if (artistName.isPresent()) {
            uri = uri + "+artist:" + artistName.get();
        }

        return webClient
                .method(HttpMethod.GET)
                .uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(SearchTrackResponse.class)
                .block();
    }

    public SearchArtistResponse searchArtist(String artistName) {
        String uri = "https://api.spotify.com/v1/search?type=artist&q=artist:" + artistName;
        return webClient
                .method(HttpMethod.GET)
                .uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(SearchArtistResponse.class)
                .block();
    }
}
