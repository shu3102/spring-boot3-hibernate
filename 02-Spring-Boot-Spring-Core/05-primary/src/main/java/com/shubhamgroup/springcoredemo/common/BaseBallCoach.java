package com.shubhamgroup.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "BaseBallCoach: daily 30 min practice";
    }
}
