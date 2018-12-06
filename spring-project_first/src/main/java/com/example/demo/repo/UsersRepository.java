package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Users;



public interface UsersRepository extends CrudRepository<Users, String> {

}
