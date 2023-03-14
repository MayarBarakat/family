package com.example.familybackend.model.response;

import com.example.familybackend.entity.Team;

import java.util.ArrayList;

public class AllTeamsResponse {
    ArrayList<TeamsResponse> teams;

    public AllTeamsResponse() {

    }

    public AllTeamsResponse(ArrayList<TeamsResponse> teams) {
        this.teams = teams;
    }

    public ArrayList<TeamsResponse> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<TeamsResponse> teams) {
        this.teams = teams;
    }
}
