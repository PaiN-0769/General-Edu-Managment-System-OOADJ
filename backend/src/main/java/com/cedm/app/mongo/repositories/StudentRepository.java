package com.cedm.app.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cedm.app.mongo.models.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
	
}