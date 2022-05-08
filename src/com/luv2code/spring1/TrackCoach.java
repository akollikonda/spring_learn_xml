package com.luv2code.spring1;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 1 hour on threadmill";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void doMyStartupStuff() {
		System.out.println( "Bean starting");
	}
	
	public String doMyCloseupStuff() {
		return "Bean Destroyed";
	}

}
