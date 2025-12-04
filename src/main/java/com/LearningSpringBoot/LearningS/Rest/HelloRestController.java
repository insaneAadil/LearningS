package com.LearningSpringBoot.LearningS.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping
    public String HelloWorld() {
        return "Hello World";
    }
    @GetMapping("/daily")
    public String getDailySteps(){
        return "Daily 10,000 Steps";
    }
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team: " + teamName;
    }
    

}
