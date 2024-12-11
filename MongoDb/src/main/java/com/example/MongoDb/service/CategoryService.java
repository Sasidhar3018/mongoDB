package com.example.MongoDb.service;

import com.example.MongoDb.model.Category;
import com.example.MongoDb.request.CategoryCreationRequest;
import com.example.MongoDb.response.CategoryCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {

	@Autowired
	private MongoTemplate mongoTemplate;
		
		public CategoryCreationResponse saveCategory(CategoryCreationRequest request) {
			Category category = new Category();
			category.setName(null);
			category.setDescription(null);
			Category savedcategory = mongoTemplate.save(category);
			CategoryCreationResponse response = new CategoryCreationResponse();
			response.setId(savedcategory.getID());
			return response;

		}


}
