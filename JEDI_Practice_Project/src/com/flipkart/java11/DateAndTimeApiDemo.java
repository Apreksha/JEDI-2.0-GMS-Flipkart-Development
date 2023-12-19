package com.flipkart.java11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateAndTimeApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayCurrentDate();
		displayCurrentDateDetails();

	}
	private static void displayCurrentDate() {

		Date currentDate = new Date();
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("Current Date and Time - Before Java 8 : " + currentDate);
		System.out.println("Current Date - From Java 8 : " + localDate);
		System.out.println("Current Time - From Java 8 : " + localTime);
		System.out.println("Current Date and Time From Java 8 : " + localDateTime);
	}

	private static void displayCurrentDateDetails() {
		// Current Date - : 2019-03-05
		LocalDate localDate = LocalDate.now();

		System.out.println("localDate.getYear(): " + localDate.getYear());
		System.out.println("localDate.getMonth(): " + localDate.getMonth());
		System.out.println("localDate.getDayOfWeek(): " + localDate.getDayOfWeek());
		System.out.println("localDate.getDayOfMonth(): " + localDate.getDayOfMonth());
		System.out.println("localDate.getDayOfYear(): " + localDate.getDayOfYear());

	}

}
