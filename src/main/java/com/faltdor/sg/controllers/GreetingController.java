package com.faltdor.sg.controllers;

import com.faltdor.sg.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return this.greetingService.getGreeting();
    }
}
