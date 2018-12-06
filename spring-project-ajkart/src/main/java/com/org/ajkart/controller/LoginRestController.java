package com.org.ajkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.ajkart.beans.LoginBean;
import com.org.ajkart.beans.LoginModel;
import com.org.ajkart.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/api")
public class LoginRestController {
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public LoginBean login(@RequestBody LoginModel login) {
		LoginBean lb=new LoginBean();
		lb.setUserId(login.getUserId());
		LoginModel lm = loginService.getUser(login.getUserId());
		lb.setStatus(lm!=null&&lm.getPassword().equalsIgnoreCase(login.getPassword())?true:false);
		return lb;
	}

}
