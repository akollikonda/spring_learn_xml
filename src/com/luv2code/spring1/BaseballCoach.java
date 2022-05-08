package com.luv2code.spring1;

public class BaseballCoach implements Coach{

	public FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public String getDailyWorkout() {
		return "Spend 30 min in batting cage";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
