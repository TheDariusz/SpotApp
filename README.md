# Spotify client service
The application allows to communicate with your Spotify account in order to get information about your playlists, tracks.
It also allows to search a specific artist, a song or an album.
The results of interaction are transferred by REST api

# Development
### Prerequisites
JDK 17, Docker, Thymeleaf, Spring-Boot

### Running locally in IntelliJ
1. Run java main function inside SpotApplication class
3. To get a specific user list of playlists: [/spotify/playlist/{spotify_user_id}](http://localhost:8081/spotify/playlist/userId)

### Running on server

in progress

[//]: # (1. Run `./run-in-docker`)

[//]: # (2. Open: http://localhost:8080/home)

## Deployment
### Test environment
CI process with  GitHub Actions

### Production environment
Google Cloud Run on Google Cloud Platform

Deployment through CD process with GitHub Actions  

# Technical debt / TODO
- [ ] to do list
