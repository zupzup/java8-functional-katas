package model;

import java.util.List;

public class Movie {

    private Integer id;
    private String title;
    private String boxart;
    private Double rating;
    private List bookmark;

    public Movie() {
    }

    public Movie(Integer id, String title, String boxart, Double rating, List bookmark) {
        this.id = id;
        this.title = title;
        this.boxart = boxart;
        this.rating = rating;
        this.bookmark = bookmark;
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

    public String getBoxart() {
        return boxart;
    }

    public void setBoxart(String boxart) {
        this.boxart = boxart;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List getBookmark() {
        return bookmark;
    }

    public void setBookmark(List bookmark) {
        this.bookmark = bookmark;
    }
}
