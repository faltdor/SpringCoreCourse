package com.faltdor.sg.config;

import com.faltdor.sg.services.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreatingConfiguration {

    @Bean
    public GreetingFactory greetingFactory(){
        return  new GreetingFactory();
    }

    @Bean
    @Profile("english")
    public GreetingService greetingEnglish(GreetingFactory greetingFactory){
        return greetingFactory.createGreetingService("en");
    }

    @Bean
    @Profile("spanish")
    public GreetingService greetingSpanish(GreetingFactory greetingFactory){
        return greetingFactory.createGreetingService("es");
    }


    @Bean
    @Profile("russian")
    public GreetingService greetingRussian(GreetingFactory greetingFactory){
        return greetingFactory.createGreetingService("ru");
    }
}
