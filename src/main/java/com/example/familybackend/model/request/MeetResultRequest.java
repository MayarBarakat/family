package com.example.familybackend.model.request;

import java.util.ArrayList;

public class MeetResultRequest {
    private String meetId;
    private ArrayList<TeamScoreRequest> teamScoreRequests;

    public MeetResultRequest() {
    }

    public MeetResultRequest(String meetId, ArrayList<TeamScoreRequest> teamScoreRequests) {
        this.meetId = meetId;
        this.teamScoreRequests = teamScoreRequests;
    }

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
    }

    public ArrayList<TeamScoreRequest> getTeamScoreRequests() {
        return teamScoreRequests;
    }

    public void setTeamScoreRequests(ArrayList<TeamScoreRequest> teamScoreRequests) {
        this.teamScoreRequests = teamScoreRequests;
    }
}
