package com.thedariusz.spotapp.model;

import java.util.List;

public record SearchTrackResponse(
        Tracks tracks
) {
    private record Tracks(
            String href,
            List<Track> items,
            String next,
            String previous,
            int total
    ) {
    }
}
