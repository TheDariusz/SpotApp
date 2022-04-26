package com.thedariusz.spotapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record Album(
        List<Artist> artists,

        @JsonProperty("external_urls")
        ExternalUrl externalUrl,

        String href,
        String id,
        List<CoverImage> images,
        String name,

        @JsonProperty("release_date")
        String releaseDate,

        @JsonProperty("total_tracks")
        int totalTracks,

        String type,
        String uri

) {
    private record CoverImage(
            int height,
            int weight,
            String url
    ) {
    }
}
