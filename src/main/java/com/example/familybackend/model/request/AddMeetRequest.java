package com.example.familybackend.model.request;

public class AddMeetRequest {
    String date;

    public AddMeetRequest() {
    }

    public AddMeetRequest(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
