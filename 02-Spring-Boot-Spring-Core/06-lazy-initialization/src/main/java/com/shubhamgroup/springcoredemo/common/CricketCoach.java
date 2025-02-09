package com.shubhamgroup.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 min!!";
    }
}
