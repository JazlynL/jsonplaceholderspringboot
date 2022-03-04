package com.careerdevs.jsonplaceholderspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    // spring boot annotation to signify the following method is for a get request
    @GetMapping ("/")
 public String rootRoute(){
        return "you requested this root";
    }
}
