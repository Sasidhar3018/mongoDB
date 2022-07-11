package com.example.MongoDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public UserCreationResponse saveuser(UserCreationRequest request) {
		User user = new User();
		user.setAdmin(request.isAdmin());
		user.setEmail(request.getEmail());
		user.setName(request.getName());
		User savedUser = mongoTemplate.save(user);
		UserCreationResponse response = new UserCreationResponse();
		response.setId(savedUser.getId());
		return response;
		
	}
}
