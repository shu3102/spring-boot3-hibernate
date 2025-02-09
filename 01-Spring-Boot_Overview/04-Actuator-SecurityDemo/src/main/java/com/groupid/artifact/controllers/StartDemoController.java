package com.groupid.artifact.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartDemoController {


//    #Getting property names
        @Value("${coach.name}")
        private  String coachName;

    @Value("${team.name}")
        private  String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return  "Coach Name : " + coachName + ";" + "Team Name : " + teamName;
    }

    @GetMapping("/")
    public String mainPage() {
        System.out.println("Hi Shubham");
        return  "Hi Shubham";
    }
}
