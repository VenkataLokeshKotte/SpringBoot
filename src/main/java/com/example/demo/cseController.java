package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cseController {
	@GetMapping("/home")
	public String disk() {
		return "23MH1A05I1";
	}
	@GetMapping("/cse")
	public String disk2() {
		return "Welcome to Aditya University";
	}

}
