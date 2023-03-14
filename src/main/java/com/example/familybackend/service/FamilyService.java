package com.example.familybackend.service;

import com.example.familybackend.entity.Meet;
import com.example.familybackend.entity.Team;
import com.example.familybackend.entity.TeamMeet;
import com.example.familybackend.model.TeamMeetRow;
import com.example.familybackend.model.request.*;
import com.example.familybackend.model.response.*;
import com.example.familybackend.repository.MeetRepository;
import com.example.familybackend.repository.TeamMeetRepository;
import com.example.familybackend.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FamilyService {


    TeamRepository teamRepository;


    MeetRepository meetRepository;


    TeamMeetRepository teamMeetRepository;

    public FamilyService(TeamRepository teamRepository, MeetRepository meetRepository, TeamMeetRepository teamMeetRepository) {
        this.teamRepository = teamRepository;
        this.meetRepository = meetRepository;
        this.teamMeetRepository = teamMeetRepository;
    }

    public FamilyService() {
    }

    public AddMeetResponse addMeet(AddMeetRequest addMeetRequest) {
        Meet meet = new Meet((addMeetRequest.getDate()));
        meetRepository.save(meet);
        Team mayarTeam = teamRepository.findById(1L).get();
        Team amjadTeam = teamRepository.findById(2L).get();
        Team mjdTeam = teamRepository.findById(3L).get();
        Team daniTeam = teamRepository.findById(4L).get();
        Team makramTeam = teamRepository.findById(5L).get();
        TeamMeet teamMeet1 = new TeamMeet(
                mayarTeam,
                meet,
                "فريق أمجد",
                "فريق مجد",
                "فريق داني",
                "فريق مكرم",
                0,
                0,
                0,
                0

        );
        TeamMeet teamMeet2 = new TeamMeet(
                amjadTeam,
                meet,
                "فريق ميار",
                "فريق مجد",
                "فريق داني",
                "فريق مكرم",
                0,
                0,
                0,
                0

        );
        TeamMeet teamMeet3 = new TeamMeet(
                mjdTeam,
                meet,
                "فريق ميار",
                "فريق أمجد",
                "فريق داني",
                "فريق مكرم",
                0,
                0,
                0,
                0

        );
        TeamMeet teamMeet4 = new TeamMeet(
                daniTeam,
                meet,
                "فريق ميار",
                "فريق أمجد",
                "فريق مجد",
                "فريق مكرم",
                0,
                0,
                0,
                0

        );
        TeamMeet teamMeet5 = new TeamMeet(
                makramTeam,
                meet,
                "فريق ميار",
                "فريق أمجد",
                "فريق مجد",
                "فريق داني",
                0,
                0,
                0,
                0

        );
        ArrayList<TeamMeet> teamMeets = new ArrayList<TeamMeet>();
        teamMeets.add(teamMeet1);
        teamMeets.add(teamMeet2);
        teamMeets.add(teamMeet3);
        teamMeets.add(teamMeet4);
        teamMeets.add(teamMeet5);
        teamMeetRepository.saveAll(teamMeets);
        return new AddMeetResponse("Added Successfully");

    }

    public MeetResultsResponse meetResults(MeetResultRequest meetResultRequest) {

        ///////Get teams ///////////////
        Team mayarTeam = teamRepository.findById(1L).get();
        Team amjadTeam = teamRepository.findById(2L).get();
        Team mjdTeam = teamRepository.findById(3L).get();
        Team daniTeam = teamRepository.findById(4L).get();
        Team makramTeam = teamRepository.findById(5L).get();

        Meet meet  = meetRepository.findById(Long.parseLong(meetResultRequest.getMeetId())).get();


        //////// Save meet for each team //////////
        saveMeet(mayarTeam,0,meet,meetResultRequest);
        saveMeet(amjadTeam,1,meet,meetResultRequest);
        saveMeet(mjdTeam,2,meet,meetResultRequest);
        saveMeet(daniTeam,3,meet,meetResultRequest);
        saveMeet(makramTeam,4,meet,meetResultRequest);


        /////// Start ranking /////
        saveTeamScoresAndRanks();
        /////// End Rank ///////

        return new MeetResultsResponse("Done Successfully");
    }

    public void saveTeamScoresAndRanks(){
        int mayarResult = 0;
        int amjadResult = 0;
        int mjdResult = 0;
        int daniResult = 0;
        int makramResult = 0;
        Team mayarTeam = teamRepository.findById(1L).get();
        Team amjadTeam = teamRepository.findById(2L).get();
        Team mjdTeam = teamRepository.findById(3L).get();
        Team daniTeam = teamRepository.findById(4L).get();
        Team makramTeam = teamRepository.findById(5L).get();

        ///// get results for each team ///////////

        mayarResult = getTeamResults(teamMeetRepository.findAllByTeam(mayarTeam),mayarResult);

        amjadResult = getTeamResults(teamMeetRepository.findAllByTeam(amjadTeam),amjadResult);

        mjdResult = getTeamResults(teamMeetRepository.findAllByTeam(mjdTeam),mjdResult);

        daniResult =  getTeamResults(teamMeetRepository.findAllByTeam(daniTeam),daniResult);

        makramResult =  getTeamResults(teamMeetRepository.findAllByTeam(makramTeam),makramResult);


        ////////// Save score for each team /////////

        mayarTeam.setScore(String.valueOf(mayarResult));

        amjadTeam.setScore(String.valueOf(amjadResult));

        mjdTeam.setScore(String.valueOf(mjdResult));

        daniTeam.setScore(String.valueOf(daniResult));

        makramTeam.setScore(String.valueOf(makramResult));



        //////// Rank each team ////////
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(mayarTeam);
        teams.add(amjadTeam);
        teams.add(mjdTeam);
        teams.add(daniTeam);
        teams.add(makramTeam);
        Collections.sort(teams, (a, b) -> Integer.parseInt(b.getScore()) -  Integer.parseInt(a.getScore()));
        int rank =1;
        for (Team team : teams){
            team.setRank(String.valueOf(rank));
            rank ++;
        }


        /////////// Insert Scores into Database /////////////
        teamRepository.save(mayarTeam);
        teamRepository.save(amjadTeam);
        teamRepository.save(mjdTeam);
        teamRepository.save(daniTeam);
        teamRepository.save(makramTeam);

    }

    public int getTeamResults(List<TeamMeet> teamMeets,int result){
        for (TeamMeet element :
                teamMeets) {
            result += element.getTeam1Score() +
                    element.getTeam2Score() +
                    element.getTeam3Score() +
                    element.getTeam4Score();
        }
        return result;
    }
    public void saveMeet(Team team,int index,Meet meet,MeetResultRequest meetResultRequest){
        TeamMeet teamMeet = teamMeetRepository.findTeamMeetByTeamAndMeet(team,meet);
        teamMeet.setTeam(team);
        teamMeet.setMeet(meet);
        teamMeet.setTeam1Name(meetResultRequest.getTeamScoreRequests().get(index).getTeam1Name());
        teamMeet.setTeam2Name(meetResultRequest.getTeamScoreRequests().get(index).getTeam2Name());
        teamMeet.setTeam3Name(meetResultRequest.getTeamScoreRequests().get(index).getTeam3Name());
        teamMeet.setTeam4Name(meetResultRequest.getTeamScoreRequests().get(index).getTeam4Name());
        ArrayList<Integer> results = formatTeamResult(
                meetResultRequest.getTeamScoreRequests()
                        .get(index)
                        .getTeam1Result(),
                meetResultRequest.getTeamScoreRequests()
                        .get(index)
                        .getTeam2Result(),
                meetResultRequest.getTeamScoreRequests()
                        .get(index)
                        .getTeam3Result(),
                meetResultRequest.getTeamScoreRequests()
                        .get(index)
                        .getTeam4Result()
        );
        teamMeet.setTeam1Score(results.get(0));
        teamMeet.setTeam2Score(results.get(1));
        teamMeet.setTeam3Score(results.get(2));
        teamMeet.setTeam4Score(results.get(3));
        teamMeetRepository.save(teamMeet);
    }

    private ArrayList<Integer> formatTeamResult(int team1Result, int team2Result, int team3Result, int team4Result) {
        team1Result = resultReturnForm(team1Result);
        team2Result = resultReturnForm(team2Result);
        team3Result = resultReturnForm(team3Result);
        team4Result = resultReturnForm(team4Result);
        ArrayList<Integer> result = new ArrayList<>();
        result.add(team1Result);
        result.add(team2Result);
        result.add(team3Result);
        result.add(team4Result);
        return result;
    }
    private int resultReturnForm(int element){
        if (element == 2){
           return element = 0;
        }
        else if (element == 3){
           return element = -1;
        }
        return 1;
    }

    public ArrayList<AllMeetsResponse> getAllMeets() {
        ArrayList<AllMeetsResponse> allMeets = new ArrayList<>();
        ArrayList<Meet> meets = (ArrayList<Meet>) meetRepository.findAll();
        for (Meet element :
                meets) {
            allMeets.add(new AllMeetsResponse(String.valueOf(element.getMeetId()),element.getDate()));
        }
        return allMeets;
    }

    public OneMeetResponse getOneMeet(OneMeetRequest oneMeetRequest) {
        Meet meet = meetRepository.findById(Long.parseLong(oneMeetRequest.getMeetId())).get();
        ArrayList<TeamMeet> teamMeets = (ArrayList<TeamMeet>) teamMeetRepository.findAllByMeet(meet);
        ArrayList<TeamMeetRow> teamMeetRows = new ArrayList<>();

        for (TeamMeet element : teamMeets
            ){
            teamMeetRows.add(new TeamMeetRow(
                    element.getTeam().getTeamName(),

                    element.getTeam1Name(),
                   String.valueOf(element.getTeam1Score()),

                    element.getTeam2Name(),
                    String.valueOf(element.getTeam2Score()),

                    element.getTeam3Name(),
                    String.valueOf(element.getTeam3Score()),

                    element.getTeam4Name(),
                    String.valueOf(element.getTeam4Score())
                    ));
        }
        return new OneMeetResponse(teamMeetRows);
    }

    public AllTeamsResponse getAllTeams() {
        AllTeamsResponse allTeamsResponse =new AllTeamsResponse();
       ArrayList<TeamsResponse> teamsResponses = new ArrayList<>();
       ArrayList<Team> teams = (ArrayList<Team>) teamRepository.findAll();

        for (Team element :
                teams) {
            teamsResponses.add(new TeamsResponse(
                    String.valueOf(element.getTeamId()),
                    element.getTeamName(),
                    element.getNameOne(),
                    element.getNameTwo(),
                    element.getRank(),
                    element.getScore()
            ));
        }
        allTeamsResponse.setTeams(teamsResponses);
        return allTeamsResponse;
    }

    public AllMeetForTeamResponse getAllMeetForTeam(AllMeetForTeamRequest allMeetForTeamRequest) {
        Team team = teamRepository.findById(Long.parseLong(allMeetForTeamRequest.getTeamId())).get();
        ArrayList<TeamMeet> teamMeetsForTeam = (ArrayList<TeamMeet>) teamMeetRepository.findAllByTeam(team);
        ArrayList<TeamMeetWithDate> teamMeetWithDates = new ArrayList<>();
        for (TeamMeet element :
                teamMeetsForTeam) {
            teamMeetWithDates.add(
                    new TeamMeetWithDate(
                            new MeetForOneTeam(String.valueOf(element.getMeet().getMeetId()),element.getMeet().getDate()),
                            element.getTeam().getTeamName(),
                            element.getTeam1Name(),
                            element.getTeam2Name(),
                            element.getTeam3Name(),
                            element.getTeam4Name(),
                            String.valueOf(element.getTeam1Score()),
                            String.valueOf(element.getTeam2Score()),
                            String.valueOf(element.getTeam3Score()),
                            String.valueOf(element.getTeam4Score())
                    )
            );
        }
        return new AllMeetForTeamResponse(teamMeetWithDates);
    }
}
