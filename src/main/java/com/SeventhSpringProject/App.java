package com.SeventhSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/SeventhSpringProject/SpringConfig.xml");
	
		((AbstractApplicationContext)context).registerShutdownHook();
	
		Restaurant restaurant1 = (Restaurant) context.getBean("restaurantBean");

		restaurant1.greetCustomer();

	}
}
