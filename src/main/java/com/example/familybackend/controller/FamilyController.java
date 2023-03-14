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



    @GetMapping("/build")
    String build(){
       return familyService.build();
       
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
