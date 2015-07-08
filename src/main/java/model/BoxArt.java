package model;

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
}
