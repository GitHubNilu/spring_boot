package com.nil.dp.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nil.dp.beans.SeasionFinder;

public class SetterInjectionTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nil/dp/cfg/applicationContext.xml");
		SeasionFinder sf = (SeasionFinder) ctx.getBean("sf");
		String message = sf.findSession("Nilesh");
		System.out.println("Seasion Is =>" + message);
	}

}
