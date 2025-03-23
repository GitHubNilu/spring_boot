package com.nil.dp.beans;

import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime time;
	private int age;

	public WishMessageGenerator(LocalTime time, int age) {
		System.out.println("WishMessageGenerator:: 2 - param constructor");
		this.time = time;
		this.age=age;
	}

	public String generateWishMessage(String userName) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour = time.getHour();
		if (hour < 12) {
			return "Good Morning " + userName + " age is " + age;
		} else if (hour < 4) {
			return "Good Evening " + userName + " age is " + age;
		} else
			return "Good Night " + userName + " age is " + age;
	}
}
