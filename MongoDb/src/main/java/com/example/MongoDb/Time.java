package com.example.MongoDb;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {

	String timeStamp = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
}
