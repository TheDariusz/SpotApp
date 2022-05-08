package com.thedariusz.spotapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

public record Artist(
        @JsonProperty("external_urls")
        ExternalUrl externalUrl,
        String id,
        String name,
        String type,
        String uri,
        String href,
        Set<String> genres,
        List<ImageResponse> images
) {
}
