package com.thedariusz.spotapp.model;

import java.util.List;

public record PlaylistsResponse(
        String href,
        List<Playlist> items,
        int limit,
        String next,
        String previous,
        int total
) {
    private record Playlist(
            String description,
            String href,
            String id,
            String name
    ) {
    }
}
