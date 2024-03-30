package com.lovetocode.springcoredemo.common;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FigureSkatingCoach implements Coach{

    public FigureSkatingCoach(){
        System.out.println("FIGURE SKATING");
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("fs sout");
        return "Practice fly camel spins for 15 minutes";
    }
}
