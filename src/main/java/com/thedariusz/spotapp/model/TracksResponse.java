package com.thedariusz.spotapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TracksResponse(
        Track track,
        @JsonProperty("played_at")
        String playedAt,
        TrackContext context

) {
    private record TrackContext(
            String href,
            String type,
            String uri
    ) {
    }
}
