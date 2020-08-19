package com.org.SetterInjection;

public class FootballCoach  implements Coach
{
	//define a private field for the dependency to define the constructor
	private FortuneService fortuneService;
	
	//parameterized constructor for constructor injection
	public FootballCoach(FortuneService fortuneService) 
	{
		System.out.println("FootballCoach: parameterized Constructor for constructor injection");
		this.fortuneService=fortuneService;
	}
		
	//setter method implementation for setter injection purpose
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("FootballCoach: setter method implementation for setter injection");
		this.fortuneService = fortuneService;
	}
	
	/*for setter injection we have to create a no-args constructor .Since object gets created using 
	default constructor here, so without any dependency injection object gets created here. */
	public FootballCoach() 
	{
		System.out.println("FootballCoach: No-args constructor for setter method to do setter injection");
	}

	@Override
	public String getDailyFortune() 
	{
		return "Just do it: "+fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "try to goal within 30 minutes";
	}
}

// We can use either constructor injection or setter injection at a time, can't use both at a time