package com.example.MongoDb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("dynamiclogs")
public class DynamicLogs {
	
	@Id
	private String Id;
	private String Name;
	private String SystemId;
	private String Log;
	private String Time;
	private Integer rebootcount;
	private String Osuptime;
	private String Systemmodel;
	private int Processer;
	private String OsName;
	public String getOsName() {
		return OsName;
	}
	public void setOsName(String osName) {
		OsName = osName;
	}
	private String BIOS;
	private String systemdirectory;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSystemId() {
		return SystemId;
	}
	public void setSystemId(String systemId) {
		SystemId = systemId;
	}
	public String getLog() {
		return Log;
	}
	public void setLog(String log) {
		Log = log;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public Integer getRebootcount() {
		return rebootcount;
	}
	public void setRebootcount(Integer rebootcount) {
		this.rebootcount = rebootcount;
	}
	public String getOsuptime() {
		return Osuptime;
	}
	public void setOsuptime(String osuptime) {
		Osuptime = osuptime;
	}
	public String getSystemmodel() {
		return Systemmodel;
	}
	public void setSystemmodel(String systemmodel) {
		Systemmodel = systemmodel;
	}
	public int getProcesser() {
		return Processer;
	}
	public void setProcesser(int processer) {
		Processer = processer;
	}
	public String getBIOS() {
		return BIOS;
	}
	public void setBIOS(String bIOS) {
		BIOS = bIOS;
	}
	public String getSystemdirectory() {
		return systemdirectory;
	}
	public void setSystemdirectory(String systemdirectory) {
		this.systemdirectory = systemdirectory;
	}
	
	
	
	

}
