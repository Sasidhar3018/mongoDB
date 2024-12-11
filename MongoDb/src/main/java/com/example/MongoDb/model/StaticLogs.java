package com.example.MongoDb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("systemlog")
public class StaticLogs {
	
	@Id
	private String id;
	private String Name;
	private String Systemid;
	private String Log;
	private String createdat;
	private String time;
	private String systemdirectory;
	private String Osversion;
	private String Osname;
	private String Osuptime;
	private String Ipaddress;
	private String Location;
	private String Processor;
	private String Timezone;
	private String Bios;
	private String Sytemmodel;
	

	
	public String getOsuptime() {
		return Osuptime;
	}
	public void setOsuptime(String osuptime) {
		Osuptime = osuptime;
	}
	public String getIpaddress() {
		return Ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		Ipaddress = ipaddress;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getProcessor() {
		return Processor;
	}
	public void setProcessor(String processor) {
		Processor = processor;
	}
	public String getTimezone() {
		return Timezone;
	}
	public void setTimezone(String timezone) {
		Timezone = timezone;
	}
	public String getBios() {
		return Bios;
	}
	public void setBios(String bios) {
		Bios = bios;
	}
	public String getSytemmodel() {
		return Sytemmodel;
	}
	public void setSytemmodel(String sytemmodel) {
		Sytemmodel = sytemmodel;
	}
	public String getOsversion() {
		return Osversion;
	}
	public void setOsversion(String osversion) {
		Osversion = osversion;
	}
	public String getOsname() {
		return Osname;
	}
	public void setOsname(String osname) {
		Osname = osname;
	}
	public String getSystemdirectory() {
		return systemdirectory;
	}
	public void setSystemdirectory(String systemdirectory) {
		this.systemdirectory = systemdirectory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSystemid() {
		return Systemid;
	}
	public void setSystemid(String systemid) {
		Systemid = systemid;
	}
	public String getLog() {
		return Log;
	}
	public void setLog(String log) {
		Log = log;
	}
	public String getCreatedat() {
		return createdat;
	}
	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}
	public String gettTime() {
		return time;
	}
	public void setTime(String time) {
		time = time;
	}
	
	
	
	

}
