package com.np.di.task;

import java.time.LocalDate;

public class WishSeasonMessage {

	private LocalDate date;
		
	public final void setDate(LocalDate date) {
		this.date = date;
	}

	public WishSeasonMessage() {
		// TODO Auto-generated constructor stub
		System.out.println("WishSeasonMessage.WishSeasonMessage():: 0-param constructor");
	}
	public String generateSeasonMessage(String username) {
		System.out.println("WishSeasonMessage.generateSeasonMessage()");
		int month = date.getMonthValue();
		String message = null;
		if (month >= 6 && month < 10) {
			message =  "This is Mansson/Rainy Season " + username;
		} else if (month >= 10 && month < 2) {
			message = "This is Winter Season " + username;
		} else if (month >= 2 && month < 6) {
			message = "This is Summer Season " + username;
		}
		return message;
	}
}
