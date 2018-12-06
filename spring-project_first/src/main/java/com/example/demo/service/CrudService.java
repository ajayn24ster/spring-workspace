package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
import com.example.demo.repo.UsersRepository;



@Service
public class CrudService {
@Autowired
private UsersRepository usersRepo;
public List<Users> getUsers(){
	List<Users> users=new ArrayList<Users>();
	usersRepo.findAll().forEach(users::add);
	return users;
}
}
