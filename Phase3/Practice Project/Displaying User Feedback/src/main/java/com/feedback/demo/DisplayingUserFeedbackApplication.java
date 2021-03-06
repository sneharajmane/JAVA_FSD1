package com.feedback.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.feedback")
public class DisplayingUserFeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayingUserFeedbackApplication.class, args);
	}

}
