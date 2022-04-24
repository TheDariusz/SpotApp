package com.thedariusz.spotapp.spotify;

import com.thedariusz.spotapp.model.Playlist;
import com.thedariusz.spotapp.model.PlaylistsResponse;
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


}
