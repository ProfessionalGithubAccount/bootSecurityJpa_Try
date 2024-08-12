package com.iiht.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.Repository.UserRepository;
import com.iiht.bs.model.User;

@Service
public class DummyUserData {
	
	@Autowired
	UserRepository userRepo;
	
	public String addData(User user) {
		
		userRepo.save(user);
		return "added";
	}

}
