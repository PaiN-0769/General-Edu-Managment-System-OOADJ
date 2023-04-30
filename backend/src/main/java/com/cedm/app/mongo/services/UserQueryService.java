package com.cedm.app.mongo.services;

import java.util.List;

import com.cedm.app.mongo.models.User;

public interface UserQueryService {
	
	List<User> getAll();

	List<User> getUsersByUsername(String username);

}