package com.org.ajkart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.ajkart.beans.LoginModel;
import com.org.ajkart.repo.UserRepository;

@Service
public class LoginService {
	@Autowired
	UserRepository userRepo;

	public LoginModel getUser(String userId) {
		/*
		 * Session session = new DBSessionUtil().getSession();
		 * session.beginTransaction(); LoginModel ob=session.find(LoginModel.class, 1);
		 * String str = session.get(LoginModel.class, 1).toString();
		 * System.out.println(str); session.close();
		 */
		Optional<LoginModel> lm = userRepo.findById(userId);
		LoginModel lm1 = lm==null?null:lm.get();
		// LoginModel lm=ur.getOne(userId);
		return lm1;
	}

}
