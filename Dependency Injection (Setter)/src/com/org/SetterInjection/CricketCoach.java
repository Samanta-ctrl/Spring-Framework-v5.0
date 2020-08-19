package com.org.SetterInjection;

public class CricketCoach implements Coach
{
	//define a private field for the dependency to define the constructor
	private FortuneService fortuneService; //We create FortuneService type property here
	
	//adding new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	//generating setter method 
	public String getEmailAddress() 
	{
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) 
	{
		System.out.println("CricketCoach: Setter method- setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() 
	{
		return team;
	}

	public void setTeam(String team)
	{
		System.out.println("CricketCoach: Setter method- setTeam");
		this.team = team;
	}

	//Spring will call this constructor when they make a reference to our bean.
	public CricketCoach(FortuneService fortuneService) //default constructor/ no-args constructor for constructor injection
	{
		System.out.println("CricketCoach: parameterized constructor for constructor injection");
	}
	
	
	//create a setter method in your class for injections
	//setter method will call by Spring when they are actually inject the dependency.
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("CricketCoach: Setter method implementation for setter injection");
		this.fortuneService = fortuneService;
	}

	/*for setter injection we have to create a no-args constructor .Since object gets created using 
	default constructor here, so without any dependency injection object gets created here. */
	public CricketCoach() 
	{
		System.out.println("CricketCoach: No-args constructor for setter method to do setter injection");
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "practice fast bowling in net and then do an YOYO test";
	}

	@Override
	public String getDailyFortune() 
	{
		return  "Just do it: "+fortuneService.getFortune();
	}
}
