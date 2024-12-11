package com.example.MongoDb.service;

import com.example.MongoDb.*;
import com.example.MongoDb.model.StaticLogs;
import com.example.MongoDb.request.StaticLogsServiceRequest;
import com.example.MongoDb.response.StaticLogsServiceresponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class StaticLogsService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	public StaticLogsServiceresponse savestaticlogs(StaticLogsServiceRequest request) {
		
		StaticLogs staticlogs = new StaticLogs();
		staticlogs.setName(System.getProperty("os.name"));
		staticlogs.setId(System. getProperty("user.name"));
		Time time = new Time();
		staticlogs.setTime(time.timeStamp);
		staticlogs.setBios(null);
		staticlogs.setLocation(null);
		IpAddress inetaddress = new IpAddress();
		staticlogs.setIpaddress(inetaddress.getLocalHost());
		StaticLogs savedstaticlogs = mongoTemplate.save(staticlogs);
		StaticLogsServiceresponse response = new StaticLogsServiceresponse();
		response.setId(savedstaticlogs.getId());
		return response;
		
	}

}
