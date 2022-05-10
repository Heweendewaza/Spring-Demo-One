package com.luv2code.springdemo;

public class TennisCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Practice Backhand for 30 min";
				 
}

	@Override
	public String getDailyFortune() {
		return null;
	}
}