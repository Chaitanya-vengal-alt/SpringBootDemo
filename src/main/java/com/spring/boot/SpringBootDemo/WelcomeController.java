package com.spring.boot.SpringBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/hi")
	public String message() {
		return "WELCOME TO SPRING BOOT PRACTICE WITH GIT";
	}

}
