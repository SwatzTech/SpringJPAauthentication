package com.swathi.jpasecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApplicationController {

	@GetMapping("/")
	public String defaultPage() {
		return "Hello there";
	}
	
	@GetMapping("/user")
	public String sayUser() {
		return "Welcome User!";
	}
	
	@GetMapping("/admin")
	public String sayAdmin() {
		return "Welcome Admin!";
	}
}
