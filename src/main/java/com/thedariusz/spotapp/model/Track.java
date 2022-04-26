package com.thedariusz.spotapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record Track(
        Album album,
        List<Artist> artists,
        @JsonProperty("duration_ms")
        int durationMs,
        @JsonProperty("external_urls")
        ExternalUrl externalUrl,
        String id,
        String name,
        String type,
        int popularity

) {
}
