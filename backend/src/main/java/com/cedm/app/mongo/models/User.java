package com.cedm.app.mongo.models;


import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("users")
public class User {

	@Id
	private String id;
	@Indexed(unique=true)
	private String username;
	private String password;
	private LocalDateTime created;

	

	public User(String name, String password, LocalDateTime timestamp) {
		this.setUsername(name);
		this.setPassword(password);
		this.setCreated( timestamp ); 
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
}