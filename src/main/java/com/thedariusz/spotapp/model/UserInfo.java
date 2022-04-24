package com.thedariusz.spotapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserInfo(
        @JsonProperty("display_name")
        String displayName,
        String email
) {
}
