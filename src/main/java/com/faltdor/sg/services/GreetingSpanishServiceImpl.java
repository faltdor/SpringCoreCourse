package com.faltdor.sg.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("spanish")
public class GreetingSpanishServiceImpl implements  GreetingService {
    @Override
    public String getGreeting() {
        return "Hola Mundo";
    }
}
