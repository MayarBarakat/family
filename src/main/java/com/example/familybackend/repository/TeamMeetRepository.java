package com.example.familybackend.repository;

import com.example.familybackend.entity.Meet;
import com.example.familybackend.entity.Team;
import com.example.familybackend.entity.TeamMeet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamMeetRepository extends JpaRepository<TeamMeet, Long> {

    public List<TeamMeet> findAllByTeam(Team team);
    public List<TeamMeet> findAllByMeet(Meet meet);
    public TeamMeet findTeamMeetByTeamAndMeet(Team teamId, Meet meetId);
}
