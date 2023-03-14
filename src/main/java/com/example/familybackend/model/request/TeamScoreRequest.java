package com.example.familybackend.model.request;

public class TeamScoreRequest {
    private String teamName;

    private String team1Name;
    private String team2Name;
    private String team3Name;
    private String team4Name;

    private int team1Result;
    private int team2Result;
    private int team3Result;
    private int team4Result;

    public TeamScoreRequest() {
    }

    public TeamScoreRequest(String teamName, String team1Name, String team2Name, String team3Name, String team4Name, int team1Result, int team2Result, int team3Result, int team4Result) {
        this.teamName = teamName;
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.team3Name = team3Name;
        this.team4Name = team4Name;
        this.team1Result = team1Result;
        this.team2Result = team2Result;
        this.team3Result = team3Result;
        this.team4Result = team4Result;
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

    public int getTeam1Result() {
        return team1Result;
    }

    public void setTeam1Result(int team1Result) {
        this.team1Result = team1Result;
    }

    public int getTeam2Result() {
        return team2Result;
    }

    public void setTeam2Result(int team2Result) {
        this.team2Result = team2Result;
    }

    public int getTeam3Result() {
        return team3Result;
    }

    public void setTeam3Result(int team3Result) {
        this.team3Result = team3Result;
    }

    public int getTeam4Result() {
        return team4Result;
    }

    public void setTeam4Result(int team4Result) {
        this.team4Result = team4Result;
    }
}
