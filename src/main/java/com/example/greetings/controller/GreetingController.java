package com.example.greetings.controller;

import com.example.greetings.model.GreetingModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello , %s!";

    @GetMapping("/greetings")
    public GreetingModel greeting(@RequestParam(value = "name" , defaultValue = "World") String name){
        return new GreetingModel(String.format(template, name));
    }
}
