package com.casmir.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdmnController {
	
	@GetMapping("/home")
	public String home() {
		return "Welcome ADMIN HOME Page";	
	}
	
	@GetMapping("/dashboard")	
    public String dashboard() {
	return "Welcome to ADMIN DASHBOARD Page";		
	}
}
