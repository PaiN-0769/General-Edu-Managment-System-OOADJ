package com.cedm.app.mongo.repositories;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cedm.app.mongo.models.User;


public interface UserRepository extends MongoRepository<User, String> {
   @Query("{username:'?0'}")
   User findItemByName(String username);
   @Query("{username:}")
   User getAll(String username); 
}
