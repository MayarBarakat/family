package com.example.familybackend.model.response;


public class AllMeetsResponse {
    String id;
    String meet;

    public AllMeetsResponse() {
    }

    public AllMeetsResponse(String id, String meet) {
        this.id = id;
        this.meet = meet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMeet() {
        return meet;
    }

    public void setMeet(String meet) {
        this.meet = meet;
    }
}
