package com.org.SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp 
{
	public static void main(String[] args) 
	{
		//load the spring configuration
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml"); //our new config file
		
		//retrieve bean from the  spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		//check if they are same beans or not
		boolean result = (theCoach == alphaCoach);
		
		//print the results and also print the memory location 
		System.out.println("Is it pointing to the same object? : "+result);
		
		System.out.println("\n Memory location for theCoach: "+theCoach);
		
		System.out.println("\n Memory location for alphaCoach: "+alphaCoach);
		
		//close the context
		context.close();
		
	}
}
