package com.java.js;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date1 {
	public static void main(String[] args) {
		LocalDateTime date1= LocalDateTime.now();
        
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy : HH:mm:ss ");
        String formattedDateAndTime = date1.format(format1);
        System.out.println("formatted date and time : " + formattedDateAndTime);
	}

}
