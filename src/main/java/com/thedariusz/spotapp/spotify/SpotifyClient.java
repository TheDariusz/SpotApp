package com.thedariusz.spotapp.spotify;

import com.thedariusz.spotapp.model.Playlist;
import com.thedariusz.spotapp.model.PlaylistsResponse;
import com.thedariusz.spotapp.model.RecentlyPlayedResponse;
import com.thedariusz.spotapp.model.SearchResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;

public class SpotifyClient {

    private final WebClient webClient;

    public SpotifyClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Playlist> fetchPlaylists(String userId) {
        String uri = "https://api.spotify.com/v1/users/"+userId+"/playlists";

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

    public SearchResponse searchTrack(String trackTitle, String artistName) {
        String uri = "https://api.spotify.com/v1/search?type=track&q=artist:"
                +artistName+"+track:"
                +trackTitle;
        return webClient
                .method(HttpMethod.GET)
                .uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(SearchResponse.class)
                .block();
    }
}
