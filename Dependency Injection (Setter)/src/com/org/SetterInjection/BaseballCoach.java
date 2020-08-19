package com.org.SetterInjection;

public class BaseballCoach implements Coach
{
	//define a private field for the dependency to define the constructor
	private FortuneService fortuneService;
	
	//parameterized constructor for constructor injection
	public BaseballCoach(FortuneService fortuneService)
	{
		System.out.println("BaseballCoach: parameterized constructor for contructor injection");
		this.fortuneService=fortuneService;
	}
	
	//setter method implementation for setter injection purpose
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("BaseballCoach: setter method implementation for setter injection");
		this.fortuneService = fortuneService;
	}
	
	/*for setter injection we have to create a no-args constructor .Since object gets created using 
	default constructor here, so without any dependency injection object gets created here. */
	 public BaseballCoach() 
	{
		 System.out.println("BaseballCoach: No-args constructor for setter method to do setter injection");
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 minuits on batting practice";
	}

	@Override
	public String getDailyFortune() 
	{
		//use my FortuneService to give a fortune
		return fortuneService.getFortune();
	}
}
