package com.SixthSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("1");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/FifthSpringProject/SpringConfig.xml");
		System.out.println("2");
		((AbstractApplicationContext)context).registerShutdownHook();
		System.out.println("3");
		Restaurant restaurant1 = (Restaurant) context.getBean("restaurantBean");
		System.out.println("4");
		restaurant1.greetCustomer();
		System.out.println("5");
	}
}
