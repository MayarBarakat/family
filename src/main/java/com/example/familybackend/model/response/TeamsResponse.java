package com.example.familybackend.model.response;

public class TeamsResponse {
    String teamId;
    String teamName;

    String player1Name;
    String player2Name;

    String rank;
    String score;

    public TeamsResponse() {
    }

    public TeamsResponse(String teamId, String teamName, String player1Name, String player2Name, String rank, String score) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.rank = rank;
        this.score = score;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
