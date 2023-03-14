package com.example.familybackend.controller;

import com.example.familybackend.entity.Meet;
import com.example.familybackend.entity.Team;
import com.example.familybackend.model.request.*;
import com.example.familybackend.model.response.*;
import com.example.familybackend.repository.MeetRepository;
import com.example.familybackend.repository.TeamRepository;
import com.example.familybackend.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin()
@RequestMapping("/mobile/api")
public class FamilyController {

    @Autowired
    FamilyService familyService;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    MeetRepository meetRepository;

    @GetMapping("/build")
    String build(){
        Team mayarTeam = new Team(
                "فريق ميار","ميار","وليد","1","1"
        );
        Team amjadTeam = new Team(
                "فريق أمجد","أمجد","خالد","1","1"
        );
        Team mjdTeam = new Team(
                "فريق مجد","مجد","فؤاد","1","1"
        );
        Team daniTeam = new Team(
                "فريق داني","داني","ابي","1","1"
        );
        Team makramTeam = new Team(
                "فريق مكرم","مكرم","راني","1","1"
        );
        teamRepository.save(mayarTeam);
        teamRepository.save(amjadTeam);
        teamRepository.save(mjdTeam);
        teamRepository.save(daniTeam);
        teamRepository.save(makramTeam);
        return "Done";
    }

    @GetMapping("/get-all-meet")
    ArrayList<AllMeetsResponse> getAllMeets(){
        return familyService.getAllMeets();
    }

    @PostMapping("/new-meet")
    AddMeetResponse addMeet(@RequestBody AddMeetRequest addMeetRequest){
       return familyService.addMeet(addMeetRequest);

    }

    @PostMapping("/meet-results")
    MeetResultsResponse meetResults(@RequestBody MeetResultRequest meetResultRequest){
        return familyService.meetResults(meetResultRequest);
    }
    @PostMapping("/get-one-meet")
    OneMeetResponse getOneMeet(@RequestBody OneMeetRequest oneMeetRequest){
        return familyService.getOneMeet(oneMeetRequest);
    }

    @GetMapping("get-all-teams")
    AllTeamsResponse getAllTeams(){
        return familyService.getAllTeams();
    }

    @PostMapping("/get-all-meet-for-team")
    AllMeetForTeamResponse getAllMeetForTeam(@RequestBody AllMeetForTeamRequest allMeetForTeamRequest){
        return familyService.getAllMeetForTeam(allMeetForTeamRequest);
    }

}
