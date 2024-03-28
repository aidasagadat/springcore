package com.lovetocode.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private  Coach theCoach;

    @Autowired
    public DemoController(Coach theCoach){
        theCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return theCoach.getDailyWorkout();
    }


}
