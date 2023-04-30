package com.cedm.app.mongo.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("students")
public class Student {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String age;
	private LocalDateTime created;

	
	public Student (String firstName, String lastName, Gender gender, String age, LocalDateTime timestamp) {
		this.setFirstName( firstName );
		this.setLastName( lastName );
		this.setGender( gender );
		this.setAge( age );
		this.setCreated( timestamp ); 
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}  
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}


	
}
