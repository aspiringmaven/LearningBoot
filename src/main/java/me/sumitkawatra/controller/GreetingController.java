package me.sumitkawatra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String HELLO = "Hello This is Spring Boot Application";
	
	@RequestMapping("/")
	public String greet() {
		return GreetingController.HELLO;
	}
}
