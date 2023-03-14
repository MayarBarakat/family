package com.example.familybackend.model.response;

public class MeetForOneTeam {
    String meetId;
    String date;

    public MeetForOneTeam(String meetId, String date) {
        this.meetId = meetId;
        this.date = date;
    }

    public MeetForOneTeam() {
    }

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
