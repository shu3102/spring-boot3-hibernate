package com.shubhamgroup.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 min!!";
    }
}
