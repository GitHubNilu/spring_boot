package com.nil.di.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {

	@Autowired
	//@Qualifier("ldate1") // best approach to solve the ambiguity problem
	private LocalDate date;  // by field name

	public WeekDayFinder() {
		System.out.println("WeekDayFinder::0-param constructor");
	}

	public String findWeekDay(String username) {
		System.out.println("WeekDayFinder.findWeekDay() and date ::" + date);
		int day = date.getDayOfWeek().getValue();
		if (day >= 1 && day <= 5) {
			return "Work hard " + username;
		}
		return "Weekend " + username;
	}
}
