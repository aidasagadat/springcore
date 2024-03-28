package com.lovetocode.springcoredemo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private  Coach myCoach;

    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

}
