package com.luv2code.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscope_applicationContext.xml");

		Coach myCoach = applicationContext.getBean("myCoach",Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		//System.out.println(myCoach.getTeamName());
		
		applicationContext.close();
	}

}
