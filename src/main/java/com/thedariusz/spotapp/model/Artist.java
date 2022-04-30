package com.thedariusz.spotapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Artist(
        @JsonProperty("external_urls")
        ExternalUrl externalUrl,
        String id,
        String name,
        String type,
        String uri,
        String href
) {
}
