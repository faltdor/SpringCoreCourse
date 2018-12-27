package com.faltdor.sg.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("english")
public class GreetingEnglishServiceImpl implements  GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
