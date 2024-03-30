package com.lovetocode.springcoredemo.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("CRICKET");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice cricket for 30 minutes";
    }
}
