package com.org.ajkart.repo;

import org.springframework.data.repository.CrudRepository;

import com.org.ajkart.beans.LoginModel;

public interface UserRepository extends CrudRepository<LoginModel, String> {


}
