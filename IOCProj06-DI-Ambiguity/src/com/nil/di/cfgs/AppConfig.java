package com.nil.di.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nil.di")
public class AppConfig {

	@Bean("ldate1")
	public LocalDate createDate1() {
		return LocalDate.now();
	}

	@Bean("ldate2")
	//@Primary  // solve hte ambiguity issue by placing the @Primary annotation on one of type
	public LocalDate createDate2() {
		return LocalDate.of(2002, 10, 21);
	}
	
	@Bean("date")
	//@Primary  // solve hte ambiguity issue by placing the @Primary annotation on one of type
	public LocalDate createDate3() {
		return LocalDate.of(2024, 04, 21);
	}
}
