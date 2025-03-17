package com.np.di.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.np.di.task.WishMessageGenerator;
import com.np.di.task.WishSeasonMessage;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/np/di/config/applicationContext.xml");
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator wmg = (WishMessageGenerator) obj;
		String wishMessage = wmg.generateWishMessage("Nilesh");
		System.out.println("Wish Message is ::" + wishMessage);
		System.out.println("#######################################################################");
		Object obj1 = ctx.getBean("wsm");
		WishSeasonMessage wsm = (WishSeasonMessage) obj1;
		String message = wsm.generateSeasonMessage("Raja");
		System.out.println("Wish Season Message is ::" + message);
		
		
	}

}
