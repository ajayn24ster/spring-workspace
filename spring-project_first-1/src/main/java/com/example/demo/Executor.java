package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.ShapeService;
@Component
public class Executor implements CommandLineRunner{
@Autowired
ShapeService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.getSquare();
		service.setCircle("circle");
		
	}

}
