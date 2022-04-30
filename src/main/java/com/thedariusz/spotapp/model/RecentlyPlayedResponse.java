package com.thedariusz.spotapp.model;

import java.util.List;

public record RecentlyPlayedResponse(
        List<TracksResponse> items,
        String next,
        ResponseCursor cursor,
        int limit
) {
    private record ResponseCursor(
            String after,
            String before
    ) {
    }
}
