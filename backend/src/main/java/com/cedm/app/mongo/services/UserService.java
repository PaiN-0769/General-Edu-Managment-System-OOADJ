package com.cedm.app.mongo.services;

import java.util.List;

import com.cedm.app.mongo.models.User;

public interface UserService {
	
	List<User> getAll();

	List<User> getUsersByUsername(String username);

	User getOneUserByUsername(String username);

	List<User> getUserByUsernameLike(String username);	

	List<User> getUserByCondition(User user);

}