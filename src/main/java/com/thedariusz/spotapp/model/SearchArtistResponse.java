package com.thedariusz.spotapp.model;

import java.util.List;

public record SearchArtistResponse(
        Artists artists
) {
    private record Artists(
            String href,
            List<Artist> items,
            String next,
            String previous,
            int total
    ) {
    }
}
