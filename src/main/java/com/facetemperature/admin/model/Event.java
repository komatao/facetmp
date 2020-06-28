package com.facetemperature.admin.model;
import lombok.Data;

@Data
public class Event {
    private String visitName;
    private String visitCode;
    private String visitTime;
    private Double temperature;

    public void setVisitName(String name) {
        visitName = name;
    }

    public void setVisitCode(String code) {
        visitCode = code;
    }

    public void setVisitTime(String time) {
        visitTime = time;
    }

    public void setTemperature(Double temp) {
        temperature = temp;
    }
//    private long no;
//    private User user;
//    private double temperature;
//    private String inAndOut;
//    private String created;

    // public long getNo() {
    //     return no;
    // }
    //
    // public void setNo(long no) {
    //     this.no = no;
    // }
    //
    // public User getUser() {
    //     return user;
    // }
    //
    // public void setUser(User user) {
    //     this.user = user;
    // }
    //
    // public double getTemperature() {
    //     return temperature;
    // }
    //
    // public void setTemperature(double temperature) {
    //     this.temperature = temperature;
    // }
    //
    // public String getInAndOut() {
    //     return inAndOut;
    // }
    //
    // public void setInAndOut(String inAndOut) {
    //     this.inAndOut = inAndOut;
    // }
    //
    // private long no;
    // private User user;
    // private double temperature;
    // private String inAndOut;
    //
    // public String getCreated() {
    //     return created;
    // }
    //
    // public void setCreated(String created) {
    //     this.created = created;
    // }
    //
    // private String created;
    //
    // public boolean equal(Event event) {
    //     return event.getCreated().equals(this.getCreated()) && event.getUser().getId().equals(this.getUser().getId());
    // }
}
