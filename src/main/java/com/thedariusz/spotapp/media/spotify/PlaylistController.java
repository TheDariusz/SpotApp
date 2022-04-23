package com.thedariusz.spotapp.media.spotify;

import com.thedariusz.spotapp.model.UserInfo;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/spotify/playlist")
public class PlaylistController {
    private final WebClient webClient;

    public PlaylistController(WebClient webClient) {
        this.webClient = webClient;
    }

    @RequestMapping("/{userId}")
    public UserInfo getPlaylist(@PathVariable("userId") String userId) {
        String uri = "https://api.spotify.com/v1/me";

        return webClient
                .method(HttpMethod.GET)
                .uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(UserInfo.class)
                .block();
    }
}
