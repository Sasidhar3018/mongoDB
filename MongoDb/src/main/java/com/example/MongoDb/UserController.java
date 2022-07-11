package com.example.MongoDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/user")
	public ResponseEntity<UserCreationResponse> saveUser(@RequestBody UserCreationRequest request) {
		return ResponseEntity.ok(userService.saveuser(request));
		
	}
}
