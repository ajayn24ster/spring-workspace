package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.annotation.Loggable;
@Service
public class ShapeService {
	
	private String circle;
	private String square;
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		System.out.println("Inside service circle");
		this.circle = circle;
	}
	@Loggable
	public String getSquare() {
		return square;
	}
	public void setSquare(String square) {
		this.square = square;
	}

}
