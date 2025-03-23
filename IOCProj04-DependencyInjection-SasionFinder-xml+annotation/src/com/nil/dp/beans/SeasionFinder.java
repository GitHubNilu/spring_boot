package com.nil.dp.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasionFinder {

	private LocalDate date;

	@Autowired
	public final void setDate(LocalDate date) {
		this.date = date;
	}

	public String findSession(String username) {
		int month = date.getMonthValue();

		if (month >= 3 && month < 7) {
			return "summer seasion " + username;
		} else if (month >= 7 && month < 11) {
			return "Rainy seasion " + username;
		} else
			return "winter seasion " + username;
	}
}
