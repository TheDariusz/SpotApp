package com.thedariusz.spotapp;

import com.thedariusz.spotapp.spotify.SpotifyClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpotAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpotAppApplication.class, args);
    }

    @Bean
    SpotifyClient spotifyClient(WebClient webClient) {
        return new SpotifyClient(webClient);
    }

}
