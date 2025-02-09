package com.shubhamgroup.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {

        System.out.println("In Constructor : " + getClass().getSimpleName());
    }

    @PostConstruct
    // define our init method
    public void doMyStartupStuff() {
        System.out.println("in doMyStartupStuff : " + getClass().getSimpleName());
    }

    @PreDestroy
    // define our destroy method
    public void doMyCleanupStuff() {
        System.out.println("in doCleanupStuff : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 min!!";
    }
}
