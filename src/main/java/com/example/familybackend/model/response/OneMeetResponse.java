package com.example.familybackend.model.response;

import com.example.familybackend.model.TeamMeetRow;

import java.util.ArrayList;

public class OneMeetResponse {
    ArrayList<TeamMeetRow> teamMeetRows;

    public OneMeetResponse(ArrayList<TeamMeetRow> teamMeetRows) {
        this.teamMeetRows = teamMeetRows;
    }

    public OneMeetResponse() {
    }

    public ArrayList<TeamMeetRow> getTeamMeetRows() {
        return teamMeetRows;
    }

    public void setTeamMeetRows(ArrayList<TeamMeetRow> teamMeetRows) {
        this.teamMeetRows = teamMeetRows;
    }
}
