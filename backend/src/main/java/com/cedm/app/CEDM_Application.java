package com.cedm.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


import com.cedm.app.mongo.repositories.UserRepository;

@SpringBootApplication
@EnableMongoRepositories
public class CEDM_Application implements CommandLineRunner{
    
    @Autowired
    UserRepository userRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(CEDM_Application.class, args);
    }
    
    public void getUserByUsername(String name) {
        System.out.println("Getting item by name: " + name);
        userRepository.findItemByName(name);
    }
	@Override
	public void run(String... args) throws Exception {
		getUserByUsername("vivek");
		
	}
}