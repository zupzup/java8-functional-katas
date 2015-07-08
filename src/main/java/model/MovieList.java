package model;

import java.util.List;

public class MovieList {
    private String name;
    private List<Movie> videos;

    public MovieList() {
    }

    public MovieList(String name, List<Movie> videos) {
        this.name = name;
        this.videos = videos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getVideos() {
        return videos;
    }

    public void setVideos(List<Movie> videos) {
        this.videos = videos;
    }
}
