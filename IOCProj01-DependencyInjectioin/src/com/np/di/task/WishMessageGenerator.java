package com.np.di.task;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	//HAS-A property
  private LocalTime time;
  // HAS-A property
  private LocalDate date;
 
  public final void setTime(LocalTime time) {
	this.time = time;
}
  
public final void setDate(LocalDate date) {
	this.date = date;
}



public WishMessageGenerator() {
	// TODO Auto-generated constructor stub
	  System.out.println("WishMessageGenerotor.WishMessageGenerotor():: 0 param constructor");
}
  public String generateWishMessage(String username) {
	  System.out.println("WishMessageGenerotor.generateWishMessage()::"+ time +" and " + date );
	  //get current hour
	  int hour = time.getHour();
	  if (hour < 12) {
		return "Good Morning " + username;
	} else if (hour <16) {
		return "Good Afternoon " + username;
	}else if(hour < 18) {
		return "Good Evening " + username;
	} else {
		return "Good Night " + username;
	}	  
  }
}
