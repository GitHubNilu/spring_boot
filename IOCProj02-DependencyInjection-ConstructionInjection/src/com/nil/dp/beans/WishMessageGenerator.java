package com.nil.dp.beans;

import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime time;

	public WishMessageGenerator(LocalTime time) {
		System.out.println("WishMessageGenerator:: 1 - param constructor");
		this.time = time;
	}

	public String generateWishMessage(String userName) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour = time.getHour();
		if (hour < 12) {
			return "Good Morning " + userName;
		} else if (hour < 4) {
			return "Good Evening " + userName;
		} else
			return "Good Night " + userName;
	}
}
