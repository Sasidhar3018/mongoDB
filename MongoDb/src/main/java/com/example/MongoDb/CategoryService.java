package com.example.MongoDb;

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
