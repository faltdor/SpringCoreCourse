package com.faltdor.sg.services;

public class GreetingRussianImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Привет мир";
    }
}
