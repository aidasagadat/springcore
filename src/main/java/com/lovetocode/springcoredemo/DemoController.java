package com.lovetocode.springcoredemo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private  Coach theCoach;

    public DemoController(Coach theCoach){
        theCoach = theCoach;
    }

}
