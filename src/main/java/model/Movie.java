package model;

import java.util.List;

public class Movie {

    private Integer id;
    private String title;
    private List<BoxArt> boxarts;
    private String uri;
    private Double rating;
    private List<Bookmark> bookmark;
    private List<InterestingMoment> interestingMoments;

    public Movie() {
    }

    public Movie(Integer id, String title, List<BoxArt> boxarts, String uri, Double rating, List<Bookmark> bookmark, List<InterestingMoment> interestingMoments) {
        this.id = id;
        this.title = title;
        this.boxarts = boxarts;
        this.uri = uri;
        this.rating = rating;
        this.bookmark = bookmark;
        this.interestingMoments = interestingMoments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<BoxArt> getBoxarts() {
        return boxarts;
    }

    public void setBoxarts(List<BoxArt> boxarts) {
        this.boxarts = boxarts;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List<Bookmark> getBookmark() {
        return bookmark;
    }

    public void setBookmark(List<Bookmark> bookmark) {
        this.bookmark = bookmark;
    }

    public List<InterestingMoment> getInterestingMoments() {
        return interestingMoments;
    }

    public void setInterestingMoments(List<InterestingMoment> interestingMoments) {
        this.interestingMoments = interestingMoments;
    }
}
