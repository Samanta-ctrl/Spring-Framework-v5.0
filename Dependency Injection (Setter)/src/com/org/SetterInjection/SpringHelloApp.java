package com.org.SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp 
{
	public static void main(String[] args)
	{
	//load the spring configuration file
		
		//in the constructor we pass the actual name of config file.
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
	//retrieve the bean from spring container 
		Coach ch=context.getBean("myCoach",Coach.class); // mow this bean has some dependencies on FortuneService
														//it actually injects the FortuneService onto the bean. 
														//So when we get the bean, we actually get the bean fully assembled.
		
	//call method on the bean
		System.out.println(ch.getDailyWorkout());
	
		
	//call another method for FortuneService
		System.out.println(ch.getDailyFortune());
		
	//close the context as it is costly resource
		context.close();
		
	}
}
