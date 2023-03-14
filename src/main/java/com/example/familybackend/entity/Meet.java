package com.example.familybackend.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "Meet")
@Table(name = "family_meet")
public class Meet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long meetId;

    private String date;

    @OneToMany(mappedBy = "meet")
    private List<TeamMeet> teamMeetSet = new ArrayList<>();

    public List<TeamMeet> getTeamMeetSet() {
        return teamMeetSet;
    }

    public void setTeamMeetSet(List<TeamMeet> teamMeetSet) {
        this.teamMeetSet = teamMeetSet;
    }

    @Column
    @CreationTimestamp
    private LocalDateTime createDateTime;

    @Column
    @UpdateTimestamp
    private LocalDateTime updateDateTime;


    public Meet() {
    }

    public Meet(String date) {
        this.date = date;
    }

    public Long getMeetId() {
        return meetId;
    }

    public void setMeetId(Long meetId) {
        this.meetId = meetId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (meetId == null || obj == null || getClass() != obj.getClass())
//            return false;
//        Meet that = (Meet) obj;
//        return meetId.equals(that.meetId);
//    }
//    @Override
//    public int hashCode() {
//        return meetId == null ? 0 : meetId.hashCode();
//    }
}