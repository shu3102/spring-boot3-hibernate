package com.groupid.artifact.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartDemoController {
    @GetMapping("/")
    public String mainPage() {
        System.out.println("Hi Shubham");
        return  "Hi Shubham";
    }
}
