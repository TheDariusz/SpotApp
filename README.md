# Spotify client service
The application allows to communicate with your Spotify account in order to get information about your playlists, tracks.
It also allows to search a specific artist, a song or an album.
The results of interaction are transferred by REST api

# Development
### Prerequisites
JDK 17, Docker, Thymeleaf, Spring-Boot

### Running locally in IntelliJ
1. Run java main function inside SpotApplication class
3. Open: [HOME](http://localhost:8081/home)

### Running on server

[//]: # ([https://ytapp-339922-crzmcsu6ea-ew.a.run.app/home]&#40;https://ytapp-339922-crzmcsu6ea-ew.a.run.app/home&#41;)

[//]: # (1. Run `./run-in-docker`)

[//]: # (2. Open: http://localhost:8080/home)

## Deployment
### Test environment
CI process with  GitHub Actions

### Production environment
Google Cloud Run on Google Cloud Platform

Deployment through CD process with GitHub Actions  

# Technical debt / TODO
- [ ] Spotify API handling
