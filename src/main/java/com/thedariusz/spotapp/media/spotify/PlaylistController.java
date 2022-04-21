package com.thedariusz.spotapp.media.spotify;

import com.thedariusz.spotapp.model.Playlist;
import com.thedariusz.spotapp.model.UserPlaylist;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spotify/playlist")
public class PlaylistController {

    @RequestMapping("/{userId}")
    public UserPlaylist getPlaylist(@PathVariable("userId") String userId) {
        List<Playlist> playlists = List.of(
                new Playlist("1", "my playlist 1", "some playlist 1"),
                new Playlist("2", "my playlist 2", "some playlist 2")
        );
        return new UserPlaylist(userId, playlists);
    }
}
