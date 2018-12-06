package com.org.ajkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.ajkart.annotations.AjKartLogging;



@Controller
public class LoginController {
	@AjKartLogging
	@GetMapping("/login")
	public String getLoginPage() {
		return "index";
		
	}

}
