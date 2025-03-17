package com.np.di.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.np.di.task.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/np/di/config/applicationContext.xml");
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator wmg = (WishMessageGenerator) obj;
		String wishMessage = wmg.generateWishMessage("Nilesh");
		System.out.println("Wish Message is ::" + wishMessage);
	}

}
