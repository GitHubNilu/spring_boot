package com.nil.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nil.di.bean.WeekDayFinder;
import com.nil.di.cfgs.AppConfig;

public class DependencyAmbiguityTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WeekDayFinder wdf = (WeekDayFinder) ctx.getBean("wdf");
		String result = wdf.findWeekDay("Nilesh");
		System.out.println("Result ::" + result);
	}
}
