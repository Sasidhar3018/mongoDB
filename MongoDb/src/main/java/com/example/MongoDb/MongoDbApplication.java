package com.example.MongoDb;

//import java.util.List;

//import org.jutils.jprocesses.JProcesses;
//import org.jutils.jprocesses.model.ProcessInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	
//		List<ProcessInfo> processesList = JProcesses.getProcessList();
//		processesList.stream().forEach(list -> System.out.println(list.getName()));
	}
	
	

}
