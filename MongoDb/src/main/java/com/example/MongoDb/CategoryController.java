package com.example.MongoDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
	
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping(value = "/category")
	public ResponseEntity<CategoryCreationResponse> saveCategory(@RequestBody CategoryCreationRequest request){
		return ResponseEntity.ok(categoryService.saveCategory(request));
	}



}
