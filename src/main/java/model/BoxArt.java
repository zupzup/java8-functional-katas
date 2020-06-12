package model;

import java.util.Objects;

public class BoxArt {
    private Integer width;
    private Integer height;
    private String url;

    public BoxArt() {
    }

    public BoxArt(Integer width, Integer height, String uri) {
        this.width = width;
        this.height = height;
        this.url = uri;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoxArt boxArt = (BoxArt) o;
        return Objects.equals(width, boxArt.width) &&
                Objects.equals(height, boxArt.height) &&
                Objects.equals(url, boxArt.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, url);
    }
}
