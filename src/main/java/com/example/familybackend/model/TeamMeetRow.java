package com.example.familybackend.model;

public class TeamMeetRow {
    String teamName;

    String team1Name;
    String team1State;

    String team2Name;
    String team2State;

    String team3Name;
    String team3State;

    String team4Name;
    String team4State;

    public TeamMeetRow(String teamName, String team1Name, String team1State, String team2Name, String team2State, String team3Name, String team3State, String team4Name, String team4State) {
        this.teamName = teamName;
        this.team1Name = team1Name;
        this.team1State = team1State;
        this.team2Name = team2Name;
        this.team2State = team2State;
        this.team3Name = team3Name;
        this.team3State = team3State;
        this.team4Name = team4Name;
        this.team4State = team4State;
    }

    public TeamMeetRow() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public void setTeam1Name(String team1Name) {
        this.team1Name = team1Name;
    }

    public String getTeam1State() {
        return team1State;
    }

    public void setTeam1State(String team1State) {
        this.team1State = team1State;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam2Name(String team2Name) {
        this.team2Name = team2Name;
    }

    public String getTeam2State() {
        return team2State;
    }

    public void setTeam2State(String team2State) {
        this.team2State = team2State;
    }

    public String getTeam3Name() {
        return team3Name;
    }

    public void setTeam3Name(String team3Name) {
        this.team3Name = team3Name;
    }

    public String getTeam3State() {
        return team3State;
    }

    public void setTeam3State(String team3State) {
        this.team3State = team3State;
    }

    public String getTeam4Name() {
        return team4Name;
    }

    public void setTeam4Name(String team4Name) {
        this.team4Name = team4Name;
    }

    public String getTeam4State() {
        return team4State;
    }

    public void setTeam4State(String team4State) {
        this.team4State = team4State;
    }
}
