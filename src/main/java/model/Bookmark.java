package model;

import java.util.Date;

public class Bookmark {

    private Integer id;
    private Date time;

    public Bookmark() {
    }

    public Bookmark(Integer id, Date time) {
        this.id = id;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
