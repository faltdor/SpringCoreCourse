package com.faltdor.sg.config;

import com.faltdor.sg.services.*;

public class GreetingFactory {

    public GreetingService createGreetingService(String language){
        GreetingService service = null;

        switch (language){
            case "en":
                service = new GreetingEnglishServiceImpl();
                break;
            case "es":
                service = new GreetingSpanishServiceImpl();
                break;
            case "fr":
                service = new GreetingServiceFrenchImpl();
                break;
            case "de":
                service = new GreetingServiceGermanImpl();
                break;
            case "pl":
                service = new GreetingServicePolish();
                break;
            case "ru":
                service = new GreetingRussianImpl();
                break;
            default: new GreetingEnglishServiceImpl();
        }

        return service;
    }
}
