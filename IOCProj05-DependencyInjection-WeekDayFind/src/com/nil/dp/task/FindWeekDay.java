package com.nil.dp.task;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fwd")
public class FindWeekDay {

	private LocalDate date;
	
	@Autowired
	public final void setDate(LocalDate date) {
		this.date = date;
	}


	public String findWeekDay(String userName) {
		int day = date.getDayOfWeek().getValue();
		switch (day) {
		case 1: return userName + " today is Monday"; 
		case 2: return userName + " today is Tuesday";
		case 3: return userName + " today is Wenesday";
		case 4: return userName + " today is Thusday";
		case 5: return userName + " today is Frida";
		case 6: return userName + " today is Saturday";
		case 7: return userName + " today is Sunday";
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
	}
}
