package com.shubhamgroup.springcoredemo.config;

import com.shubhamgroup.springcoredemo.common.Coach;
import com.shubhamgroup.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfiguration {

    @Bean("auqatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
