package com.java.jsf.WithDependency;

import java.time.LocalDateTime;

public class DateMain {
	public LocalDateTime getDateAndTime() {
		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println(dateAndTime);
		return dateAndTime;
	}

public static void main(String[] args) {
	 DateMain main = new DateMain();
	 main.getDateAndTime();
}
}
