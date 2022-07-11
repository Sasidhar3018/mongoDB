package com.example.MongoDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class DynamicLogsService {
	

	@Autowired
	private MongoTemplate mongoTemplate;
		
		public DynamicLogsCreationResponse savedynamicLogs(DynamicLogsCreationRequest request) {
			DynamicLogs dynamiclogs = new DynamicLogs();
			dynamiclogs.setOsName(System.getProperty("os.name"));
			Time time = new Time();
			dynamiclogs.setTime(time.timeStamp);
			dynamiclogs.setName(System. getProperty("user.name"));
			SystemInfo systeminfo =new SystemInfo();
			dynamiclogs.setProcesser(systeminfo.Processor);
			dynamiclogs.setOsuptime(null);
			dynamiclogs.setBIOS(null);
			dynamiclogs.setOsuptime(null);
			dynamiclogs.setBIOS(null);
			dynamiclogs.setLog(null);
			dynamiclogs.setOsuptime(null);
			dynamiclogs.setSystemdirectory(null);
			dynamiclogs.setRebootcount(null);
			dynamiclogs.setSystemmodel(null);
			DynamicLogs saveddynamiclogs = mongoTemplate.save(dynamiclogs);
			DynamicLogsCreationResponse response = new DynamicLogsCreationResponse();
			response.setId(saveddynamiclogs.getId());
			return response;

		}

}
