package com.example.familybackend.model.request;

public class AllMeetForTeamRequest {
    String teamId;

    public AllMeetForTeamRequest(String teamId) {
        this.teamId = teamId;
    }

    public AllMeetForTeamRequest() {
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}
