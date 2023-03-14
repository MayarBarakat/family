package com.example.familybackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "TeamMeet")
@Table(name = "team_meet")

public class TeamMeet {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    public Long team_meet_id;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    private Team team;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meetId")
    private Meet meet;


    private String team1Name;
    private String team2Name;
    private String team3Name;
    private String team4Name;
    private int team1Score;
    private int team2Score;
    private int team3Score;
    private int team4Score;

    @Column
    @CreationTimestamp
    private LocalDateTime createDateTime;

    @Column
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public TeamMeet() {
    }

    public TeamMeet( Team team, Meet meet, String team1Name, String team2Name, String team3Name, String team4Name, int team1Score, int team2Score, int team3Score, int team4Score) {
        this.team = team;
        this.meet = meet;
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.team3Name = team3Name;
        this.team4Name = team4Name;
        this.team1Score = team1Score;
        this.team2Score = team2Score;
        this.team3Score = team3Score;
        this.team4Score = team4Score;
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

    public int getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }

    public int getTeam3Score() {
        return team3Score;
    }

    public void setTeam3Score(int team3Score) {
        this.team3Score = team3Score;
    }

    public int getTeam4Score() {
        return team4Score;
    }

    public void setTeam4Score(int team4Score) {
        this.team4Score = team4Score;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Meet getMeet() {
        return meet;
    }

    public void setMeet(Meet meet) {
        this.meet = meet;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        if (o == null || getClass() != o.getClass())
//            return false;
//
//        TeamMeet that = (TeamMeet) o;
//        return Objects.equals(team, that.team) &&
//                Objects.equals(meet, that.meet);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(team, meet);
//    }

}
