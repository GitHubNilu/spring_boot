package com.nil.dp.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nil.dp.task.FindWeekDay;

public class SetterInjectionTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nil/dp/cfg/applicationContext.xml");
		FindWeekDay fwd = (FindWeekDay) ctx.getBean("fwd");

		System.out.println("Weekday is :" + fwd.findWeekDay("Nilesh"));
	}

}
