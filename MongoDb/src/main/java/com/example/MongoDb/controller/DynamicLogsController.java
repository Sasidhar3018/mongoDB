package com.example.MongoDb.controller;

import com.example.MongoDb.request.DynamicLogsCreationRequest;
import com.example.MongoDb.response.DynamicLogsCreationResponse;
import com.example.MongoDb.service.DynamicLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DynamicLogsController {
	
	@Autowired
	private DynamicLogsService dynamiclogsService;
	
	@PostMapping(value = "/dynamicslogscontroller")
	public ResponseEntity<DynamicLogsCreationResponse> saveDynamicLogs(@RequestBody DynamicLogsCreationRequest request){
		return ResponseEntity.ok(dynamiclogsService.savedynamicLogs(request));
	}

}
