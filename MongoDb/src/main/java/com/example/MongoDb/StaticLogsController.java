package com.example.MongoDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StaticLogsController {
	
	@Autowired
	private StaticLogsService staticlogsservice;
	
	@PostMapping("/staticlogs")
	
	public ResponseEntity<StaticLogsServiceresponse> saveSystemLog(@RequestBody StaticLogsServiceRequest request){
		return ResponseEntity.ok(staticlogsservice.savestaticlogs(request));
	}
	
	
	
	
	
	
	
	

}
