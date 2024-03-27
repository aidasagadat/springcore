package com.lovetocode.springcoredemo;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice cricket for 30 minutes";
    }
}
