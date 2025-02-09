package com.shubhamgroup.springcoredemo.rest;

import com.shubhamgroup.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach theAnotherCoach;

    @Autowired
    public void DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In Constructor : " + getClass().getSimpleName());
        this.myCoach = theCoach;
        this.theAnotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {

        return "Comparing the beans : myCoach == anotherCoach ? " + (myCoach == theAnotherCoach);
    }
}
