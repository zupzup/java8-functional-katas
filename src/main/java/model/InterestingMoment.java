package model;


import java.util.Date;

public class InterestingMoment {
    private String type;
    private Date time;

    public InterestingMoment(String type, Date time) {
        this.type = type;
        this.time = time;
    }

    public InterestingMoment() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
