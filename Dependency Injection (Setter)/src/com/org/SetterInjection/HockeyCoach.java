package com.org.SetterInjection;

public class HockeyCoach  implements Coach
{
	//define a private field for the dependency to define the constructor
	private FortuneService fortuneService;
	
	//parameterized constructor for constructor injection
	public HockeyCoach(FortuneService fortuneService) 
	{
		System.out.println("HockeyCoach: parameterized constructor for constructor injection");
		this.fortuneService=fortuneService;
	}
	
	//setter method for setter injection
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("HockeyCoach: setter method implementation for setter injection");
		this.fortuneService = fortuneService;
	}
	
	/*for setter injection we have to create a no-args constructor .Since object gets created using 
	default constructor here, so without any dependency injection object gets created here. */
	public HockeyCoach() 
	{
		System.out.println("HockeyCoach: No-args constructor for setter method to do setter injection");
	}

	@Override
	public String getDailyWorkout()
	{
		return "practice in field";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}
}
