package com.lovetocode.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        System.out.println("cricket sout");
        return "Practice cricket for 30 minutes";
    }
}
