package com.org.SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo 
{
	public static void main(String[] args) 
	{
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the spring container
		CricketCoach cch=context.getBean("myCricketCoach",CricketCoach.class); // in parameter we give bean id name and Class name
		
		//call methods on the beam
		System.out.println(cch.getDailyFortune());
		
		System.out.println(cch.getDailyWorkout());
		
		//call new methods to get the literal values
		System.out.println("Coach email id: "+cch.getEmailAddress());
		
		System.out.println("Team: "+cch.getTeam());
		
		//close the context
		context.close();
	
	}
}
