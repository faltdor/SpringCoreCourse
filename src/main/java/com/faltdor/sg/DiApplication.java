package com.faltdor.sg;

import com.faltdor.sg.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		GreetingController greetingController = (GreetingController)ctx.getBean("greetingController");

		System.out.printf("Greating From Main: %s", greetingController.sayHello());

	}
}

