package com.example.familybackend.model.request;

public class OneMeetRequest {
    String meetId;

    public OneMeetRequest() {
    }

    public OneMeetRequest(String meetId) {
        this.meetId = meetId;
    }

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
    }
}
