package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Users;
import com.example.demo.service.CrudService;


@RestController
public class UsersController {
@Autowired
CrudService service;
@RequestMapping(value="/users")	
public List<Users> getAllUsers() {
	return service.getUsers();
}
}
