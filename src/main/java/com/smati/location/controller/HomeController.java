package com.smati.location.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String ShowHomePage() {
		System.out.println("work");
		return "home";
		
	}
	
}
