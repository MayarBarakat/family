package com.example.familybackend.repository;

import com.example.familybackend.entity.Meet;
import com.example.familybackend.entity.Team;
import com.example.familybackend.entity.TeamMeet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMeetRepository extends JpaRepository<TeamMeet, Long> {

    public List<TeamMeet> findAllByTeam(Team team);
    public List<TeamMeet> findAllByMeet(Meet meet);
    public TeamMeet findTeamMeetByTeamAndMeet(Team teamId, Meet meetId);
}
