package com.example.familybackend.model.response;

import com.example.familybackend.entity.TeamMeet;

import java.util.ArrayList;

public class AllMeetForTeamResponse {
    ArrayList<TeamMeetWithDate> teamMeetsWithDate;

    public AllMeetForTeamResponse() {
    }

    public AllMeetForTeamResponse(ArrayList<TeamMeetWithDate> teamMeetsWithDate) {
        this.teamMeetsWithDate = teamMeetsWithDate;
    }

    public ArrayList<TeamMeetWithDate> getTeamMeetsWithDate() {
        return teamMeetsWithDate;
    }

    public void setTeamMeetsWithDate(ArrayList<TeamMeetWithDate> teamMeetsWithDate) {
        this.teamMeetsWithDate = teamMeetsWithDate;
    }
}
