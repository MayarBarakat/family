package com.example.familybackend.entity;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Entity(name = "Team")
@Table(name = "team")

public class Team {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    public Long teamId;

    private String teamName;
    private String nameOne;
    private String nameTwo;
    private String score;
    private String rank;

    @OneToMany(mappedBy = "team")
    private List<TeamMeet> teamMeets = new ArrayList<>();
    @Column
    @CreationTimestamp
    private LocalDateTime createDateTime;

    @Column
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    public Team(String teamName, String nameOne, String nameTwo, String score, String rank) {
        this.teamName = teamName;
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
        this.score = score;
        this.rank = rank;
    }

    public List<TeamMeet> getTeamMeets() {
        return teamMeets;
    }

    public void setTeamMeets(List<TeamMeet> teamMeets) {
        this.teamMeets = teamMeets;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public Team() {
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getNameOne() {
        return nameOne;
    }

    public void setNameOne(String nameOne) {
        this.nameOne = nameOne;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (teamId == null || obj == null || getClass() != obj.getClass())
//            return false;
//        Team that = (Team) obj;
//        return teamId.equals(that.teamId);
//    }
//    @Override
//    public int hashCode() {
//        return teamId == null ? 0 : teamId.hashCode();
//    }

}
