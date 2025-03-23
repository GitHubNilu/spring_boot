package com.nil.dp.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nil.dp.beans.WishMessageGenerator;

public class ConstructionInjectionTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nil/dp/cfg/applicationContext.xml");
		WishMessageGenerator wmg = (WishMessageGenerator) ctx.getBean("wmg");
		String message = wmg.generateWishMessage("Nilesh");
		System.out.println("Wish Message =>" + message);
	}

}
