package com.example.familybackend.model.response;

import com.example.familybackend.entity.Meet;

public class TeamMeetWithDate {
    MeetForOneTeam meet;

    String teamName;

    String team1Name;
    String team2Name;
    String team3Name;
    String team4Name;

    String team1Score;
    String team2Score;
    String team3Score;
    String team4Score;

    public TeamMeetWithDate() {
    }

    public TeamMeetWithDate(MeetForOneTeam meet, String teamName, String team1Name, String team2Name, String team3Name, String team4Name, String team1Score, String team2Score, String team3Score, String team4Score) {
        this.meet = meet;
        this.teamName = teamName;
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.team3Name = team3Name;
        this.team4Name = team4Name;
        this.team1Score = team1Score;
        this.team2Score = team2Score;
        this.team3Score = team3Score;
        this.team4Score = team4Score;
    }

    public MeetForOneTeam getMeet() {
        return meet;
    }

    public void setMeet(MeetForOneTeam meet) {
        this.meet = meet;
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

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam2Name(String team2Name) {
        this.team2Name = team2Name;
    }

    public String getTeam3Name() {
        return team3Name;
    }

    public void setTeam3Name(String team3Name) {
        this.team3Name = team3Name;
    }

    public String getTeam4Name() {
        return team4Name;
    }

    public void setTeam4Name(String team4Name) {
        this.team4Name = team4Name;
    }

    public String getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(String team1Score) {
        this.team1Score = team1Score;
    }

    public String getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(String team2Score) {
        this.team2Score = team2Score;
    }

    public String getTeam3Score() {
        return team3Score;
    }

    public void setTeam3Score(String team3Score) {
        this.team3Score = team3Score;
    }

    public String getTeam4Score() {
        return team4Score;
    }

    public void setTeam4Score(String team4Score) {
        this.team4Score = team4Score;
    }
}

