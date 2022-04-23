package com.thedariusz.spotapp.model;

import java.util.List;

public record Playlist(
        String href,
        List<Item> items,
        int limit,
        String next,
        String previous,
        int total
) {
    private record Item(
            String description,
            String href,
            String id,
            String name
    ) {
    }
}
