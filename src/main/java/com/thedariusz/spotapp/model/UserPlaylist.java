package com.thedariusz.spotapp.model;

import java.util.List;

public record UserPlaylist(
        String userId,
        List<Playlist> playlist
) {
}
